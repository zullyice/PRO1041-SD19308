/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pro1041.com.main;

import Icon.XImage;
import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;

/**
 *
 * @author Tom
 */
public class MainAction extends javax.swing.JFrame {
    
    private int userRole;

    /**
     * Creates new form MainAction
     */
    public MainAction(int userRole) {
        this.userRole = userRole;
        initComponents();
        setTitle("QUẢN LÝ BÁN ÁO HOODIE");
        this.setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setExtendedState(this.MAXIMIZED_BOTH);
        //showPanel(new formtrangchu());
    }
    
    public void showPanel(JPanel n) {
        if (RolePermissions.hasPermission(userRole, n.getClass())) {
            jpn.removeAll();
            jpn.add(n);
            jpn.validate();
            jpn.repaint();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập phần này.");
        }
    }
    
    public void setColorPanel(JPanel jp) {
//    jp.setBackground(new java.awt.Color(0,204,51));
        jp.setBackground(new Color(200, 200, 100));
    }
    
    public void resetColorPanel(JPanel jp) {
        jp.setBackground(new Color(242, 242, 242));
    }
    
    public class RolePermissions {
        
        private static final Map<Integer, Set<Class<? extends JPanel>>> permissions = new HashMap<>();
        
        static {
            
            Set<Class<? extends JPanel>> admin = new HashSet<>();
            admin.add(formKhuyenMai.class);
            admin.add(formKhachHang.class);
            admin.add(formNhanVien.class);
            admin.add(formSanPham.class);
//            role1Permissions.add(formKhachhang.class);
//            role1Permissions.add(formhoadon.class);
//            role1Permissions.add(formnhanvien.class);
//            role1Permissions.add(formthongke.class);
//            role1Permissions.add(formsanpham.class);
//            role1Permissions.add(formkhuyenmai.class);
//            role1Permissions.add(formbanhang.class);
            permissions.put(1, admin);
            
            Set<Class<? extends JPanel>> user = new HashSet<>();
//            role2Permissions.add(formtrangchu.class);
//            role2Permissions.add(formKhachhang.class);
//            role2Permissions.add(formhoadon.class);
//            role2Permissions.add(formsanpham.class);
//            role2Permissions.add(formbanhang.class);
            permissions.put(2, user);
        }
        
