/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import com.mysql.jdbc.Connection;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thanh Thu
 */
public class DataTable {
    
    private ArrayList<Object> data;
    private int ColumnCount;
    private int RowCount;
    private InputStream hinh[];
    private ResultSet rs;
    String query;
    String host;
    String db;
    String user;
    String pass;
    
    String hostOnline = "sql12.freemysqlhosting.net";
    String dbOnline = "sql12202919";
    String userOnline = "sql12202919";
    String passOnline = "Ft4ZH5BaSA";
    
    private static ArrayList<DataTable> ListInstanceDB = new ArrayList<>();
    
    public DataTable(String host, String db, String table, int c, boolean using_image) throws ClassNotFoundException, SQLException
    {
        data = new ArrayList<>();
        ColumnCount = c;
        
        this.host = host;
        this.db = db;
        this.user = "root";
        this.pass = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + this.host +"/" + this.db, user, pass);
        
        query = "Select * from " + table + ";";
        
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
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
        
        if(using_image)
        {
            hinh = new InputStream[RowCount];
            int i = 0;
            rs.beforeFirst();
            while(rs.next())
            {
                hinh[i] = rs.getBinaryStream("hinh");
                i++;
            }
        }
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
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + this.host +"/" + this.db, user, pass);
        
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
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
    
    public InputStream getImage(int index)
    {
        return hinh[index];
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
        int id = 0;
        if(RowCount > 0)
        id = rs.getInt(index_of_id) + 1;
        
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
            ListInstanceDB.get(i).rs.close();
            ListInstanceDB.get(i).UpdateNewData();
        }
    }
    
    public void UpdateNewData() throws ClassNotFoundException, SQLException
    {
        data.clear();
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + this.host +"/" + this.db, user, pass);
        
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
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
}
