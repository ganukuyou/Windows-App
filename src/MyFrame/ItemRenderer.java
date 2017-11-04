/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Thanh Thu
 */
public class ItemRenderer extends JPanel implements ListCellRenderer<Model> {

    private JLabel lblIcon = new JLabel();
    private JLabel lblGia = new JLabel();
    private JLabel lblContent = new JLabel();
    
    public ItemRenderer()
    {    
        setLayout(new BorderLayout(5, 5));
        lblIcon.setSize(new Dimension(50, 50));
        
        JPanel panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(lblContent);
        panelText.add(lblGia);
        add(lblIcon);
        add(panelText, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Model> jlist, Model e, int i, boolean bln, boolean bln1)
    {
        lblContent.setText(e.getContent());
        lblGia.setText(String.valueOf(e.getGia()));
        
        ImageIcon icon = new ImageIcon(e.getIcon());
        
        Image img = icon.getImage() ;
        Image newimg = img.getScaledInstance( 75, 75,  java.awt.Image.SCALE_SMOOTH ) ;  
        icon = new ImageIcon( newimg );
        
        lblContent.setIcon(icon);
        return this;
    }
    
}
