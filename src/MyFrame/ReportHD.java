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
import java.net.URL;
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
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Immortal
 */
//Report Hoa Don Ban Hang
public class ReportHD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/clock","root","");
            JasperReport report = JasperCompileManager.compileReport("src/MyFrame/HoaDonBanHang.jrxml");
            InputStream is = new FileInputStream("src/MyFrame/HoaDonBanHang.jasper");
            Hashtable hash = new Hashtable();
            hash.put("IDHD",Integer.parseInt(args[0]));
            
            JasperPrint print = JasperFillManager.fillReport(report,hash, conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
