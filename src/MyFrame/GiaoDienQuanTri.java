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


public class GiaoDienQuanTri extends javax.swing.JFrame {
    //khai bao cac layout
    GridBagLayout layout=new GridBagLayout();
    PaneLichSuBanHang panelLichSuBanHang;
    panelDanhMucSanPham_SanPham panelDanhMucSanPham_SanPham;
    PanelQuanLyKhachHang panelQuanLyKhachHang;
    PanelThongKeDoanhSo panelThongKeDoanhSo;
    //PanelTiepNhanBaoHanh panelTiepNhanBaoHanh;
    //PanelLichSuBaoHanh panelLichSuBaoHanh;
   PanelBaoCaoHangTonKho_BaoCao panelBaoCaoHangTonKho_BaoCao;
    PanelQuanLyNhanVien panelQuanLyNhanVien;
    
    
        
    
    public GiaoDienQuanTri() throws ClassNotFoundException, SQLException, IOException{
        initComponents();
        centerFrame();//goi ham set vi tri layout
        panelDanhMucSanPham_SanPham=new panelDanhMucSanPham_SanPham();
        panelQuanLyKhachHang=new PanelQuanLyKhachHang();
        panelLichSuBanHang=new PaneLichSuBanHang();
        panelThongKeDoanhSo=new PanelThongKeDoanhSo();
        panelBaoCaoHangTonKho_BaoCao=new PanelBaoCaoHangTonKho_BaoCao();
       // panelLichSuBaoHanh=new PanelLichSuBaoHanh();
        panelQuanLyNhanVien=new PanelQuanLyNhanVien();
       // panelTiepNhanBaoHanh=new PanelTiepNhanBaoHanh();
        
        panelThayThe.setLayout(layout);
        //Gan Panel vao layout
        GridBagConstraints grid=new GridBagConstraints();
        // tao layout thay the
        
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelQuanLyKhachHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelDanhMucSanPham_SanPham,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelLichSuBanHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelThongKeDoanhSo,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelBaoCaoHangTonKho_BaoCao,grid);
        
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelQuanLyNhanVien,grid);
        //Cai dat hien thi cho panel
       //layout mac dinh khi khoi dong he thong
        panelLichSuBanHang.setVisible(true);
        panelQuanLyKhachHang.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho_BaoCao.setVisible(false);
       // panelTiepNhanBaoHanh.setVisible(false);
       // panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
        panelDanhMucSanPham_SanPham.setVisibleAndLoadData(true);
        
         btnQuanLySanPham.setBackground(Color.decode("#55a996"));
         
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelThayThe = new javax.swing.JPanel();
        btnQuanLySanPham = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnQuanLyKhachHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLichSuBanhang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnThongKeDoanhSo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnBaoCaoHangTonKho = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnQuanLyNhanVien = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1040, 630));
        setMinimumSize(new java.awt.Dimension(1040, 630));
        setPreferredSize(new java.awt.Dimension(1040, 630));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1040, 630));
        jPanel1.setMinimumSize(new java.awt.Dimension(1040, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 630));

        panelThayThe.setBackground(new java.awt.Color(255, 255, 255));
        panelThayThe.setMaximumSize(new java.awt.Dimension(741, 550));
        panelThayThe.setMinimumSize(new java.awt.Dimension(741, 550));
        panelThayThe.setPreferredSize(new java.awt.Dimension(741, 550));

        btnQuanLySanPham.setBackground(new java.awt.Color(0, 51, 51));
        btnQuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLySanPhamMouseClicked(evt);
            }
        });
        btnQuanLySanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản Lý Sản Phẩm");
        btnQuanLySanPham.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/010-technology.png"))); // NOI18N
        btnQuanLySanPham.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnQuanLyKhachHang.setBackground(new java.awt.Color(0, 51, 51));
        btnQuanLyKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyKhachHangMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Khách Hàng");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/008-profile-1.png"))); // NOI18N

        javax.swing.GroupLayout btnQuanLyKhachHangLayout = new javax.swing.GroupLayout(btnQuanLyKhachHang);
        btnQuanLyKhachHang.setLayout(btnQuanLyKhachHangLayout);
        btnQuanLyKhachHangLayout.setHorizontalGroup(
            btnQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuanLyKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnQuanLyKhachHangLayout.setVerticalGroup(
            btnQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnQuanLyKhachHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnQuanLyKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)))
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
                .addContainerGap()
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnThongKeDoanhSoLayout.setVerticalGroup(
            btnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThongKeDoanhSoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnThongKeDoanhSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
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
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ABC CLOCK");

        btnBaoCaoHangTonKho.setBackground(new java.awt.Color(0, 51, 51));
        btnBaoCaoHangTonKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBaoCaoHangTonKhoMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Báo Cáo Hàng Tồn Kho");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Kho.png"))); // NOI18N

        javax.swing.GroupLayout btnBaoCaoHangTonKhoLayout = new javax.swing.GroupLayout(btnBaoCaoHangTonKho);
        btnBaoCaoHangTonKho.setLayout(btnBaoCaoHangTonKhoLayout);
        btnBaoCaoHangTonKhoLayout.setHorizontalGroup(
            btnBaoCaoHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBaoCaoHangTonKhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(77, 77, 77))
        );
        btnBaoCaoHangTonKhoLayout.setVerticalGroup(
            btnBaoCaoHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBaoCaoHangTonKhoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnBaoCaoHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnQuanLyNhanVien.setBackground(new java.awt.Color(0, 51, 51));
        btnQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyNhanVienMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Quản Lý Nhân Viên");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/008-profile-1.png"))); // NOI18N

        javax.swing.GroupLayout btnQuanLyNhanVienLayout = new javax.swing.GroupLayout(btnQuanLyNhanVien);
        btnQuanLyNhanVien.setLayout(btnQuanLyNhanVienLayout);
        btnQuanLyNhanVienLayout.setHorizontalGroup(
            btnQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuanLyNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        btnQuanLyNhanVienLayout.setVerticalGroup(
            btnQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnQuanLyNhanVienLayout.createSequentialGroup()
                .addGroup(btnQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDangXuatLayout.setVerticalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
            .addComponent(jLabel10)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongKeDoanhSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaoCaoHangTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btnLichSuBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLichSuBanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThongKeDoanhSo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBaoCaoHangTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
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
    
    
    private void btnQuanLySanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLySanPhamMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#55a996"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
       // btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
       // btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
      
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
       
        panelLichSuBanHang.setVisible(false);
        panelDanhMucSanPham_SanPham.setVisibleAndLoadData(true);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho_BaoCao.setVisible(false);
        //panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
       // panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
        
        
    }//GEN-LAST:event_btnQuanLySanPhamMouseClicked

    private void btnQuanLyKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyKhachHangMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#55a996"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
       // btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
       // btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
       // btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham_SanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(true);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho_BaoCao.setVisible(false);
        //panelTiepNhanBaoHanh.setVisible(false);
        
        //panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnQuanLyKhachHangMouseClicked

    private void btnLichSuBanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichSuBanhangMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#55a996"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
       
        try {
            panelLichSuBanHang.setVisibleAndLoadData(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelDanhMucSanPham_SanPham.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho_BaoCao.setVisible(false);
        //panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        //panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnLichSuBanhangMouseClicked

    private void btnThongKeDoanhSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeDoanhSoMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#55a996"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
       
        panelLichSuBanHang.setVisible(false);
       panelDanhMucSanPham_SanPham.setVisible(false);
        try {
            panelThongKeDoanhSo.setVisibleAndLoadData(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelBaoCaoHangTonKho_BaoCao.setVisible(false);
        //panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        //panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnThongKeDoanhSoMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#55a996"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
       // btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
       
        JFrame.getFrames()[0].setVisible(true);
        try {
            DataTable.UpdateAllInstance();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnBaoCaoHangTonKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoHangTonKhoMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#55a996"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
     
        panelLichSuBanHang.setVisible(false);
       panelDanhMucSanPham_SanPham.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho_BaoCao.setVisibleAndLoadData(true);
        //panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        //panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);

    }//GEN-LAST:event_btnBaoCaoHangTonKhoMouseClicked

    private void btnQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        //btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        //btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
       // btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
        btnQuanLyNhanVien.setBackground(Color.decode("#55a996"));
       panelDanhMucSanPham_SanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho_BaoCao.setVisible(false);
        //panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        //panelLichSuBaoHanh.setVisible(false);
        try {
            panelQuanLyNhanVien.setVisibleAndLoadData(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQuanLyNhanVienMouseClicked

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GiaoDienQuanTri().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(GiaoDienQuanTri.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBaoCaoHangTonKho;
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JPanel btnLichSuBanhang;
    private javax.swing.JPanel btnQuanLyKhachHang;
    private javax.swing.JPanel btnQuanLyNhanVien;
    private javax.swing.JPanel btnQuanLySanPham;
    private javax.swing.JPanel btnThongKeDoanhSo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelThayThe;
    // End of variables declaration//GEN-END:variables
}
