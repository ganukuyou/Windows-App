/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

//import java.awt.Dimension;
//import java.awt.GraphicsEnvironment;
//import java.awt.Point;//
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author LOI LOI
 */
public class GiaoDienQuanLyKho extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienQuanLyKho
     */
    
      //khai bao cac layout
    GridBagLayout layout=new GridBagLayout();
    PanelQuanLyHangTonKho panelQuanLyHangTonKho;
    PanelBaoCaoHangTonKho panelBaoCaoHangTonKho;
    panelDanhMucSanPham_SanPham panelDanhMucSanPham_SanPham;
    
    
    
    
    public GiaoDienQuanLyKho() throws SQLException {
        initComponents();
        centerFrame();
        //goi ham set vi tri layout
        panelQuanLyHangTonKho =new PanelQuanLyHangTonKho();
        panelBaoCaoHangTonKho =new PanelBaoCaoHangTonKho();
        try {
            panelDanhMucSanPham_SanPham=new panelDanhMucSanPham_SanPham();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GiaoDienQuanLyKho.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelTrangChuThayThe.setLayout(layout);
        //Gan Panel vao layout
        GridBagConstraints grid=new GridBagConstraints();
        grid.gridx=0;
        grid.gridy=0;
        panelTrangChuThayThe.add(panelQuanLyHangTonKho,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelTrangChuThayThe.add(panelDanhMucSanPham_SanPham,grid);
        grid.gridx=0;
        grid.gridy=0;
        panelTrangChuThayThe.add(panelBaoCaoHangTonKho,grid);
        grid.gridx=0;
        grid.gridy=0;
         //Cai dat hien thi cho panel
        panelQuanLyHangTonKho.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelDanhMucSanPham_SanPham.setVisibleAndLoadData(true);
        
        btnQuanLySanPham.setBackground(Color.decode("#55a996"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelTrangChuThayThe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnQuanLySanPham = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBaoCaoHangTonKho = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1030, 662));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(1030, 662));
        jPanel2.setMinimumSize(new java.awt.Dimension(1030, 662));
        jPanel2.setPreferredSize(new java.awt.Dimension(1030, 662));

        panelTrangChuThayThe.setMaximumSize(new java.awt.Dimension(767, 662));
        panelTrangChuThayThe.setMinimumSize(new java.awt.Dimension(767, 662));
        panelTrangChuThayThe.setPreferredSize(new java.awt.Dimension(767, 662));

        javax.swing.GroupLayout panelTrangChuThayTheLayout = new javax.swing.GroupLayout(panelTrangChuThayThe);
        panelTrangChuThayThe.setLayout(panelTrangChuThayTheLayout);
        panelTrangChuThayTheLayout.setHorizontalGroup(
            panelTrangChuThayTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        panelTrangChuThayTheLayout.setVerticalGroup(
            panelTrangChuThayTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ABC CLOCK");
        jLabel1.setMaximumSize(new java.awt.Dimension(156, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(156, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(156, 22));

        btnQuanLySanPham.setBackground(new java.awt.Color(0, 51, 51));
        btnQuanLySanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLySanPhamMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản Lý Sản Phẩm");
        jLabel2.setMaximumSize(new java.awt.Dimension(156, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(156, 22));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/001-graphic.png"))); // NOI18N

        javax.swing.GroupLayout btnQuanLySanPhamLayout = new javax.swing.GroupLayout(btnQuanLySanPham);
        btnQuanLySanPham.setLayout(btnQuanLySanPhamLayout);
        btnQuanLySanPhamLayout.setHorizontalGroup(
            btnQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuanLySanPhamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        btnQuanLySanPhamLayout.setVerticalGroup(
            btnQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuanLySanPhamLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(btnQuanLySanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnBaoCaoHangTonKho.setBackground(new java.awt.Color(0, 51, 51));
        btnBaoCaoHangTonKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBaoCaoHangTonKhoMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Báo Cáo Hàng Tồn Kho");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Kho.png"))); // NOI18N

        javax.swing.GroupLayout btnBaoCaoHangTonKhoLayout = new javax.swing.GroupLayout(btnBaoCaoHangTonKho);
        btnBaoCaoHangTonKho.setLayout(btnBaoCaoHangTonKhoLayout);
        btnBaoCaoHangTonKhoLayout.setHorizontalGroup(
            btnBaoCaoHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBaoCaoHangTonKhoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(77, 77, 77))
        );
        btnBaoCaoHangTonKhoLayout.setVerticalGroup(
            btnBaoCaoHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBaoCaoHangTonKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnBaoCaoHangTonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        btnDangXuat.setBackground(new java.awt.Color(0, 51, 51));
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Đăng Xuất");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/005-close.png"))); // NOI18N

        javax.swing.GroupLayout btnDangXuatLayout = new javax.swing.GroupLayout(btnDangXuat);
        btnDangXuat.setLayout(btnDangXuatLayout);
        btnDangXuatLayout.setHorizontalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDangXuatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        btnDangXuatLayout.setVerticalGroup(
            btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDangXuatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBaoCaoHangTonKho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(panelTrangChuThayThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(btnQuanLySanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBaoCaoHangTonKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTrangChuThayThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void btnBaoCaoHangTonKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBaoCaoHangTonKhoMouseClicked
// Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#55a996"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        panelQuanLyHangTonKho.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(true);
        panelDanhMucSanPham_SanPham.setVisible(false);
    
    }//GEN-LAST:event_btnBaoCaoHangTonKhoMouseClicked

    private void btnQuanLySanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLySanPhamMouseClicked
        // Cai dat hien thi layout va mau sac tuong ung
        btnQuanLySanPham.setBackground(Color.decode("#55a996"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#003333"));
        panelQuanLyHangTonKho.setVisible(false);
        panelBaoCaoHangTonKho.setVisible(false);
        panelDanhMucSanPham_SanPham.setVisibleAndLoadData(true);
        


        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuanLySanPhamMouseClicked

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        btnQuanLySanPham.setBackground(Color.decode("#003333"));
        btnBaoCaoHangTonKho.setBackground(Color.decode("#003333"));
        btnDangXuat.setBackground(Color.decode("#55a996"));
        
        JFrame.getFrames()[0].setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatMouseClicked

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienQuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GiaoDienQuanLyKho().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoDienQuanLyKho.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBaoCaoHangTonKho;
    private javax.swing.JPanel btnDangXuat;
    private javax.swing.JPanel btnQuanLySanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelTrangChuThayThe;
    // End of variables declaration//GEN-END:variables
}