        public static boolean hasPermission(int role, Class<? extends JPanel> panelClass) {
            return permissions.getOrDefault(role, new HashSet<>()).contains(panelClass);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn = new javax.swing.JPanel();
        JPfull = new javax.swing.JPanel();
        JPnew = new javax.swing.JPanel();
        JPhoadon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JPnhanvien = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JPkhachhang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JPthonoke = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        JPexit = new javax.swing.JPanel();
        jDangXuat = new javax.swing.JLabel();
        JPsanpham = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        JPkhuyenmai = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        JPbanhang = new javax.swing.JPanel();
        jBanHang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jpn.setLayout(new java.awt.BorderLayout());

        JPfull.setBackground(new java.awt.Color(0, 153, 153));

        JPnew.setBackground(new java.awt.Color(0, 153, 153));

        JPhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPhoadonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/tax-planning_15636855.png"))); // NOI18N
        jLabel2.setText("Hóa Đơn");

        javax.swing.GroupLayout JPhoadonLayout = new javax.swing.GroupLayout(JPhoadon);
        JPhoadon.setLayout(JPhoadonLayout);
        JPhoadonLayout.setHorizontalGroup(
            JPhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        JPhoadonLayout.setVerticalGroup(
            JPhoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        JPnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPnhanvienMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/man_16044770.png"))); // NOI18N
        jLabel3.setText("Nhân Viên");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPnhanvienLayout = new javax.swing.GroupLayout(JPnhanvien);
        JPnhanvien.setLayout(JPnhanvienLayout);
        JPnhanvienLayout.setHorizontalGroup(
            JPnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        JPnhanvienLayout.setVerticalGroup(
            JPnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        JPkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPkhachhangMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/team_924520.png"))); // NOI18N
        jLabel4.setText("Khách Hàng");

        javax.swing.GroupLayout JPkhachhangLayout = new javax.swing.GroupLayout(JPkhachhang);
        JPkhachhang.setLayout(JPkhachhangLayout);
        JPkhachhangLayout.setHorizontalGroup(
            JPkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPkhachhangLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPkhachhangLayout.setVerticalGroup(
            JPkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        JPthonoke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPthonokeMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/information_12608297.png"))); // NOI18N
        jLabel6.setText("Thống Kê");

        javax.swing.GroupLayout JPthonokeLayout = new javax.swing.GroupLayout(JPthonoke);
        JPthonoke.setLayout(JPthonokeLayout);
        JPthonokeLayout.setHorizontalGroup(
            JPthonokeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        JPthonokeLayout.setVerticalGroup(
            JPthonokeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        JPexit.setBackground(new java.awt.Color(0, 153, 153));
        JPexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPexitMouseClicked(evt);
            }
        });

        jDangXuat.setBackground(new java.awt.Color(0, 153, 153));
        jDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/exit_3094700.png"))); // NOI18N
        jDangXuat.setText("Đăng xuất");
        jDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDangXuatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPexitLayout = new javax.swing.GroupLayout(JPexit);
        JPexit.setLayout(JPexitLayout);
        JPexitLayout.setHorizontalGroup(
            JPexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPexitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPexitLayout.setVerticalGroup(
            JPexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JPsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPsanphamMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/takeaway_12648452.png"))); // NOI18N
        jLabel7.setText("Sản Phẩm");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPsanphamLayout = new javax.swing.GroupLayout(JPsanpham);
        JPsanpham.setLayout(JPsanphamLayout);
        JPsanphamLayout.setHorizontalGroup(
            JPsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        JPsanphamLayout.setVerticalGroup(
            JPsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        JPkhuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPkhuyenmaiMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/sand-watch_12457762.png"))); // NOI18N
        jLabel5.setText("Khuyến Mãi");

        javax.swing.GroupLayout JPkhuyenmaiLayout = new javax.swing.GroupLayout(JPkhuyenmai);
        JPkhuyenmai.setLayout(JPkhuyenmaiLayout);
        JPkhuyenmaiLayout.setHorizontalGroup(
            JPkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        JPkhuyenmaiLayout.setVerticalGroup(
            JPkhuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        JPbanhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPbanhangMouseClicked(evt);
            }
        });

        jBanHang.setBackground(new java.awt.Color(0, 153, 153));
        jBanHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro1041/com/icon/add_13663406.png"))); // NOI18N
        jBanHang.setText("Bán Hàng");
        jBanHang.setToolTipText("");
        jBanHang.setFocusCycleRoot(true);
        jBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBanHangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPbanhangLayout = new javax.swing.GroupLayout(JPbanhang);
        JPbanhang.setLayout(JPbanhangLayout);
        JPbanhangLayout.setHorizontalGroup(
            JPbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPbanhangLayout.setVerticalGroup(
            JPbanhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPnewLayout = new javax.swing.GroupLayout(JPnew);
        JPnew.setLayout(JPnewLayout);
        JPnewLayout.setHorizontalGroup(
            JPnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnewLayout.createSequentialGroup()
                .addGroup(JPnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JPbanhang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JPhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPnhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPthonoke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPsanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPkhuyenmai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        JPnewLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JPhoadon, JPkhachhang, JPkhuyenmai, JPnhanvien, JPsanpham, JPthonoke});

        JPnewLayout.setVerticalGroup(
            JPnewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnewLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JPbanhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPkhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPthonoke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JPhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JPnewLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JPhoadon, JPkhachhang, JPkhuyenmai, JPnhanvien, JPsanpham, JPthonoke});

        javax.swing.GroupLayout JPfullLayout = new javax.swing.GroupLayout(JPfull);
        JPfull.setLayout(JPfullLayout);
        JPfullLayout.setHorizontalGroup(
            JPfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPfullLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(JPnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPfullLayout.setVerticalGroup(
            JPfullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(JPfull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpn, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPfull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpn, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDangXuatMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jDangXuatMouseClicked

    private void JPkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPkhachhangMouseClicked
        // TODO add your handling code here:
        setColorPanel(JPkhachhang);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPsanpham);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);
        
        showPanel(new formKhachHang());

    }//GEN-LAST:event_JPkhachhangMouseClicked

    private void JPhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPhoadonMouseClicked
        // TODO add your handling code here:
        setColorPanel(JPhoadon);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPsanpham);

        //showPanel(new formhoadon());
    }//GEN-LAST:event_JPhoadonMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        setColorPanel(JPnhanvien);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPsanpham);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);
        showPanel(new formNhanVien());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void JPnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPnhanvienMouseClicked
        // TODO add your handling code here:
        setColorPanel(JPnhanvien);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPsanpham);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);

        //showPanel(new formnhanvien());
    }//GEN-LAST:event_JPnhanvienMouseClicked

    private void JPthonokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPthonokeMouseClicked
        // TODO add your handling code here:
        setColorPanel(JPthonoke);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPsanpham);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);

        //showPanel(new formthongke());
    }//GEN-LAST:event_JPthonokeMouseClicked

    private void JPsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPsanphamMouseClicked
        // TODO add your handling code here:
        setColorPanel(JPsanpham);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);

        //showPanel(new formsanpham());
    }//GEN-LAST:event_JPsanphamMouseClicked

    private void JPkhuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPkhuyenmaiMouseClicked
        // TODO add your handling code here:
        setColorPanel(JPkhuyenmai);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPsanpham);
        resetColorPanel(JPhoadon);
        showPanel(new formKhuyenMai());
        //showPanel(new formkhuyenmai());
    }//GEN-LAST:event_JPkhuyenmaiMouseClicked

    private void JPexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPexitMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_JPexitMouseClicked

    private void JPbanhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPbanhangMouseClicked
        // TODO add your handling code here:
        setColorPanel(JPbanhang);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPsanpham);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);

        //showPanel(new formbanhang());
    }//GEN-LAST:event_JPbanhangMouseClicked

    private void jBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBanHangMouseClicked
        setColorPanel(JPbanhang);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPsanpham);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);
    }//GEN-LAST:event_jBanHangMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        setColorPanel(JPsanpham);
        resetColorPanel(JPkhachhang);
        resetColorPanel(JPnhanvien);
        resetColorPanel(JPthonoke);
        resetColorPanel(JPbanhang);
        resetColorPanel(JPkhuyenmai);
        resetColorPanel(JPhoadon);
        showPanel(new formSanPham());
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(MainAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAction(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPbanhang;
    private javax.swing.JPanel JPexit;
    private javax.swing.JPanel JPfull;
    private javax.swing.JPanel JPhoadon;
    private javax.swing.JPanel JPkhachhang;
    private javax.swing.JPanel JPkhuyenmai;
    private javax.swing.JPanel JPnew;
    private javax.swing.JPanel JPnhanvien;
    private javax.swing.JPanel JPsanpham;
    private javax.swing.JPanel JPthonoke;
    private javax.swing.JLabel jBanHang;
    private javax.swing.JLabel jDangXuat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jpn;
    // End of variables declaration//GEN-END:variables
}
