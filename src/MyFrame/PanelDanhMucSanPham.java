/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author Thanh Thu
 */
public class PanelDanhMucSanPham extends javax.swing.JPanel {
//tao layout chuyen giao dien
    GridBagLayout layout=new GridBagLayout();
    panelDanhMucSanPham_SanPham panelSP;
    panelDanhMucSanPham_BangGia panelBangGia;
    panelDanhMucSanPham_KhoHang panelKhoHang;
    panelDanhMucSanPham_BanHang panelBanhang;
    public PanelDanhMucSanPham() {
        initComponents();
        panelSP=new panelDanhMucSanPham_SanPham();
        panelBangGia=new panelDanhMucSanPham_BangGia();
        panelBanhang=new panelDanhMucSanPham_BanHang();
        panelKhoHang=new panelDanhMucSanPham_KhoHang();
        layoutDanhMucSanPham.setLayout(layout);
        //them 2 panel vao grid
        GridBagConstraints grid=new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        layoutDanhMucSanPham.add(panelSP,grid);
        grid.gridx=0;
        grid.gridy=0;
        layoutDanhMucSanPham.add(panelBangGia,grid);
        grid.gridx=0;
        grid.gridy=0;
        layoutDanhMucSanPham.add(panelKhoHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        layoutDanhMucSanPham.add(panelBanhang,grid);
        panelSP.setVisible(true);
        panelBangGia.setVisible(false);
        panelBanhang.setVisible(false);
        panelKhoHang.setVisible(false);
        btnQuanLySanPham.setBackground(Color.decode("#FFFFFF"));
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnQuanLySanPham = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnKhoHang = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnbanHang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnbangGia = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        layoutDanhMucSanPham = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(745, 630));
        setMinimumSize(new java.awt.Dimension(745, 630));
        setPreferredSize(new java.awt.Dimension(745, 630));

        jPanel2.setBackground(new java.awt.Color(85, 169, 150));

        btnQuanLySanPham.setBackground(new java.awt.Color(85, 169, 150));
        btnQuanLySanPham.setFocusCycleRoot(true);
        btnQuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLySanPhamMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/001-clock.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quản Lý Sản Phẩm");

        javax.swing.GroupLayout btnQuanLySanPhamLayout = new javax.swing.GroupLayout(btnQuanLySanPham);
        btnQuanLySanPham.setLayout(btnQuanLySanPhamLayout);
        btnQuanLySanPhamLayout.setHorizontalGroup(
            btnQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnQuanLySanPhamLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 26, Short.MAX_VALUE))
            .addGroup(btnQuanLySanPhamLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnQuanLySanPhamLayout.setVerticalGroup(
            btnQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnQuanLySanPhamLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnKhoHang.setBackground(new java.awt.Color(85, 169, 150));
        btnKhoHang.setFocusCycleRoot(true);
        btnKhoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhoHangMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Kho hàng");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/004-internet.png"))); // NOI18N

        javax.swing.GroupLayout btnKhoHangLayout = new javax.swing.GroupLayout(btnKhoHang);
        btnKhoHang.setLayout(btnKhoHangLayout);
        btnKhoHangLayout.setHorizontalGroup(
            btnKhoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKhoHangLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnKhoHangLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(43, 43, 43))
        );
        btnKhoHangLayout.setVerticalGroup(
            btnKhoHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnKhoHangLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        btnbanHang.setBackground(new java.awt.Color(85, 169, 150));
        btnbanHang.setFocusCycleRoot(true);
        btnbanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbanHangMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Bán Hàng");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/002-market.png"))); // NOI18N

        javax.swing.GroupLayout btnbanHangLayout = new javax.swing.GroupLayout(btnbanHang);
        btnbanHang.setLayout(btnbanHangLayout);
        btnbanHangLayout.setHorizontalGroup(
            btnbanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnbanHangLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(btnbanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnbanHangLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnbanHangLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41))))
        );
        btnbanHangLayout.setVerticalGroup(
            btnbanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnbanHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        btnbangGia.setBackground(new java.awt.Color(85, 169, 150));
        btnbangGia.setFocusCycleRoot(true);
        btnbangGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbangGiaMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Bảng Giá");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/003-interface.png"))); // NOI18N

        javax.swing.GroupLayout btnbangGiaLayout = new javax.swing.GroupLayout(btnbangGia);
        btnbangGia.setLayout(btnbangGiaLayout);
        btnbangGiaLayout.setHorizontalGroup(
            btnbangGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnbangGiaLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(btnbangGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnbangGiaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnbangGiaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35))))
        );
        btnbangGiaLayout.setVerticalGroup(
            btnbangGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnbangGiaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnbangGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhoHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbangGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layoutDanhMucSanPham.setBackground(new java.awt.Color(255, 255, 255));
        layoutDanhMucSanPham.setMaximumSize(new java.awt.Dimension(740, 500));
        layoutDanhMucSanPham.setMinimumSize(new java.awt.Dimension(740, 500));
        layoutDanhMucSanPham.setPreferredSize(new java.awt.Dimension(740, 500));

        javax.swing.GroupLayout layoutDanhMucSanPhamLayout = new javax.swing.GroupLayout(layoutDanhMucSanPham);
        layoutDanhMucSanPham.setLayout(layoutDanhMucSanPhamLayout);
        layoutDanhMucSanPhamLayout.setHorizontalGroup(
            layoutDanhMucSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layoutDanhMucSanPhamLayout.setVerticalGroup(
            layoutDanhMucSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(layoutDanhMucSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(layoutDanhMucSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLySanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLySanPhamMouseClicked
        // Cai dathien thi cho nut QUan ly san pham
        panelSP.setVisible(true);
        panelBangGia.setVisible(false);
        panelBanhang.setVisible(false);
        panelKhoHang.setVisible(false);
        btnQuanLySanPham.setBackground(Color.decode("#FFFFFF"));
        btnKhoHang.setBackground(Color.decode("#55a996"));
        btnbanHang.setBackground(Color.decode("#55a996"));
        btnbangGia.setBackground(Color.decode("#55a996"));
    }//GEN-LAST:event_btnQuanLySanPhamMouseClicked

    private void btnKhoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoHangMouseClicked
         // Cai dathien thi cho nut Kho hang
        panelSP.setVisible(false);
        panelBangGia.setVisible(false);
        panelBanhang.setVisible(false);
        panelKhoHang.setVisible(true);
        btnQuanLySanPham.setBackground(Color.decode("#55a996"));
        btnKhoHang.setBackground(Color.decode("#FFFFFF"));
        btnbanHang.setBackground(Color.decode("#55a996"));
        btnbangGia.setBackground(Color.decode("#55a996"));
    }//GEN-LAST:event_btnKhoHangMouseClicked

    private void btnbanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbanHangMouseClicked
         // Cai dathien thi cho nut Ban hang
        panelSP.setVisible(false);
        panelBangGia.setVisible(false);
        panelBanhang.setVisible(true);
        panelKhoHang.setVisible(false);
        btnQuanLySanPham.setBackground(Color.decode("#55a996"));
        btnKhoHang.setBackground(Color.decode("#55a996"));
        btnbanHang.setBackground(Color.decode("#FFFFFF"));
        btnbangGia.setBackground(Color.decode("#55a996"));
    }//GEN-LAST:event_btnbanHangMouseClicked

    private void btnbangGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbangGiaMouseClicked
         // Cai dathien thi cho nut bang Gia
        panelSP.setVisible(false);
        panelBangGia.setVisible(true);
        panelBanhang.setVisible(false);
        panelKhoHang.setVisible(false);
        btnQuanLySanPham.setBackground(Color.decode("#55a996"));
        btnKhoHang.setBackground(Color.decode("#55a996"));
        btnbanHang.setBackground(Color.decode("#55a996"));
        btnbangGia.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnbangGiaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnKhoHang;
    private javax.swing.JPanel btnQuanLySanPham;
    private javax.swing.JPanel btnbanHang;
    private javax.swing.JPanel btnbangGia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel layoutDanhMucSanPham;
    // End of variables declaration//GEN-END:variables
}
