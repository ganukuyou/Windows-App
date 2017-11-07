/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;
import java.io.FileInputStream;
import java.io.FileOutputStream;  
import java.io.InputStream;
import java.io.OutputStream;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;
import java.util.HashMap;  
import java.util.Hashtable;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Immortal
 */
//Report Don Dat Hang
public class ReportDatHang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/clock","root","");
            System.out.println(conn);
            JasperReport report = JasperCompileManager.compileReport("src/MyFrame/DonDatHang.jrxml");
            InputStream is = new FileInputStream("src/MyFrame/DonDatHang.jasper");
            Hashtable hash = new Hashtable();
            hash.put("IDDH", Integer.parseInt(args[0]));
            
            JasperPrint print = JasperFillManager.fillReport(report,hash, conn);
            JasperViewer.viewReport(print);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
