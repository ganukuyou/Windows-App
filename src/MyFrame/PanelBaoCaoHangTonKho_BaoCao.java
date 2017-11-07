/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LOI LOI
 */
public class PanelBaoCaoHangTonKho_BaoCao extends javax.swing.JPanel {

    /**
     * Creates new form PanelBaoCaoHangTonKho_BaoCao
     */
    public PanelBaoCaoHangTonKho_BaoCao() throws ClassNotFoundException, SQLException {
        initComponents();
        LoadDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBaoCaoTon = new javax.swing.JTable();

        setBackground(new java.awt.Color(85, 169, 150));
        setMaximumSize(new java.awt.Dimension(741, 550));
        setMinimumSize(new java.awt.Dimension(741, 550));

        tblBaoCaoTon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Model", "Số lượng bán", "Số lượng tồn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBaoCaoTon.setMaximumSize(new java.awt.Dimension(721, 528));
        tblBaoCaoTon.setMinimumSize(new java.awt.Dimension(721, 528));
        tblBaoCaoTon.setPreferredSize(new java.awt.Dimension(721, 528));
        jScrollPane1.setViewportView(tblBaoCaoTon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoadDB() throws ClassNotFoundException, SQLException
    {
        String q = "Select dh.modelid, count(*) as daban from chitiethd cthd join" + 
                " dongho dh on cthd.seri = dh.seri group by dh.modelid;";
        
        SoLuongBanProfiles = new DataTable("localhost", "clock", 2, q);
        
        
        String q2 = "Select modelid, tonkho from model";
        DSTonProfiles = new DataTable("localhost", "clock", 2, q2);
    }
    
    void setVisibleAndLoadData(boolean b)
    {
        if(!b)
            return;
        
        this.setVisible(b);
        
        Object o[][] = new Object[DSTonProfiles.getRowCount()][3];
        
        for(int i = 0; i < DSTonProfiles.getRowCount(); i++)
        {
            for(int j = 0; j < SoLuongBanProfiles.getRowCount(); j++)
            {
                Object o1[] = DSTonProfiles.getRow(i);
                Object o2[] = SoLuongBanProfiles.getRow(j);
                
                o[i][0] = o1[0];
                o[i][2] = o1[1];
                int slban = 0;
                
                int a = Integer.parseInt(o1[0].toString());
                int c = Integer.parseInt(o2[0].toString());
                
                if(a == c)
                {
                    o[i][1] = Integer.parseInt(o2[1].toString());
                    break;
                }
                else o[i][1] = 0;
            }
        }
        
        DefaultTableModel tModel = (DefaultTableModel)tblBaoCaoTon.getModel();
        String c[] = new String[tModel.getColumnCount()];

        for(int i = 0 ; i < tModel.getColumnCount(); i++)
        {
            c[i] = tModel.getColumnName(i);
        }
        tModel.setDataVector(o, c);
        
        
    }
    
    private DataTable SoLuongBanProfiles;
    private DataTable DSTonProfiles;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBaoCaoTon;
    // End of variables declaration//GEN-END:variables
}
