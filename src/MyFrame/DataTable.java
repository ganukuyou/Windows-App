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
    
    public DataTable(String host, String db, String table, int c, boolean using_image) throws ClassNotFoundException, SQLException
    {
        data = new ArrayList<>();
        ColumnCount = c;
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + host +"/" + db, "root", "");
        
        String q = "Select * from " + table + ";";
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(q);
        
        
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
        
    }
    

    
    public DataTable(String host, String db, int c, String query) throws ClassNotFoundException, SQLException
    {
        data = new ArrayList<>();
        ColumnCount = c;
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://" + host +"/" + db, "root", "");
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next())
        {
            for(int i = 1; i <= c; i++)
            {
                data.add(rs.getObject(i));
            }
        }
        RowCount = data.size() / c;
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
}
