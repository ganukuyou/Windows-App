/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.SQLException;

/**
 *
 * @author Thanh Thu
 */
public class PanelQuanLyKhachHang extends javax.swing.JPanel {
//tao layout chuyen giao dien
    GridBagLayout layout=new GridBagLayout();
    panelQuanLyKhachHang_DanhSach pQuanLyKhachHang_DanhSach;
    panelQuanLyKhachHang_ChinhSuaThemMoi pQuanLyKhachHang_ChinhSuaThemMoi;
    
    private DataTable KHTable;
    
    public PanelQuanLyKhachHang() throws ClassNotFoundException, SQLException {
        initComponents();
        
        KHTable = new DataTable("localhost", "clock", "khachhang", 4, false);
        
        pQuanLyKhachHang_DanhSach=new panelQuanLyKhachHang_DanhSach();
        pQuanLyKhachHang_ChinhSuaThemMoi=new panelQuanLyKhachHang_ChinhSuaThemMoi();
        layoutQuanLyKhachHang.setLayout(layout);
        //them 2 panel vao grid
        GridBagConstraints grid=new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        layoutQuanLyKhachHang.add(pQuanLyKhachHang_DanhSach,grid);
        grid.gridx=0;
        grid.gridy=0;
        layoutQuanLyKhachHang.add(pQuanLyKhachHang_ChinhSuaThemMoi,grid);
        pQuanLyKhachHang_ChinhSuaThemMoi.setVisible(false);
        pQuanLyKhachHang_DanhSach.setVisibleAndLoadData(true, KHTable);//cho hien thi giao dien nay dau tien
        btnDanhSachKhachHang.setBackground(Color.decode("#55a996"));//thiet lap mau sac khi nhan vao
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnDanhSachKhachHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnChinhSuaThemMoiKhachHnag = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        layoutQuanLyKhachHang = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(741, 550));
        setMinimumSize(new java.awt.Dimension(741, 550));
        setPreferredSize(new java.awt.Dimension(741, 550));

        jPanel2.setMaximumSize(new java.awt.Dimension(745, 630));
        jPanel2.setMinimumSize(new java.awt.Dimension(745, 630));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(85, 169, 150));

        btnDanhSachKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnDanhSachKhachHang.setFocusCycleRoot(true);
        btnDanhSachKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDanhSachKhachHangMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Danh Sách Khách Hàng");

        btnChinhSuaThemMoiKhachHnag.setBackground(new java.awt.Color(255, 255, 255));
        btnChinhSuaThemMoiKhachHnag.setFocusCycleRoot(true);
        btnChinhSuaThemMoiKhachHnag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChinhSuaThemMoiKhachHnagMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Chỉnh Sửa-Thêm Mới");

        javax.swing.GroupLayout btnChinhSuaThemMoiKhachHnagLayout = new javax.swing.GroupLayout(btnChinhSuaThemMoiKhachHnag);
        btnChinhSuaThemMoiKhachHnag.setLayout(btnChinhSuaThemMoiKhachHnagLayout);
        btnChinhSuaThemMoiKhachHnagLayout.setHorizontalGroup(
            btnChinhSuaThemMoiKhachHnagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnChinhSuaThemMoiKhachHnagLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(108, 108, 108))
        );
        btnChinhSuaThemMoiKhachHnagLayout.setVerticalGroup(
            btnChinhSuaThemMoiKhachHnagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnChinhSuaThemMoiKhachHnagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout btnDanhSachKhachHangLayout = new javax.swing.GroupLayout(btnDanhSachKhachHang);
        btnDanhSachKhachHang.setLayout(btnDanhSachKhachHangLayout);
        btnDanhSachKhachHangLayout.setHorizontalGroup(
            btnDanhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDanhSachKhachHangLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(btnChinhSuaThemMoiKhachHnag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnDanhSachKhachHangLayout.setVerticalGroup(
            btnDanhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnChinhSuaThemMoiKhachHnag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btnDanhSachKhachHangLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layoutQuanLyKhachHang.setBackground(new java.awt.Color(85, 169, 150));
        layoutQuanLyKhachHang.setMaximumSize(new java.awt.Dimension(741, 550));
        layoutQuanLyKhachHang.setMinimumSize(new java.awt.Dimension(741, 550));
        layoutQuanLyKhachHang.setPreferredSize(new java.awt.Dimension(741, 550));

        javax.swing.GroupLayout layoutQuanLyKhachHangLayout = new javax.swing.GroupLayout(layoutQuanLyKhachHang);
        layoutQuanLyKhachHang.setLayout(layoutQuanLyKhachHangLayout);
        layoutQuanLyKhachHangLayout.setHorizontalGroup(
            layoutQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layoutQuanLyKhachHangLayout.setVerticalGroup(
            layoutQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(layoutQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(layoutQuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDanhSachKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhSachKhachHangMouseClicked
        // Cai dathien thi cho nut DanhSachKhachHang
        pQuanLyKhachHang_ChinhSuaThemMoi.setVisible(false);
        pQuanLyKhachHang_DanhSach.setVisibleAndLoadData(true, KHTable);
        btnDanhSachKhachHang.setBackground(Color.decode("#55a996"));
        btnChinhSuaThemMoiKhachHnag.setBackground(Color.decode("#FFFFFF"));
        
    }//GEN-LAST:event_btnDanhSachKhachHangMouseClicked

    private void btnChinhSuaThemMoiKhachHnagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChinhSuaThemMoiKhachHnagMouseClicked
        // Cai dathien thi cho nut Chinh sua them moi
        pQuanLyKhachHang_ChinhSuaThemMoi.setVisibleAndLoadData(true);
        pQuanLyKhachHang_DanhSach.setVisible(false);
        btnDanhSachKhachHang.setBackground(Color.decode("#FFFFFF"));
        btnChinhSuaThemMoiKhachHnag.setBackground(Color.decode("#55a996"));
        
    }//GEN-LAST:event_btnChinhSuaThemMoiKhachHnagMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnChinhSuaThemMoiKhachHnag;
    private javax.swing.JPanel btnDanhSachKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel layoutQuanLyKhachHang;
    // End of variables declaration//GEN-END:variables
}
