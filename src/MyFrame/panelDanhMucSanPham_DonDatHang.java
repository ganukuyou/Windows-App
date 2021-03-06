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

public class panelDanhMucSanPham_DonDatHang extends javax.swing.JPanel {

    /**
     * Creates new form panelDanhMucSanPham
     */
   PanelChiTietSanPham panelChiTietSanPham;
    public panelDanhMucSanPham_DonDatHang() throws ClassNotFoundException, SQLException {
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
        jScrollPane3 = new javax.swing.JScrollPane();
        lsvBangGia = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(741, 550));
        setMinimumSize(new java.awt.Dimension(741, 550));
        setPreferredSize(new java.awt.Dimension(741, 550));

        jPanel12.setBackground(new java.awt.Color(85, 169, 150));
        jPanel12.setMaximumSize(new java.awt.Dimension(741, 235));
        jPanel12.setMinimumSize(new java.awt.Dimension(741, 235));
        jPanel12.setPreferredSize(new java.awt.Dimension(741, 235));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Danh Sách Đơn Hàng");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        lsvBangGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsvBangGiaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lsvBangGia);

        jPanel12.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 660, 110));

        jPanel1.setBackground(new java.awt.Color(85, 169, 150));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thêm Đơn Đặt Hàng Mới :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(741, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(741, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 300));

        jLabel1.setText("Mã Đơn Hàng :");

        jLabel4.setText("123");

        jLabel5.setText("Mã Khách Hàng :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Ngày Đặt Hàng :");

        jLabel14.setText("jLabel14");

        jLabel16.setText("Ngày Nhận Hàng :");

        jLabel18.setText("jLabel14");

        jLabel20.setText("Danh Sách Sản Phẩm :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Model", "Số lượng"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jButton1.setText("Lưu Đơn Hàng");

        jButton2.setText("Hủy Đơn Hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
           Logger.getLogger(panelDanhMucSanPham_DonDatHang.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(panelDanhMucSanPham_DonDatHang.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(panelDanhMucSanPham_DonDatHang.class.getName()).log(Level.SEVERE, null, ex);
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
            
        }
        
    }//GEN-LAST:event_lsvBangGiaMouseClicked

    private void RefershInput()
    {
        DSDonHangTam.clear();
        LoadDataToListDonHang();
        TongTien = 0;
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

            LoadDataToComboBox();
        }
        
        
    }
    
    //Nạp dữ liệu khách hàng lên combobox
    private void LoadDataToComboBox()
    {
        //Đổ dữ liệu id và tên vào comobox của nhà sản xuất
        Object TenKH[] = KhachHangProfiles.getColumn(1);
        Object MaKH[] = KhachHangProfiles.getColumn(0);

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
               
    }
    
    //Tạo hóa đơn mới
    private void TaoHoaDon() throws SQLException, ClassNotFoundException
    {

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<MyFrame.Model> lsvBangGia;
    // End of variables declaration//GEN-END:variables

}
