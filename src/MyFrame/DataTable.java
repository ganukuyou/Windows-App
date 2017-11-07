/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import com.mysql.jdbc.Connection;
import java.io.InputStream;
import java.sql.Array;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thanh Thu
 */
public class DataTable {
    
    private ArrayList<Object> data;
    private int ColumnCount;
    private int RowCount;
    private ResultSet rs;
    private Connection con;
    private Statement st;
    String query;
    String host;
    String db;
    String user;
    String pass;
    boolean isUsingImage = false;
    
    String hostOnline = "sql12.freemysqlhosting.net";
    String dbOnline = "sql12202919";
    String userOnline = "sql12202919";
    String passOnline = "Ft4ZH5BaSA";
    
    private static ArrayList<DataTable> ListInstanceDB = new ArrayList<>();
    
    public DataTable(String host, String db, String table, int c) throws ClassNotFoundException, SQLException
    {
        data = new ArrayList<>();
        ColumnCount = c;
        
        this.host = host;
        this.db = db;
        this.user = "root";
        this.pass = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        con= (Connection) DriverManager.getConnection("jdbc:mysql://" + this.host +"/" + this.db, user, pass);
        
        query = "Select * from " + table + ";";
        
        st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                            ResultSet.CONCUR_UPDATABLE);
        
        rs = st.executeQuery(query);
        
        
        while(rs.next())
        {
            for(int i = 1; i <= c; i++)
            {
                data.add(rs.getObject(i));
            }
        }
        
        RowCount = data.size() / c;
        
