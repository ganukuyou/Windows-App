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
    
    public DataTable(String host, String db, String table, int c, boolean using_image) throws ClassNotFoundException, SQLException
    {
        data = new ArrayList<>();
        ColumnCount = c;
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + host +"/" + db, "root", "");
        
        String q = "Select * from " + table + ";";
        
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                            ResultSet.CONCUR_UPDATABLE);
        
        rs = st.executeQuery(q);
        
        
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
    }
    

    
    public DataTable(String host, String db, int c, String query) throws ClassNotFoundException, SQLException
    {
        data = new ArrayList<>();
        ColumnCount = c;
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + host +"/" + db, "root", "");
        
        Statement st = con.createStatement();
        
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
    
    public boolean UpdateDataTable(int row, Object newdata[]) throws SQLException
    {
        if(row >= RowCount || newdata.length > ColumnCount)
            return false;
        
        for(int i = 0; i <= row; i++)
        {
            rs.next();
        }
        
        for(int i = 0; i < ColumnCount; i++)
        {
            rs.updateObject(i, newdata[i]);
        }
        rs.updateRow();
        
        rs.beforeFirst();
        
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
    
    
    private void RefershData() throws SQLException
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
}
