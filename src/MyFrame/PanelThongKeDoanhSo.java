/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Thanh Thu
 */
public class PanelThongKeDoanhSo extends javax.swing.JPanel {

    /**
     * Creates new form PanelDanhMucSanPham
     */
    public PanelThongKeDoanhSo() {
        initComponents();
        
        //Khởi tạo item cho cmbDateDetail
         Calendar current = Calendar.getInstance();
         cmbDateDetail.removeAllItems();
         for(int i = 0; i < 10; i++)
         {
            String day = String.valueOf(current.get(Calendar.DAY_OF_MONTH));
            String month = String.valueOf(current.get(Calendar.MONTH) + 1);
            String year = String.valueOf(current.get(Calendar.YEAR));
            String date = day + "/" + month + "/" + year;
            cmbDateDetail.addItem(date);
                
            current.add(Calendar.DAY_OF_MONTH, -1);
         }
         
         try 
         {
            NapDuLieuThongKeTheoNgayDenLuuDo();
         } catch (ClassNotFoundException ex)
         {
            Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) 
         {
            Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    
    //Nạp dữ liệu thống kê đến JTable
    private void NapDuLieuThongKe(DataTable dt)
    {   
        DefaultTableModel tModel = (DefaultTableModel)tblDoanhSo.getModel();
        
        String c[] = new String[tModel.getColumnCount()];
        
        for(int i = 0 ; i < tModel.getColumnCount(); i++)
        {
            c[i] = tModel.getColumnName(i);
        }
        if(dt.getRowCount() > 0)
        {
            tModel.setDataVector(dt.getTable(), c);
        }
        else
        {
            tModel.setDataVector(null, c);
        }
    }
    
    //Tìm kiếm dữ liệu thống kê theo ngày
    private DataTable TimThongKeTheoNgay(String date) throws ClassNotFoundException, SQLException
    {
        
        
        String query = "select sl.modelid, sl.dacdiem, count(*) as soluongban, sl.tonkho from hoadon" + 
                       " join (select chitiethd.idhd, model.modelid, model.tonkho, model.dacdiem" + 
                       " from dongho join chitiethd on dongho.seri = chitiethd.seri" + 
                       " join model on dongho.modelid = model.modelid) sl on hoadon.idhd = sl.idhd" +
                       " where hoadon.ngayxuat = '" + date +"' group by sl.modelid;";
        
        DataTable dt = new DataTable("localhost", "clock", 4, query);
        
        return dt;
    }
    
    //Tìm kiếm dữ liệu thống kê dựa vào tháng và năm
    private DataTable TimThongKeTheoThangVaNam(String month, String year) throws ClassNotFoundException, SQLException
    {
        String query = "select sl.modelid, sl.dacdiem, count(*) as soluongban, sl.tonkho from hoadon" + 
                       " join (select chitiethd.idhd, model.modelid, model.tonkho, model.dacdiem" + 
                       " from dongho join chitiethd on dongho.seri = chitiethd.seri" + 
                       " join model on dongho.modelid = model.modelid) sl on hoadon.idhd = sl.idhd" +
                       " where year(hoadon.ngayxuat) = '" + year +"' and month(hoadon.ngayxuat) = '" + month +"' group by sl.modelid;";
        
        DataTable dt = new DataTable("localhost", "clock", 4, query);
        
        return dt;
    }
    
    //Tìm Kiếm dữ liệu thống kê dựa vào năm
    private DataTable TimThongKeTheoNam(String year) throws ClassNotFoundException, SQLException
    {
        String query = "select sl.modelid, sl.dacdiem, count(*) as soluongban, sl.tonkho from hoadon" + 
                       " join (select chitiethd.idhd, model.modelid, model.tonkho, model.dacdiem" + 
                       " from dongho join chitiethd on dongho.seri = chitiethd.seri" + 
                       " join model on dongho.modelid = model.modelid) sl on hoadon.idhd = sl.idhd" +
                       " where year(hoadon.ngayxuat) = '" + year +"' group by sl.modelid;";
        
        DataTable dt = new DataTable("localhost", "clock", 4, query);
        
        return dt;
    }
    
    //Nạp dữ liệu thống kê theo năm đến lưu đồ
    private void NapDuLieuThongKeTheoNamDenLuuDo() throws ClassNotFoundException, SQLException
    {
        String query = "select tk.year, count(*) as soluong from" + 
                        " (select year(hoadon.ngayxuat) as year from chitiethd" + 
                        " join hoadon on chitiethd.idhd = hoadon.idhd) tk group by tk.year;";
        
        DataTable dt = new DataTable("localhost", "clock", 2, query);
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i < dt.getRowCount(); i++)
        {
            Object row[] = dt.getRow(i);
            Number n = new Long((long)row[1]);
            dataset.addValue(n, "soluong", row[0].toString());
        }
        
        //Khởi tạo lưu đồ
        JFreeChart chart = ChartFactory.createBarChart("Biểu Đồ Doanh Thu", "", "", dataset, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        //Đưa lưu đồ vào panel
        ChartPanel chartpanel = new ChartPanel(chart);
        pnlChart.removeAll();
        pnlChart.add(chartpanel, BorderLayout.CENTER);
        pnlChart.validate();
    }
    
    //Nạp dữ liệu thống kê theo ngày đén lưu đồ
    private void NapDuLieuThongKeTheoNgayDenLuuDo() throws ClassNotFoundException, SQLException
    {
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String ToDate = format.format(Calendar.getInstance().getTime());
        
        Calendar TempDate = Calendar.getInstance();
        TempDate.add(Calendar.DAY_OF_MONTH, -10);
        String FromDate = format.format(TempDate.getTime());
        
        String query = "select tk.ngayxuat, count(*) as soluong from" + 
                        " (select hoadon.ngayxuat as ngayxuat from chitiethd" + 
                        " join hoadon on chitiethd.idhd = hoadon.idhd) tk where tk.ngayxuat between '" + FromDate +"' and '" + ToDate +"' group by tk.ngayxuat;";
        
        DataTable dt = new DataTable("localhost", "clock", 2, query);
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        //Đưa dữ liệu vào lưu đồ
        for(int i = 0; i < dt.getRowCount(); i++)
        {
            //Nhận Dữ liệu từ bảng dữ liệu
            Object row[] = dt.getRow(i);
            Number n = new Long((long)row[1]);
            Date date = (Date)row[0];
            
            //Định dạng lại ngày tháng hiển thị
            format = new SimpleDateFormat("dd/MM/yyyy");
            String show = format.format(date);
            
            dataset.addValue(n, "soluong", show);
        }
        
        //Khởi tạo lưu đồ
        JFreeChart chart = ChartFactory.createBarChart("Biểu Đồ Doanh Thu", "", "", dataset, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        //Đưa lưu đồ đến panel để hiển thị
        ChartPanel chartpanel = new ChartPanel(chart);
        pnlChart.removeAll();
        pnlChart.add(chartpanel, BorderLayout.CENTER);
        pnlChart.validate();
    }
    
    //Nạp dữ liệu thống kê theo tháng đến lưu đồ
    private void NapDuLieuThongKeTheoThangDenLuuDo() throws ClassNotFoundException, SQLException
    {
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String ToDate = format.format(Calendar.getInstance().getTime());
        
        Calendar TempDate = Calendar.getInstance();
        TempDate.add(Calendar.MONTH, -12);
        TempDate.set(Calendar.DAY_OF_MONTH, 1);
        String FromDate = format.format(TempDate.getTime());
        
        String query = "select tk.ngayxuat, count(*) as soluong from" + 
                        " (select hoadon.ngayxuat as ngayxuat from chitiethd" + 
                        " join hoadon on chitiethd.idhd = hoadon.idhd) tk where tk.ngayxuat between '" + FromDate +"' and '" + ToDate +"' group by tk.ngayxuat;";
        
        DataTable dt = new DataTable("localhost", "clock", 2, query);
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for(int i = 0; i < dt.getRowCount(); i++)
        {
            Object row[] = dt.getRow(i);
            Number n = new Long((long)row[1]);
            Date date = (Date)row[0];
            
            //Định dạng lại tháng hiển thị
            format = new SimpleDateFormat("MM/yyyy");
            String show = format.format(date);
            
            dataset.addValue(n, "soluong", show);
        }
        
        //Khởi tạo lưu đồ
        JFreeChart chart = ChartFactory.createBarChart("Biểu Đồ Doanh Thu", "", "", dataset, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        //Đưa lưu đồ đến panel và hiển thị
        ChartPanel chartpanel = new ChartPanel(chart);
        pnlChart.removeAll();
        pnlChart.add(chartpanel, BorderLayout.CENTER);
        pnlChart.validate();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhSo = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cmbDate = new javax.swing.JComboBox<>();
        pnlChart = new javax.swing.JPanel();
        cmbDateDetail = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(741, 550));
        setMinimumSize(new java.awt.Dimension(741, 550));
        setPreferredSize(new java.awt.Dimension(741, 550));

        jPanel2.setBackground(new java.awt.Color(85, 169, 150));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Doanh số bán hàng:"));

        tblDoanhSo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Model", "Đặc Điểm", "Số Lượng Bán Ra", "Số Lượng Tồn Kho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoanhSo);
        if (tblDoanhSo.getColumnModel().getColumnCount() > 0) {
            tblDoanhSo.getColumnModel().getColumn(0).setResizable(false);
            tblDoanhSo.getColumnModel().getColumn(1).setResizable(false);
            tblDoanhSo.getColumnModel().getColumn(2).setResizable(false);
            tblDoanhSo.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setText("Liệt kê:");

        cmbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Ngày", "Theo Tháng", "Theo Năm" }));
        cmbDate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDateItemStateChanged(evt);
            }
        });

        pnlChart.setBackground(new java.awt.Color(85, 169, 150));
        pnlChart.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Biểu đồ doanh thu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        pnlChart.setLayout(new java.awt.BorderLayout());

        cmbDateDetail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Ngày", "Theo Tháng", "Theo Năm" }));
        cmbDateDetail.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDateDetailItemStateChanged(evt);
            }
        });

        jLabel10.setText("Xem Chi Tiết");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(cmbDateDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDateDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlChart.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    //Cập nhật bảng hiển thị và lưu đồ thống kê khi chọn kiểu xem
    private void cmbDateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDateItemStateChanged
        // TODO add your handling code here:
        int index = cmbDate.getSelectedIndex();
        
        //Nếu chọn ngày (0) thì sẽ tìm 10 ngày trước đó và đưa vào cmbDateDetail
        //Nếu chọn tháng (1) sẽ tìm 12 tháng trước đó và đưa vào cmbDateDetail
        //Nếu chọn năm (2) sẽ tìm 5 năm trước đó và đưa vào cmbDateDetail
        Calendar current = Calendar.getInstance();
        cmbDateDetail.removeAllItems();
        switch (index) {
            case 0:
                for(int i = 0; i < 10; i++)
                {
                    String day = String.valueOf(current.get(Calendar.DAY_OF_MONTH));
                    String month = String.valueOf(current.get(Calendar.MONTH) + 1);
                    String year = String.valueOf(current.get(Calendar.YEAR));
                    String date = day + "/" + month + "/" + year;
                    cmbDateDetail.addItem(date);
                    
                    current.add(Calendar.DAY_OF_MONTH, -1);
                    
                    try {
                        NapDuLieuThongKeTheoNgayDenLuuDo();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }   break;
            case 1:
                for(int i = 0; i < 12; i++)
                {
                    String month = String.valueOf(current.get(Calendar.MONTH) + 1);
                    String year = String.valueOf(current.get(Calendar.YEAR));
                    String date = month + "/" + year;
                    cmbDateDetail.addItem(date);
                    
                    current.add(Calendar.MONTH, -1);
                    
                    try {
                        NapDuLieuThongKeTheoThangDenLuuDo();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }   break;
            default:
                int year = current.get(Calendar.YEAR);
                cmbDateDetail.removeAllItems();
                for(int i = 0; i < 5; i++)
                {
                    String date = String.valueOf(year);
                    cmbDateDetail.addItem(date);
                    year -= 1;
                }   

                try 
                {
                    NapDuLieuThongKeTheoNamDenLuuDo();
                } catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                } break;
        }
        
    }//GEN-LAST:event_cmbDateItemStateChanged

    //Cập nhật bảng hiển thị khi chọn chi tiết xem
    private void cmbDateDetailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDateDetailItemStateChanged
        // TODO add your handling code here:
        
        int indexDate = cmbDate.getSelectedIndex();
        int indexDateDetail = cmbDateDetail.getSelectedIndex();
        
        switch (indexDate) {
            case 0:
                {
                    Calendar current = Calendar.getInstance();
                    current.add(Calendar.DAY_OF_MONTH, -indexDateDetail);
                    String year = String.valueOf(current.get(Calendar.YEAR));
                    String month = String.valueOf(current.get(Calendar.MONTH) + 1);
                    String day = String.valueOf(current.get(Calendar.DAY_OF_MONTH));
                    String date = year + "-" + month + "-" + day;
                    try {
                        DataTable dt = TimThongKeTheoNgay(date);
                        NapDuLieuThongKe(dt);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    }       break;
                }
            case 1:
                {
                    Calendar current = Calendar.getInstance();
                    current.add(Calendar.MONTH, -indexDateDetail);
                    String month = String.valueOf(current.get(Calendar.MONTH) + 1);
                    String year = String.valueOf(current.get(Calendar.YEAR));
                    DataTable dt;
                    try {
                        dt = TimThongKeTheoThangVaNam(month, year);
                        NapDuLieuThongKe(dt);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    }       break;
                }
            default:
                {
                    Calendar current = Calendar.getInstance();
                    current.add(Calendar.YEAR, -indexDateDetail);
                    String year = String.valueOf(current.get(Calendar.YEAR));
                    DataTable dt;
                    try {
                        dt = TimThongKeTheoNam(year);
                        NapDuLieuThongKe(dt);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelThongKeDoanhSo.class.getName()).log(Level.SEVERE, null, ex);
                    }       break;
                }
        }
    }//GEN-LAST:event_cmbDateDetailItemStateChanged


    
    DataTable dtDoanhSoTungNgay;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbDate;
    private javax.swing.JComboBox<String> cmbDateDetail;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlChart;
    private javax.swing.JTable tblDoanhSo;
    // End of variables declaration//GEN-END:variables
}