        rs.beforeFirst();
        ListInstanceDB.add(this);
    }
    

    
    public DataTable(String host, String db, int c, String query) throws ClassNotFoundException, SQLException
    {
        if(data == null)
        {
            data = new ArrayList<>();
        }
        
        data.clear();
        ColumnCount = c;
        
        this.query = query;
        this.host = host;
        this.db = db;
        this.user = "root";
        this.pass = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        con= (Connection) DriverManager.getConnection("jdbc:mysql://" + this.host + "/" + this.db, user, pass);
        
        st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                            ResultSet.CONCUR_UPDATABLE);
        
        rs = st.executeQuery(this.query);
        
        while(rs.next())
        {
            for(int i = 1; i <= c; i++)
            {
                data.add(rs.getObject(i));
            }
        }
        RowCount = data.size() / c;
        
        
        rs.beforeFirst();
        ListInstanceDB.add(this);
    }
    
    public Object[] getRow(int i)
    {   
        if(i > RowCount - 1)
            return null;
        
        Object o[] = new Object[ColumnCount];
        
        for(int j = 0; j < ColumnCount; j++)
        {
            o[j] = data.get(j + i*ColumnCount);
        }
            
        return o;
    }
    
    public Object[] getColumn(int i)
    {   
        if(i > ColumnCount - 1)
            return null;
        
        Object o[] = new Object[RowCount];
        
        for(int j = 0; j < RowCount; j++)
        {
            o[j] = data.get(i + j*ColumnCount);
        }
            
        return o;
    }
    
    public Object[][] getTable()
    {
        Object o[][] = new Object[RowCount][ColumnCount];
        
        for(int i = 0; i < RowCount; i ++)
        {
            for(int j = 0; j < ColumnCount; j++)
            {
                o[i][j] = data.get(ColumnCount * i + j);
            }
        }
        
        return o;
    }

    public int getRowCount()
    {
        return RowCount;
    }
    
    public InputStream getImage(int index) throws SQLException
    {
        int i = 0;
        rs.beforeFirst();
        while(rs.next())
        {
            if(index == i)
            return rs.getBinaryStream("hinh");
            i++;
        }
        return  null;
    }
    
    public boolean UpdateDataTable(int index_of_id, int row, Object newdata[]) throws SQLException
    {
        if(row >= RowCount || newdata.length > ColumnCount)
            return false;
        
        index_of_id += 1;
        for(int i = 0; i <= row; i++)
        {
            rs.next();
        }
        
        for(int i = 1; i <= ColumnCount; i++)
        {
            if(i != index_of_id)
            {
                if(newdata[i - 1] instanceof String)
                {
                    rs.updateNString(i, (String)newdata[i - 1]);
                }
                else 
                {
                    rs.updateObject(i, newdata[i - 1]);
                }
            }
        }
        rs.updateRow();
        rs.beforeFirst();
        RefershData();
        
        return true;
    }
    
    public boolean InsertDataTable(int index_of_id, Object newdata[]) throws SQLException
    {
        if(newdata.length > ColumnCount)
            return false;
        
        index_of_id += 1;
        
        rs.last();
        int id = 1;
        if(RowCount > 0 && index_of_id > 0)
        {
            id = rs.getInt(index_of_id) + 1;
        }
        
        if(index_of_id == 0)
        {
            index_of_id = 0;
            id = (int)newdata[index_of_id];
            index_of_id+=1;
        }
            
        
        rs.moveToInsertRow();
        rs.updateInt(index_of_id, id);
        
        for(int i = 1; i <= ColumnCount; i++)
        {
            if(i != index_of_id)
            {
                if(newdata[i - 1] instanceof String)
                {
                    rs.updateNString(i, newdata[i - 1].toString());
                }
                else 
                {
                    rs.updateObject(i, newdata[i - 1]);
                }
            }
            
        }
        rs.insertRow();
        rs.beforeFirst();
        RefershData();
        
        return true;
    }
    
    public void InsertDataTableForImage(Object newdata[], InputStream x, int tonkho) throws SQLException
    {
        if(newdata.length > ColumnCount)
            return;

        
        String q = "Insert into dongho(seri, idtt, modelid, idnv, gia, mieuta, hinh, ngaynhap) Values(?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setNString(1, newdata[0].toString());
        ps.setInt(2, Integer.parseInt(newdata[1].toString()));
        ps.setNString(3, newdata[2].toString());
        ps.setInt(4, Integer.parseInt(newdata[3].toString()));
        ps.setInt(5, Integer.parseInt(newdata[4].toString()));
        ps.setNString(6, newdata[5].toString());
        ps.setBlob(7, x);
        ps.setObject(8, newdata[7]);
        ps.executeUpdate();
        
        String q1 = "Update model Set tonkho = ? Where modelid = '" + newdata[2].toString() + "';";
        PreparedStatement ps1 = con.prepareStatement(q1);
        ps1.setInt(1, tonkho + 1);
        ps1.executeUpdate();
        RefershData();
        
        ps.close();;
        ps1.close();
    }
    
    public boolean InsertDataTable(Object newdata[]) throws SQLException
    {
        if(newdata.length > ColumnCount)
            return false;
            
        
        rs.moveToInsertRow();
        rs.updateString(1, newdata[0].toString());
        
        for(int i = 2; i <= ColumnCount; i++)
        {
            if (newdata[i - 1] instanceof String) 
            {
                rs.updateNString(i, newdata[i - 1].toString());
            } 
            else 
            {
                rs.updateObject(i, newdata[i - 1]);
            }
        }
        rs.insertRow();
        rs.beforeFirst();
        RefershData();
        return true;
    }
    
    public boolean DeleteDataTable(int row) throws SQLException
    {
        if(row >= RowCount)
            return false;
        
        for(int i = 0; i <= row; i++)
        {
            rs.next();
        }
        
        rs.deleteRow();
        rs.beforeFirst();
        RefershData();
        return true;
    }
    
    public static void UpdateAllInstance() throws ClassNotFoundException, SQLException
    {
        for(int i = 0; i < ListInstanceDB.size(); i++)
        {
            ListInstanceDB.get(i).con.close();
            ListInstanceDB.get(i).st.close();
            ListInstanceDB.get(i).rs.close();
            ListInstanceDB.get(i).UpdateNewData();
        }
    }
    
    public void UpdateNewData() throws ClassNotFoundException, SQLException
    {
        data.clear();
        
        Class.forName("com.mysql.jdbc.Driver");
        con= (Connection) DriverManager.getConnection("jdbc:mysql://" + this.host +"/" + this.db, user, pass);
        
        st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                            ResultSet.CONCUR_UPDATABLE);
        
        rs = st.executeQuery(query);
        
        while(rs.next())
        {
            for(int i = 1; i <= ColumnCount; i++)
            {
                data.add(rs.getObject(i));
            }
        }
        RowCount = data.size() / ColumnCount;
        
        rs.beforeFirst();
    }
    
    public void RefershData() throws SQLException
    {
        data.clear();
        while(rs.next())
        {
            for(int i = 1; i <= ColumnCount; i++)
            {
                data.add(rs.getObject(i));
            }
        }
        RowCount = data.size() / ColumnCount;
        
        rs.beforeFirst();
    }
    
    public String toString(int row, String s[])
    {
      String s1 = "";
      
      Object r[] = this.getRow(row);
      
      for(int i = 0; i < r.length; i++)
      {
          s1 += s[i] + ": ";
          s1 += r[i].toString();
          
          if(i < r.length - 1)
          {
              s1 += " - ";
          }
              
      }
      
      return s1;
    }
    
    public static void UpdateModelTonKho(String host, String db, String user, String pass, int ID, int TonKho) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + host +"/" + db, user, pass);
        String query = "Update model Set tonkho = ? where modelid = ?;";
        PreparedStatement updateEXP = con.prepareStatement(query);
        
        updateEXP.setInt(1, TonKho);
        updateEXP.setInt(2, ID);
        updateEXP.executeUpdate();
        
        updateEXP.close();
        con.close();
    }
}
