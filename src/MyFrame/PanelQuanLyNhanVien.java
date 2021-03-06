/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.awt.GridBagConstraints;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Thu
 */
public class PanelQuanLyNhanVien extends javax.swing.JPanel {

    public PanelQuanLyNhanVien() throws ClassNotFoundException, SQLException {
        initComponents();
        GridBagConstraints grid=new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        grid.gridx=0;
        grid.gridy=0;
        
        LoadDB();
        LoadDBToTable();
        LoadDBToComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelDanhSachNhanVien = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        panelThemMoiNhanVien = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNhanVienUpdate = new javax.swing.JTable();
        panelCapNhatNhanVien_Layout = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edtPassNV = new javax.swing.JTextField();
        edtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbMaCV = new javax.swing.JComboBox<>();
        btnAddNV = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edtNumP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edtNameNV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnEditNV = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        panelThemMoiChucVu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChucVu = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(741, 550));
        setMinimumSize(new java.awt.Dimension(741, 550));

        jTabbedPane1.setBackground(new java.awt.Color(85, 169, 150));
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(741, 550));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(741, 550));
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(741, 550));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(736, 469));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(736, 469));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(736, 469));

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Địa Chỉ", "Số Điện Thoại", "Mật Khẩu", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setMaximumSize(new java.awt.Dimension(762, 460));
        tblNhanVien.setMinimumSize(new java.awt.Dimension(762, 460));
        tblNhanVien.setPreferredSize(new java.awt.Dimension(762, 460));
        jScrollPane2.setViewportView(tblNhanVien);

        javax.swing.GroupLayout panelDanhSachNhanVienLayout = new javax.swing.GroupLayout(panelDanhSachNhanVien);
        panelDanhSachNhanVien.setLayout(panelDanhSachNhanVienLayout);
        panelDanhSachNhanVienLayout.setHorizontalGroup(
            panelDanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        panelDanhSachNhanVienLayout.setVerticalGroup(
            panelDanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDanhSachNhanVienLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Danh Sách Nhân Viên", panelDanhSachNhanVien);

        jScrollPane3.setMaximumSize(new java.awt.Dimension(736, 469));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(736, 469));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(736, 469));

        tblNhanVienUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Địa Chỉ", "Số Điện Thoại", "Mật Khẩu", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblNhanVienUpdate);

        panelCapNhatNhanVien_Layout.setMaximumSize(new java.awt.Dimension(746, 346));
        panelCapNhatNhanVien_Layout.setMinimumSize(new java.awt.Dimension(746, 346));
        panelCapNhatNhanVien_Layout.setPreferredSize(new java.awt.Dimension(746, 346));

        jLabel7.setText("Mật Khẩu :");

        jLabel5.setText("Địa Chỉ :");

        jLabel6.setText("Mã Chức Vụ :");

        cmbMaCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddNV.setText("Thêm Nhân Viên");
        btnAddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNVActionPerformed(evt);
            }
        });

        jButton2.setText("Hủy Bỏ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        edtNumP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtNumPKeyTyped(evt);
            }
        });

        jLabel8.setText("Số Điện Thoại :");

        jLabel10.setText("Tên Nhân Viên");

        javax.swing.GroupLayout panelCapNhatNhanVien_LayoutLayout = new javax.swing.GroupLayout(panelCapNhatNhanVien_Layout);
        panelCapNhatNhanVien_Layout.setLayout(panelCapNhatNhanVien_LayoutLayout);
        panelCapNhatNhanVien_LayoutLayout.setHorizontalGroup(
            panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCapNhatNhanVien_LayoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCapNhatNhanVien_LayoutLayout.createSequentialGroup()
                        .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMaCV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edtAddress)
                            .addComponent(edtPassNV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79)
                .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCapNhatNhanVien_LayoutLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCapNhatNhanVien_LayoutLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtNumP, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        panelCapNhatNhanVien_LayoutLayout.setVerticalGroup(
            panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCapNhatNhanVien_LayoutLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(edtNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCapNhatNhanVien_LayoutLayout.createSequentialGroup()
                        .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbMaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(edtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(edtNumP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(edtPassNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelCapNhatNhanVien_LayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNV)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditNV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditNV.setText("Chỉnh Sửa");
        btnEditNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditNVActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDel.setText("Xóa");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelThemMoiNhanVienLayout = new javax.swing.GroupLayout(panelThemMoiNhanVien);
        panelThemMoiNhanVien.setLayout(panelThemMoiNhanVienLayout);
        panelThemMoiNhanVienLayout.setHorizontalGroup(
            panelThemMoiNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemMoiNhanVienLayout.createSequentialGroup()
                .addGroup(panelThemMoiNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThemMoiNhanVienLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(panelThemMoiNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(panelThemMoiNhanVienLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCapNhatNhanVien_Layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelThemMoiNhanVienLayout.setVerticalGroup(
            panelThemMoiNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemMoiNhanVienLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelThemMoiNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelThemMoiNhanVienLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelThemMoiNhanVienLayout.createSequentialGroup()
                        .addComponent(btnEditNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addComponent(panelCapNhatNhanVien_Layout, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cập Nhật Nhân Viên", panelThemMoiNhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Chức Vụ :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(751, 532));
        jPanel2.setMinimumSize(new java.awt.Dimension(751, 532));
        jPanel2.setPreferredSize(new java.awt.Dimension(751, 532));

        tblChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Chức Vụ", "Tên Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblChucVu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelThemMoiChucVuLayout = new javax.swing.GroupLayout(panelThemMoiChucVu);
        panelThemMoiChucVu.setLayout(panelThemMoiChucVuLayout);
        panelThemMoiChucVuLayout.setHorizontalGroup(
            panelThemMoiChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemMoiChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThemMoiChucVuLayout.setVerticalGroup(
            panelThemMoiChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThemMoiChucVuLayout.createSequentialGroup()
                .addGroup(panelThemMoiChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThemMoiChucVuLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelThemMoiChucVuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sách Chức Vụ", panelThemMoiChucVu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //Kiểm tra có đang ở trong trạng thái chỉnh sửa hay không
        if(isEditModeNV)
        {
            SetEditMode(false);
            return;
        }
        
        //Làm mới các input đã nhập
        RefershInputNV();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNVActionPerformed
        try {
            //Nếu đang trong trạng thái edit thì cho cập nhật, ngược lại thì thêm
            if(isEditModeNV)
            {
                UpdateNhanVien();
            }
            else
            {
                AddNhanVien();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelQuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddNVActionPerformed

    private void edtNumPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNumPKeyTyped
        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9' || edtNumP.getText().length() > 11)
            evt.consume();
    }//GEN-LAST:event_edtNumPKeyTyped

    private void btnEditNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditNVActionPerformed
        // TODO add your handling code here:
        
        //Kiểm tra có chọn hàng để tương tác hay không
        if(tblNhanVienUpdate.getSelectedRowCount() < 1)
        {
            JOptionPane.showMessageDialog(this, "Hãy Chọn Hàng Cần Sửa");
            return;
        }
        
        if(!isEditModeNV)
        {
            IndexSelected = tblNhanVienUpdate.getSelectedRow();
            SetEditMode(true);
        }
    }//GEN-LAST:event_btnEditNVActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        if(tblNhanVienUpdate.getSelectedRowCount() < 1)
        {
            JOptionPane.showMessageDialog(this, "Hãy chọn hàng cần xóa!", "Thông Báo", JOptionPane.OK_OPTION);
            return;
        }
        
        try {
            NhanVienProfiles.DeleteDataTable(tblNhanVienUpdate.getSelectedRow());
            this.setVisibleAndLoadData(true);
        } catch (SQLException ex) {
            Logger.getLogger(PanelQuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelQuanLyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    //Hàm chịu trách nhiệm nạp csdl lên ram
    private void LoadDB() throws ClassNotFoundException, SQLException
    {
        NhanVienProfiles = new DataTable("localhost", "clock", "nhanvien", 6);
        ChucVuProfiles = new DataTable("localhost", "clock", "chucvu", 2);
    }
    
    //Hàm có trách nhiệm chuyển csdl vào jtable để hiển thi 
   private void LoadDBToTable()
    {   
        DefaultTableModel tModelNV = (DefaultTableModel)tblNhanVien.getModel();
        String c[] = {"Mã Nhân Viên", "Tên Nhân Viên", "Địa Chỉ", "Số Điện Thoại", "Mật Khẩu", "Chức Vụ"};
        tModelNV.setDataVector(NhanVienProfiles.getTable(), c);
        
        DefaultTableModel tModelUpdateNV = (DefaultTableModel)tblNhanVienUpdate.getModel();
        tModelUpdateNV.setDataVector(NhanVienProfiles.getTable(), c);
        
        DefaultTableModel tModelCV = (DefaultTableModel)tblChucVu.getModel();
        String cv[] = {"Mã Chức Vụ", "Tên Chức Vụ"};
        tModelCV.setDataVector(ChucVuProfiles.getTable(), cv);
    }
    
   //Nạp DB đến combobox
    private void LoadDBToComboBox()
    {
        Object macv[] = ChucVuProfiles.getColumn(0);
        Object tencv[] = ChucVuProfiles.getColumn(1);
        
        cmbMaCV.removeAllItems();
        for(int i = 0; i < macv.length; i++)
        {
            String s = macv[i] + " - " + tencv[i];
            
            cmbMaCV.addItem(s);
        }
    }
    
    public void setVisibleAndLoadData(boolean b) throws ClassNotFoundException, SQLException
    {
        if(!b)
            return;
        
        this.setVisible(b);
        LoadDB();
        LoadDBToTable();
    }
    

    
    private void RefershInputNV()
    {
        edtNameNV.setText("");
        edtAddress.setText("");
        edtNumP.setText("");
        edtPassNV.setText("");
        
    }
    
    void AddNhanVien() throws SQLException
    {
        String name = edtNameNV.getText();
        String diachi = edtAddress.getText();
        String sdt = edtNumP.getText();
        String pass = edtPassNV.getText();
        
        if(name.isEmpty() || diachi.isEmpty() || sdt.isEmpty() || pass.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Phải nhập đủ dữ liệu", "Thông Báo", JOptionPane.OK_OPTION);
            return;
        }
        
        Object o[] = new Object[6];
        o[1] = name;
        o[2] = diachi;
        o[3] = sdt;
        o[4] = pass;
        int index = cmbMaCV.getSelectedIndex();
        o[5] = ChucVuProfiles.getColumn(0)[index];
        NhanVienProfiles.InsertDataTable(0, o);
        
        RefershInputNV();
        LoadDBToTable();
    }
    
    void UpdateNhanVien() throws SQLException
    {
        String name = edtNameNV.getText();
        String diachi = edtAddress.getText();
        String sdt = edtNumP.getText();
        String pass = edtPassNV.getText();
        
        if(name.isEmpty() || diachi.isEmpty() || sdt.isEmpty() || pass.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Phải nhập đủ dữ liệu", "Thông Báo", JOptionPane.OK_OPTION);
            return;
        }
        
        Object o[] = new Object[6];
        o[1] = name;
        o[2] = diachi;
        o[3] = sdt;
        o[4] = pass;
        int index = cmbMaCV.getSelectedIndex();
        o[5] = ChucVuProfiles.getColumn(0)[index];
        NhanVienProfiles.UpdateDataTable(0, IndexSelected, o);
        
        RefershInputNV();
        LoadDBToTable();
        SetEditMode(false);
    }
    
    void SetEditMode(boolean b)
    {
        if(b)
        {
            Object o[] = NhanVienProfiles.getRow(IndexSelected);

            edtNameNV.setText(o[1].toString());
            edtAddress.setText(o[2].toString());
            edtNumP.setText(o[3].toString());
            edtPassNV.setText(o[4].toString());
            int index = 0;
            for (int i = 0; i < cmbMaCV.getItemCount(); i++) {
                String s = cmbMaCV.getItemAt(i).substring(0, 2);
                if (s.toLowerCase().contains(o[5].toString().toLowerCase())) 
                {
                    index = i;
                    break;
                }
            }
            cmbMaCV.setSelectedIndex(index);

            btnAddNV.setText("Lưu Chỉnh Sửa");
            btnDel.setEnabled(false);
            btnEditNV.setEnabled(false);

            isEditModeNV = true;
            return;
        }
        
        RefershInputNV();
        btnDel.setEnabled(true);
        btnEditNV.setEnabled(true);

        isEditModeNV = false;
    }
    
    private DataTable NhanVienProfiles;
    private DataTable ChucVuProfiles;
    
    private boolean isEditModeNV = false;
    private int IndexSelected = -1;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNV;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEditNV;
    private javax.swing.JComboBox<String> cmbMaCV;
    private javax.swing.JTextField edtAddress;
    private javax.swing.JTextField edtNameNV;
    private javax.swing.JTextField edtNumP;
    private javax.swing.JTextField edtPassNV;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelCapNhatNhanVien_Layout;
    private javax.swing.JPanel panelDanhSachNhanVien;
    private javax.swing.JPanel panelThemMoiChucVu;
    private javax.swing.JPanel panelThemMoiNhanVien;
    private javax.swing.JTable tblChucVu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTable tblNhanVienUpdate;
    // End of variables declaration//GEN-END:variables

}
