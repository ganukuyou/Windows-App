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
import java.awt.Point;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class GiaoDienNhanVien extends javax.swing.JFrame {
    //khai bao cac layout
    GridBagLayout layout=new GridBagLayout();
    PaneLichSuBanHang panelLichSuBanHang;
    panelDanhMucSanPham_BanHang panDanhMucSanPham_BanHang;
    PanelQuanLyKhachHang panelQuanLyKhachHang;
    PanelThongKeDoanhSo panelThongKeDoanhSo;
    
        
    
    public GiaoDienNhanVien() throws ClassNotFoundException, SQLException, IOException{
        initComponents();
        centerFrame();//goi ham set vi tri layout
        panDanhMucSanPham_BanHang=new panelDanhMucSanPham_BanHang();
        panelQuanLyKhachHang=new PanelQuanLyKhachHang();
        panelLichSuBanHang=new PaneLichSuBanHang();
        panelThongKeDoanhSo=new PanelThongKeDoanhSo();
        panelTrangChuThayThe.setLayout(layout);
        //Gan Panel vao layout
        GridBagConstraints grid=new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        panelTrangChuThayThe.add(panDanhMucSanPham_BanHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelTrangChuThayThe.add(panelQuanLyKhachHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelTrangChuThayThe.add(panelLichSuBanHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelTrangChuThayThe.add(panelThongKeDoanhSo,grid);
        //Cai dat hien thi cho panel
        panDanhMucSanPham_BanHang.setVisibleAndLoadData(true);//layout mac dinh khi khoi dong he thong
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
        
         btnBanHang.setBackground(Color.decode("#55a996"));
         
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTrangChuThayThe = new javax.swing.JPanel();
        btnBanHang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnThongTinKhachHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLichSuBanhang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnThongKeDoanhSo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 662));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 662));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 662));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 662));

        panelTrangChuThayThe.setBackground(new java.awt.Color(255, 255, 255));
        panelTrangChuThayThe.setMaximumSize(new java.awt.Dimension(741, 550));
        panelTrangChuThayThe.setMinimumSize(new java.awt.Dimension(741, 550));
        panelTrangChuThayThe.setPreferredSize(new java.awt.Dimension(741, 550));

        btnBanHang.setBackground(new java.awt.Color(0, 51, 51));
        btnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBanHangMouseClicked(evt);
            }
        });
        btnBanHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bán Hàng");
        btnBanHang.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Kho.png"))); // NOI18N
        btnBanHang.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnThongTinKhachHang.setBackground(new java.awt.Color(0, 51, 51));
        btnThongTinKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongTinKhachHangMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Khách Hàng");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/008-profile-1.png"))); // NOI18N

        javax.swing.GroupLayout btnThongTinKhachHangLayout = new javax.swing.GroupLayout(btnThongTinKhachHang);
        btnThongTinKhachHang.setLayout(btnThongTinKhachHangLayout);
        btnThongTinKhachHangLayout.setHorizontalGroup(
            btnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThongTinKhachHangLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnThongTinKhachHangLayout.setVerticalGroup(
            btnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThongTinKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnThongTinKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnLichSuBanhang.setBackground(new java.awt.Color(0, 51, 51));
        btnLichSuBanhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLichSuBanhangMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lịch Sử Bán Hàng");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/002-clock.png"))); // NOI18N

        javax.swing.GroupLayout btnLichSuBanhangLayout = new javax.swing.GroupLayout(btnLichSuBanhang);
        btnLichSuBanhang.setLayout(btnLichSuBanhangLayout);
        btnLichSuBanhangLayout.setHorizontalGroup(
            btnLichSuBanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLichSuBanhangLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnLichSuBanhangLayout.setVerticalGroup(
            btnLichSuBanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLichSuBanhangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnLichSuBanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnThongKeDoanhSo.setBackground(new java.awt.Color(0, 51, 51));
        btnThongKeDoanhSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeDoanhSoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Thống Kê Doanh Số");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/001-graphic.png"))); // NOI18N

        javax.swing.GroupLayout btnThongKeDoanhSoLayout = new javax.swing.GroupLayout(btnThongKeDoanhSo);
        btnThongKeDoanhSo.setLayout(btnThongKeDoanhSoLayout);
        btnThongKeDoanhSoLayout.setHorizontalGroup(
            btnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThongKeDoanhSoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnThongKeDoanhSoLayout.setVerticalGroup(
            btnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThongKeDoanhSoLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(btnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13))
        );

        btnDangXuat.setBackground(new java.awt.Color(0, 51, 51));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Đăng Xuất");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/005-close.png"))); // NOI18N

        javax.swing.GroupLayout btnDangXuatLayout = new javax.swing.GroupLayout(btnDangXuat);
        btnDangXuat.setLayout(btnDangXuatLayout);
        btnDangXuatLayout.setHorizontalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDangXuatLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDangXuatLayout.setVerticalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDangXuatLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongKeDoanhSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLichSuBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongTinKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(14, 14, 14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTrangChuThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnThongTinKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnLichSuBanhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnThongKeDoanhSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTrangChuThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

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
    
    
    private void btnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnBanHang.setBackground(Color.decode("#55a996"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnThongTinKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        try {
            panDanhMucSanPham_BanHang.setVisibleAndLoadData(true);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GiaoDienNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
    }//GEN-LAST:event_btnBanHangMouseClicked

    private void btnThongTinKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinKhachHangMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnBanHang.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnThongTinKhachHang.setBackground(Color.decode("#55a996"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        panDanhMucSanPham_BanHang.setVisible(false);
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(true);//Cho phen hien thi panel quan ly khach hang
        panelThongKeDoanhSo.setVisible(false);
    }//GEN-LAST:event_btnThongTinKhachHangMouseClicked

    private void btnLichSuBanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichSuBanhangMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnBanHang.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnThongTinKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#55a996"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        panDanhMucSanPham_BanHang.setVisible(false);
        panelLichSuBanHang.setVisible(true);//Cho phen hien thi panel lich su ban hang
        panelQuanLyKhachHang.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
    }//GEN-LAST:event_btnLichSuBanhangMouseClicked

    private void btnThongKeDoanhSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeDoanhSoMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnBanHang.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#55a996"));
        btnThongTinKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        panDanhMucSanPham_BanHang.setVisible(false);
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        try {
            panelThongKeDoanhSo.setVisibleAndLoadData(true);//Cho phen hien thi panel thong ke doanh so
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThongKeDoanhSoMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnBanHang.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnThongTinKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#55a996"));
        
        JFrame.getFrames()[0].setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnDangXuatMouseClicked

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GiaoDienNhanVien().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GiaoDienNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoDienNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(GiaoDienNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBanHang;
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JPanel btnLichSuBanhang;
    private javax.swing.JPanel btnThongKeDoanhSo;
    private javax.swing.JPanel btnThongTinKhachHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelTrangChuThayThe;
    // End of variables declaration//GEN-END:variables
}
