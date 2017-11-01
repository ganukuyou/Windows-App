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


public class GiaoDienQuanTri extends javax.swing.JFrame {
    //khai bao cac layout
    GridBagLayout layout=new GridBagLayout();
    PaneLichSuBanHang panelLichSuBanHang;
    PanelDanhMucSanPham panelDanhMucSanPham;
    PanelQuanLyKhachHang panelQuanLyKhachHang;
    PanelThongKeDoanhSo panelThongKeDoanhSo;
    PanelTiepNhanBaoHanh panelTiepNhanBaoHanh;
    PanelLichSuBaoHanh panelLichSuBaoHanh;
    PanelBaoCaoHangTonKho panelBaoCaoHangTonKho;
    PanelQuanLyHangTonKho panelQuanLyHangTonKho;
    PanelQuanLyNhanVien panelQuanLyNhanVien;
    
    
        
    
    public GiaoDienQuanTri() throws ClassNotFoundException, SQLException, IOException{
        initComponents();
        centerFrame();//goi ham set vi tri layout
        panelDanhMucSanPham=new PanelDanhMucSanPham();
        panelQuanLyKhachHang=new PanelQuanLyKhachHang();
        panelLichSuBanHang=new PaneLichSuBanHang();
        panelThongKeDoanhSo=new PanelThongKeDoanhSo();
        panelBaoCaoHangTonKho=new PanelBaoCaoHangTonKho();
        panelLichSuBaoHanh=new PanelLichSuBaoHanh();
        panelQuanLyNhanVien=new PanelQuanLyNhanVien();
        panelQuanLyHangTonKho=new PanelQuanLyHangTonKho();
        panelTiepNhanBaoHanh=new PanelTiepNhanBaoHanh();
        
        panelThayThe.setLayout(layout);
        //Gan Panel vao layout
        GridBagConstraints grid=new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelDanhMucSanPham,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelQuanLyKhachHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelLichSuBanHang,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelThongKeDoanhSo,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelBaoCaoHangTonKho,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelQuanLyHangTonKho,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelLichSuBaoHanh,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelTiepNhanBaoHanh,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelThayThe.add(panelQuanLyNhanVien,grid);
        //Cai dat hien thi cho panel
        panelDanhMucSanPham.setVisible(true);//layout mac dinh khi khoi dong he thong
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
        
         btnDanhMucSanPham.setBackground(Color.decode("#55a996"));
         
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelThayThe = new javax.swing.JPanel();
        btnDanhMucSanPham = new javax.swing.JPanel();
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
        btnLichSuBaoHanh = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnTiepNhanBaoHanh = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnQuanLyHangTonKho = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnBaoCaoHangTonKho = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnQuanLyNhanVien = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 662));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1030, 662));
        jPanel1.setMinimumSize(new java.awt.Dimension(1030, 662));
        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 662));

        panelThayThe.setBackground(new java.awt.Color(255, 255, 255));
        panelThayThe.setMaximumSize(new java.awt.Dimension(767, 662));
        panelThayThe.setMinimumSize(new java.awt.Dimension(767, 662));
        panelThayThe.setPreferredSize(new java.awt.Dimension(767, 662));

        btnDanhMucSanPham.setBackground(new java.awt.Color(0, 51, 51));
        btnDanhMucSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDanhMucSanPhamMouseClicked(evt);
            }
        });
        btnDanhMucSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Danh Mục Sản Phẩm");
        btnDanhMucSanPham.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/010-technology.png"))); // NOI18N
        btnDanhMucSanPham.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

        btnLichSuBaoHanh.setBackground(new java.awt.Color(0, 51, 51));
        btnLichSuBaoHanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLichSuBaoHanhMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/time.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Lịch Sử Bảo Hành");

        javax.swing.GroupLayout btnLichSuBaoHanhLayout = new javax.swing.GroupLayout(btnLichSuBaoHanh);
        btnLichSuBaoHanh.setLayout(btnLichSuBaoHanhLayout);
        btnLichSuBaoHanhLayout.setHorizontalGroup(
            btnLichSuBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLichSuBaoHanhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnLichSuBaoHanhLayout.setVerticalGroup(
            btnLichSuBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLichSuBaoHanhLayout.createSequentialGroup()
                .addGroup(btnLichSuBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btnTiepNhanBaoHanh.setBackground(new java.awt.Color(0, 51, 51));
        btnTiepNhanBaoHanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiepNhanBaoHanhMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/contract.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tiếp Nhận Bảo Hành");

        javax.swing.GroupLayout btnTiepNhanBaoHanhLayout = new javax.swing.GroupLayout(btnTiepNhanBaoHanh);
        btnTiepNhanBaoHanh.setLayout(btnTiepNhanBaoHanhLayout);
        btnTiepNhanBaoHanhLayout.setHorizontalGroup(
            btnTiepNhanBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTiepNhanBaoHanhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        btnTiepNhanBaoHanhLayout.setVerticalGroup(
            btnTiepNhanBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTiepNhanBaoHanhLayout.createSequentialGroup()
                .addGroup(btnTiepNhanBaoHanhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnQuanLyHangTonKho.setBackground(new java.awt.Color(0, 51, 51));
        btnQuanLyHangTonKho.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyHangTonKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyHangTonKhoMouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 51, 51));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Quản Lý Hàng Tồn Kho");
        jLabel16.setMaximumSize(new java.awt.Dimension(156, 22));
        jLabel16.setMinimumSize(new java.awt.Dimension(156, 22));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/001-graphic.png"))); // NOI18N

        javax.swing.GroupLayout btnQuanLyHangTonKhoLayout = new javax.swing.GroupLayout(btnQuanLyHangTonKho);
        btnQuanLyHangTonKho.setLayout(btnQuanLyHangTonKhoLayout);
        btnQuanLyHangTonKhoLayout.setHorizontalGroup(
            btnQuanLyHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuanLyHangTonKhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        btnQuanLyHangTonKhoLayout.setVerticalGroup(
            btnQuanLyHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuanLyHangTonKhoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnQuanLyHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDangXuatLayout.setVerticalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDangXuatLayout.createSequentialGroup()
                .addGroup(btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(0, 14, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnQuanLyNhanVienLayout.setVerticalGroup(
            btnQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnQuanLyNhanVienLayout.createSequentialGroup()
                .addGroup(btnQuanLyNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThongKeDoanhSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDanhMucSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaoCaoHangTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLichSuBanhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuanLyKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTiepNhanBaoHanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuanLyHangTonKho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLichSuBaoHanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnDanhMucSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuanLyKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLichSuBanhang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongKeDoanhSo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLichSuBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTiepNhanBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuanLyHangTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBaoCaoHangTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelThayThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    
    private void btnDanhMucSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDanhMucSanPhamMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#55a996"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(true);
        panelLichSuBanHang.setVisible(false);
        
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
        
        
    }//GEN-LAST:event_btnDanhMucSanPhamMouseClicked

    private void btnQuanLyKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyKhachHangMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#55a996"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(true);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnQuanLyKhachHangMouseClicked

    private void btnLichSuBanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichSuBanhangMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#55a996"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(true);
        
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnLichSuBanhangMouseClicked

    private void btnThongKeDoanhSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeDoanhSoMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#55a996"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
       
        panelThongKeDoanhSo.setVisible(true);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnThongKeDoanhSoMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#55a996"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnLichSuBaoHanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichSuBaoHanhMouseClicked
        // cai dat su kien hien thi cho nut Lich Su Bao Hanh

        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#55a996"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
       
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(true);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnLichSuBaoHanhMouseClicked

    private void btnTiepNhanBaoHanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiepNhanBaoHanhMouseClicked
        // cai dat su kien hien thi cho nut TiepNhanbaoHanh

        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#55a996"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
        
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(true);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);
    }//GEN-LAST:event_btnTiepNhanBaoHanhMouseClicked

    private void btnQuanLyHangTonKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyHangTonKhoMouseClicked
       // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#55a996"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
      
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(true);
        panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuanLyHangTonKhoMouseClicked

    private void btnBaoCaoHangTonKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoHangTonKhoMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#55a996"));
       btnQuanLyNhanVien.setBackground(Color.decode("#003333"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
       
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(true);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(false);

    }//GEN-LAST:event_btnBaoCaoHangTonKhoMouseClicked

    private void btnQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnDanhMucSanPham.setBackground(Color.decode("#003333"));
        btnThongKeDoanhSo.setBackground(Color.decode("#003333"));
        btnQuanLyKhachHang.setBackground(Color.decode("#003333"));
        btnLichSuBanhang.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnLichSuBaoHanh.setBackground(Color.decode("#003333"));
        btnTiepNhanBaoHanh.setBackground(Color.decode("#003333"));
        btnQuanLyHangTonKho.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
        btnQuanLyNhanVien.setBackground(Color.decode("#55a996"));
        panelDanhMucSanPham.setVisible(false);
        panelLichSuBanHang.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelThongKeDoanhSo.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelQuanLyHangTonKho.setVisible(false);
        panelTiepNhanBaoHanh.setVisible(false);
        panelQuanLyKhachHang.setVisible(false);
        panelLichSuBaoHanh.setVisible(false);
        panelQuanLyNhanVien.setVisible(true);
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
    private javax.swing.JPanel btnDanhMucSanPham;
    private javax.swing.JPanel btnLichSuBanhang;
    private javax.swing.JPanel btnLichSuBaoHanh;
    private javax.swing.JPanel btnQuanLyHangTonKho;
    private javax.swing.JPanel btnQuanLyKhachHang;
    private javax.swing.JPanel btnQuanLyNhanVien;
    private javax.swing.JPanel btnThongKeDoanhSo;
    private javax.swing.JPanel btnTiepNhanBaoHanh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
