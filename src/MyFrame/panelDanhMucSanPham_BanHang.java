/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Thanh Thu
 */

public class panelDanhMucSanPham_BanHang extends javax.swing.JPanel {

    /**
     * Creates new form panelDanhMucSanPham
     */
   PanelChiTietSanPham panelChiTietSanPham;
    public panelDanhMucSanPham_BanHang() throws ClassNotFoundException, SQLException {
        initComponents();
       panelChiTietSanPham = new PanelChiTietSanPham();
        
        LoadDB();
    }

    private void LoadDB() throws ClassNotFoundException, SQLException
    {
        String query = "select m.modelid, nsx.namensx, npp.namenpp, loai.nameloai, "+
                        "cl.namecl, p.name, m.size, m.baohanh, m.dacdiem, m.gia, "+
                        "m.tonkho, dongho.hinh from model m join nsx on m.idnsx = nsx.idnsx " +
                        "join npp on m.idnpp = npp.idnpp " +
                        "join loai on m.idloai = loai.idloai " +
                        "join chat_lieu cl on m.id_cl = cl.id_cl " +
                        "join pin p on m.id_pin = p.id_pin " +
                        "join dongho on m.modelid = dongho.modelid " +
                        "group by m.modelid;";
        ModelProfiles = new DataTable("localhost", "clock", 12, query);
        KhachHangProfiles = new DataTable("localhost", "clock", "khachhang", 4);
        DongHoProfiles = new DataTable("localhost", "clock", 12, query); 
        HoaDonProfiles = new DataTable("localhost", "clock", "hoadon", 6);
        CTHoaDonProfiles = new DataTable("localhost", "clock", "chitiethd", 3);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        edtSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lsvBangGia = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsvDonHang = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        cmbIDKhachHang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblThanhTien = new javax.swing.JLabel();
        btnXuatHoaDon = new javax.swing.JButton();
        btnHuyThanhToan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnDel = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblIDHoaDon = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCN = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblThue = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tarNote = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(741, 550));
        setMinimumSize(new java.awt.Dimension(741, 550));
        setPreferredSize(new java.awt.Dimension(741, 550));

