/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.Point;
import javax.swing.JFrame;


public class GiaoDienKyThuat extends javax.swing.JFrame {
    //khai bao cac layout
    GridBagLayout layout=new GridBagLayout();
    PanelLichSuBaoHanh panelLichSuBaoHanh;
    PanelTiepNhanBaoHanh panelTiepNhanBaoHanh;
    
    
    public GiaoDienKyThuat() {
        initComponents();
        centerFrame();//goi ham set vi tri layout
        panelLichSuBaoHanh=new PanelLichSuBaoHanh();
        panelTiepNhanBaoHanh=new PanelTiepNhanBaoHanh();
        layoutLichSuBaoHanhThayThe.setLayout(layout);
        //Gan Panel vao layout
        GridBagConstraints grid=new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        layoutLichSuBaoHanhThayThe.add(panelLichSuBaoHanh,grid);
        grid.gridx=0;
        grid.gridy=0;
        layoutLichSuBaoHanhThayThe.add(panelTiepNhanBaoHanh,grid);
        //Cai dat hien thi cho panel
        panelLichSuBaoHanh.setVisible(true);//layout mac dinh khi khoi dong he thong
       panelTiepNhanBaoHanh.setVisible(false);
        
         btnLichSuBaoHanh.setBackground(Color.decode("#55a996"));
         
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        layoutLichSuBaoHanhThayThe = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnLichSuBaoHanh = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTiepNhanBaoHanh = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1030, 610));
        setMinimumSize(new java.awt.Dimension(1030, 610));
        setPreferredSize(new java.awt.Dimension(1030, 610));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 610));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 610));

        layoutLichSuBaoHanhThayThe.setBackground(new java.awt.Color(255, 255, 255));
        layoutLichSuBaoHanhThayThe.setMaximumSize(new java.awt.Dimension(741, 550));
        layoutLichSuBaoHanhThayThe.setMinimumSize(new java.awt.Dimension(741, 550));
        layoutLichSuBaoHanhThayThe.setPreferredSize(new java.awt.Dimension(741, 550));

        btnDangXuat.setBackground(new java.awt.Color(0, 51, 51));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Đăng Xuất");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N

        javax.swing.GroupLayout btnDangXuatLayout = new javax.swing.GroupLayout(btnDangXuat);
        btnDangXuat.setLayout(btnDangXuatLayout);
        btnDangXuatLayout.setHorizontalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDangXuatLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDangXuatLayout.setVerticalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btnDangXuatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ABC CLOCK");

        btnLichSuBaoHanh.setBackground(new java.awt.Color(0, 51, 51));
        btnLichSuBaoHanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLichSuBaoHanhMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/time.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lịch Sử Bảo Hành");

        javax.swing.GroupLayout btnLichSuBaoHanhLayout = new javax.swing.GroupLayout(btnLichSuBaoHanh);
        btnLichSuBaoHanh.setLayout(btnLichSuBaoHanhLayout);
        btnLichSuBaoHanhLayout.setHorizontalGroup(
            btnLichSuBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLichSuBaoHanhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );
        btnLichSuBaoHanhLayout.setVerticalGroup(
            btnLichSuBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLichSuBaoHanhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLichSuBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnTiepNhanBaoHanh.setBackground(new java.awt.Color(0, 51, 51));
        btnTiepNhanBaoHanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiepNhanBaoHanhMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contract.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiếp Nhận Bảo Hành");

        javax.swing.GroupLayout btnTiepNhanBaoHanhLayout = new javax.swing.GroupLayout(btnTiepNhanBaoHanh);
        btnTiepNhanBaoHanh.setLayout(btnTiepNhanBaoHanhLayout);
        btnTiepNhanBaoHanhLayout.setHorizontalGroup(
            btnTiepNhanBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTiepNhanBaoHanhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
        );
        btnTiepNhanBaoHanhLayout.setVerticalGroup(
            btnTiepNhanBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTiepNhanBaoHanhLayout.createSequentialGroup()
                .addGroup(btnTiepNhanBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLichSuBaoHanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTiepNhanBaoHanh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layoutLichSuBaoHanhThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnLichSuBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTiepNhanBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layoutLichSuBaoHanhThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//ham thiet lap giao dien  giua man hinh
    private void centerFrame() {

            Dimension windowSize = getSize();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Point centerPoint = ge.getCenterPoint();

            int dx = centerPoint.x - windowSize.width / 2;
            int dy = centerPoint.y - windowSize.height / 2;    
            setLocation(dx, dy);
    }
    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked

        JFrame.getFrames()[0].setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnLichSuBaoHanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichSuBaoHanhMouseClicked
        // cai dat su kien hien thi cho nut Lich Su Bao Hanh
        
        btnLichSuBaoHanh.setBackground(Color.decode("#55a996"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        panelLichSuBaoHanh.setVisible(true);
        panelTiepNhanBaoHanh.setVisible(false);
    }//GEN-LAST:event_btnLichSuBaoHanhMouseClicked

    private void btnTiepNhanBaoHanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiepNhanBaoHanhMouseClicked
       // cai dat su kien hien thi cho nut TiepNhanbaoHanh
        
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#55a996"));
        panelLichSuBaoHanh.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(true);
    }//GEN-LAST:event_btnTiepNhanBaoHanhMouseClicked

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienKyThuat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JPanel btnLichSuBaoHanh;
    private javax.swing.JPanel btnTiepNhanBaoHanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel layoutLichSuBaoHanhThayThe;
    // End of variables declaration//GEN-END:variables
}
