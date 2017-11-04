/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Thanh Thu
 */
public class Model{
    int gia;
    String model;
    BufferedImage hinh;
    int seri;
    public Model(Object[] o, InputStream hinh) throws SQLException, IOException
    {
        this.gia = (int)o[9];
        this.model = o[0].toString() + " - " + o[8].toString();
        this.hinh = ImageIO.read(hinh);
        this.seri = seri;
    }
    
    int getGia()
    {
        return gia;
    }
    
    String getContent()
    {
        return model;
    }
    
    BufferedImage getIcon()
    {
        return hinh;
    }
    
    @Override
    public String toString()
    {
        return model + "-" + String.valueOf(gia) + " (VND)";
    }    
}