        jPanel12.setBackground(new java.awt.Color(85, 169, 150));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Tìm Sản Phẩm:");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));
        jPanel12.add(edtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 238, -1));

        lsvBangGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsvBangGiaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lsvBangGia);

        jPanel12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 721, 130));

        jPanel1.setBackground(new java.awt.Color(85, 169, 150));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn hàng:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jScrollPane1.setViewportView(lsvDonHang);

        jLabel2.setText("Khách Hàng:");

        cmbIDKhachHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Tổng cộng:");

        lblTongTien.setText("VND");

        jLabel7.setText("Thành Tiền:");

        lblThanhTien.setText("VND");

        btnXuatHoaDon.setText("Xuất Hóa Đơn");
        btnXuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDonActionPerformed(evt);
            }
        });

        btnHuyThanhToan.setText("Hủy Thanh Toán");
        btnHuyThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyThanhToanActionPerformed(evt);
            }
        });

        jLabel10.setText("Ngày thanh toán:");

        lblDate.setText("1/1/111");

        jLabel12.setText("Ghi Chú :");

        btnDel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnDel.setText("Xóa");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        jLabel13.setText("Mã Hóa Đơn");

        lblIDHoaDon.setText("123");

        jLabel15.setText("MSTCH: ");

        lblCN.setText("MSTCH");

        jLabel17.setText("Số Lượng:");

        lblSoLuong.setText("0");

        jLabel19.setText("Thuế VAT:");

        lblThue.setText("10%");

        tarNote.setColumns(20);
        tarNote.setRows(5);
        jScrollPane2.setViewportView(tarNote);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(146, 146, 146)
                                .addComponent(lblSoLuong))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTongTien)
                                    .addComponent(lblThanhTien)
                                    .addComponent(lblThue))))))
                .addComponent(btnDel)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHuyThanhToan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(31, 31, 31)
                        .addComponent(lblIDHoaDon))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(cmbIDKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(30, 30, 30)
                        .addComponent(lblCN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addComponent(lblDate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(lblIDHoaDon))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(cmbIDKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(lblCN))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(lblSoLuong))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblTongTien)))
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHuyThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXuatHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblThue)
                                .addGap(11, 11, 11)
                                .addComponent(lblThanhTien)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lsvBangGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsvBangGiaMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()!=2)
            return;
        
        //Nhận giá trị của model đc chọn
        Object o[] = ModelProfiles.getRow(lsvBangGia.getSelectedIndex());
        if(o==null)
            return;
        
       try {
           panelChiTietSanPham.setDuLieuHienThi(o, DSDonHangTam.toArray());
       } catch (IOException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       }
        int result = JOptionPane.showConfirmDialog(this, panelChiTietSanPham, "Thông Tin", JOptionPane.OK_CANCEL_OPTION);
        
        //Nếu chọn seri thì sẽ đưa seri vào đơn hàng
        if(result == JOptionPane.OK_OPTION)
        {
            String seri = panelChiTietSanPham.getSelectedItem();
            
            if(seri == null)
                return;
            
            DSDonHangTam.add(new DongHo(Integer.valueOf(o[0].toString()), Integer.valueOf(seri)));
            
            //Cập nhật số lượng tồn kho
            int selectIndex = lsvBangGia.getSelectedIndex();
            int ton = DSTonKho.get(selectIndex).getTonkho() - 1;
            DSTonKho.get(selectIndex).setTonkho(ton);
            
            LoadDataToListDonHang();
            
            TinhTongTien((int)o[9]);
        }
        
    }//GEN-LAST:event_lsvBangGiaMouseClicked

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int index = lsvDonHang.getSelectedIndex();
        
        if(DSDonHangTam.size() > 0 && index >= 0)
        {
            DSDonHangTam.remove(index);
            LoadDataToListDonHang();
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnHuyThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyThanhToanActionPerformed
       try {
           // TODO add your handling code here:
           this.setVisibleAndLoadData(true);
       } catch (SQLException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       }
        RefershInput();
    }//GEN-LAST:event_btnHuyThanhToanActionPerformed

    private void btnXuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDonActionPerformed
       
        if(DSDonHangTam.size() <= 0)
        {
            JOptionPane.showMessageDialog(this, "Vui Lòng thêm hàng", "Thông Báo", JOptionPane.OK_OPTION);
            return;
        }
        
        try {
           // TODO add your handling code here:
           TaoHoaDon();
           TaoChiTietHoaDon();
           JOptionPane.showConfirmDialog(this, "Xuất Hóa Đơn Thành Công", "Thông Báo", JOptionPane.OK_OPTION);
           RefershInput();
           DataTable.UpdateAllInstance();
           this.setVisibleAndLoadData(true);
           
       } catch (SQLException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(panelDanhMucSanPham_BanHang.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btnXuatHoaDonActionPerformed

    private void RefershInput()
    {
        DSDonHangTam.clear();
        LoadDataToListDonHang();
        TongTien = 0;
        TinhTongTien(0);
    }
    
    private void TinhTongTien(int Tien)
    {
        TongTien += Tien;

        lblSoLuong.setText(String.valueOf(DSDonHangTam.size()));
        lblThanhTien.setText(String.valueOf(TongTien * 110 / 100) + " (VND)");
        lblTongTien.setText(String.valueOf(TongTien) + " (VND)");
    }
    
    public void setVisibleAndLoadData(boolean b) throws SQLException, IOException
    {
        this.setVisible(b);
        
        if(b)
        {
            DSTonKho.clear();
            Object idmodel[] = ModelProfiles.getColumn(0);
            Object tonkho[] = ModelProfiles.getColumn(10);
            for(int i = 0; i < idmodel.length; i++)
            {
                DSTonKho.add(new TonKho(Integer.valueOf(idmodel[i].toString()),
                        Integer.valueOf(tonkho[i].toString())));
            }
            
            LoadDataToListBangGia();

            String newHDId = "0";
            if(HoaDonProfiles.getRowCount() > 0)
            {
                int id = (int) HoaDonProfiles.getRow(HoaDonProfiles.getRowCount() - 1)[0];
                id++;
                newHDId = String.valueOf(id);
            }
            lblIDHoaDon.setText(newHDId);

            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            String ToDate = format.format(Calendar.getInstance().getTime());
            lblDate.setText(ToDate);

            LoadDataToComboBox();
        }
        
        
    }
    
    //Nạp dữ liệu khách hàng lên combobox
    private void LoadDataToComboBox()
    {
        //Đổ dữ liệu id và tên vào comobox của nhà sản xuất
        Object TenKH[] = KhachHangProfiles.getColumn(1);
        Object MaKH[] = KhachHangProfiles.getColumn(0);
        
        cmbIDKhachHang.removeAllItems();
        for(int i = 0; i < TenKH.length; i++)
        {
            String item = MaKH[i].toString() + " - " + TenKH[i].toString();
            cmbIDKhachHang.addItem(item);
        }
    }
    
    //Nạp thông tin model lên bảng giá
    private void LoadDataToListBangGia() throws SQLException, IOException
    {
        DefaultListModel<Model> t = new DefaultListModel();
        
        for (int i = 0; i < DongHoProfiles.getRowCount(); i++) 
        {
            Object o[] = DongHoProfiles.getRow(i);
            Model dh = new Model(o, DongHoProfiles.getImage(i));
            t.addElement(dh);
        }
        lsvBangGia.setCellRenderer(new ItemRenderer());
        lsvBangGia.setModel(t);
    }
    
    //Nạp thông tin đơn hàng tạm thời
    private void LoadDataToListDonHang()
    {
        DefaultListModel<String> t = new DefaultListModel();
            for(int i = 0; i < DSDonHangTam.size(); i++)
                t.addElement(DSDonHangTam.get(i).toString());
                
            lsvDonHang.setModel(t);
    }
    
    //Tạo hóa đơn mới
    private void TaoHoaDon() throws SQLException, ClassNotFoundException
    {
        Object data[] = new Object[6];
        
        data[0] = -1;
        data[1] = KhachHangProfiles.getRow(cmbIDKhachHang.getSelectedIndex())[0];
        GiaoDienDangNhap g = (GiaoDienDangNhap)JFrame.getFrames()[0];
        data[2] = g.getIDNhanVien();
        data[3] = "029-937492";
        data[4] = Calendar.getInstance().getTime();
        data[5] = tarNote.getText();
        
        HoaDonProfiles.InsertDataTable(0, data);
        HoaDonProfiles.UpdateNewData();
    }
    
    //Tạo chi tiết hóa đơn
    private void TaoChiTietHoaDon() throws SQLException, ClassNotFoundException
    {
        for(int i = 0; i < DSDonHangTam.size(); i++)
        {
            Object data[] = new Object[3];
            data[0] = HoaDonProfiles.getColumn(0)[HoaDonProfiles.getRowCount() - 1];
            data[1] = DSDonHangTam.get(i).getSeri();
            data[2] = i + 1;
            CTHoaDonProfiles.InsertDataTable(-1, data);
        }
        
        for(int i = 0; i < DSTonKho.size(); i++)
        {
            DataTable.UpdateModelTonKho("localhost", "clock", "root", "",
                    DSTonKho.get(i).getId(), DSTonKho.get(i).getTonkho());
            
        }
        
        
    }
    
    private DataTable DongHoProfiles;
    private DataTable HoaDonProfiles;
    private DataTable ModelProfiles;
    private DataTable CTHoaDonProfiles;
    private DataTable KhachHangProfiles;
    private boolean isCreatedHD = false;
    private ArrayList<DongHo> DSDonHangTam = new ArrayList<>();
    private ArrayList<TonKho> DSTonKho = new ArrayList<>();
    private int TongTien = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnHuyThanhToan;
    private javax.swing.JButton btnXuatHoaDon;
    private javax.swing.JComboBox<String> cmbIDKhachHang;
    private javax.swing.JTextField edtSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCN;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblIDHoaDon;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JLabel lblThue;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JList<Model> lsvBangGia;
    private javax.swing.JList<String> lsvDonHang;
    private javax.swing.JTextArea tarNote;
    // End of variables declaration//GEN-END:variables

}
