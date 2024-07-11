/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1041.com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import pro1041.com.entity.KhachHang;
import pro1041.com.entity.SanPham;
import pro1041.com.utils.DBConnect;

/**
 *
 * @author Tom
 */
public class SanPhamService {

    public List<SanPham> getAll() {
        String sql = """
                     SELECT 
                         sp.id_sanPham,
                         sp.maSanPham,
                         sp.tenSanPham,
                         spc.gia,
                     	    spc.soluongtonkho,
                     	    sp.ngayTao ,
                     	sp.ngaySua ,
                         nsx.tenNSX,
                         th.tenThuongHieu,
                     	cl.tenChatLieu,
                     	ha.IMG,
                     	kt.tenKichThuoc,
                     	ms.tenMauSac,
                     	    spc.id_SPCT
                     FROM 
                         SanPham sp
                     JOIN 
                         SanPhamChiTiet spc ON sp.id_sanPham = spc.id_sanPham
                     JOIN 
                         NhaSanXuat nsx ON sp.id_NSX = nsx.id_NSX
                     JOIN 
                         ThuongHieu th ON sp.id_thuongHieu = th.id_thuongHieu
                     	JOIN 
                     	ChatLieu cl ON spc.id_chatLieu = cl.id_chatLieu
                     	JOIN 
                     	HinhAnh  ha ON spc.id_hinhAnh = ha.id_hinhAnh
                     	JOIN 
                     	KichThuoc kt ON spc.id_kichThuoc = kt.id_kichThuoc
                     	JOIN 
                     	MauSac ms ON spc.id_mauSac = ms.id_mauSac
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDate(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getInt(14));
                dssp.add(sp);
            }
            return dssp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<SanPham> getAllSP() {
        String sql = """
                     SELECT sp.id_sanPham
                                                                         ,maSanPham
                                                                         ,tenSanPham
                                                                         ,sp.ngayTao
                                                                         ,sp.ngaySua,
                                                                         nsx.tenNSX,
                                                                                                  th.tenThuongHieu
                                                                     FROM SanPham sp
                                                                   JOIN 
                                                                                            NhaSanXuat nsx ON sp.id_NSX = nsx.id_NSX
                                                                                        JOIN 
                                                                                            ThuongHieu th ON sp.id_thuongHieu = th.id_thuongHieu
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<SanPham> dssp = new ArrayList<>();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getString(6), rs.getString(7));
                dssp.add(sp);
            }
            return dssp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public DefaultComboBoxModel<String> getAllTenSp() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            String query = """
                           SELECT [tenSanPham]
                             FROM [dbo].[SanPham]
                           """;
            Connection cn = DBConnect.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String sanPham = rs.getString("tenSanPham");
                model.addElement(sanPham);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public DefaultComboBoxModel<String> getAllHinhAnh() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            String query = """
                           SELECT [IMG]
                             FROM [dbo].[HinhAnh]
                           """;
            Connection cn = DBConnect.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String hinhAnh = rs.getString("IMG");
                model.addElement(hinhAnh);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public DefaultComboBoxModel<String> getAllMauSac() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            String query = """
                           SELECT [tenMauSac]
                             FROM [dbo].[MauSac]
                           """;
            Connection cn = DBConnect.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String mauSac = rs.getString("tenMauSac");
                model.addElement(mauSac);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public DefaultComboBoxModel<String> getAllKichThuoc() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            String query = """
                           SELECT [tenKichThuoc]
                             FROM [dbo].[KichThuoc]
                           """;
            Connection cn = DBConnect.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String kichThuoc = rs.getString("tenKichThuoc");
                model.addElement(kichThuoc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public DefaultComboBoxModel<String> getAllChatLieu() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            String query = """
                           SELECT [tenChatLieu] FROM [dbo].[ChatLieu]
                           """;
            Connection cn = DBConnect.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String chatLieu = rs.getString("tenChatLieu");
                model.addElement(chatLieu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public DefaultComboBoxModel<String> getAllThuongHieu() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            String query = """
                           SELECT [tenThuongHieu]
                             FROM [dbo].[ThuongHieu]
                           """;
            Connection cn = DBConnect.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String thuongHieu = rs.getString("tenThuongHieu");
                model.addElement(thuongHieu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public DefaultComboBoxModel<String> getAllNSX() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            String query = """
                           SELECT [tenNSX]
                             FROM [dbo].[NhaSanXuat]
                           """;
            Connection cn = DBConnect.getConnection();
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String nhaSanXuat = rs.getString("tenNSX");
                model.addElement(nhaSanXuat);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi lấy dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }

    public int addSP(SanPham sanPham) {
        String sql = """
                 INSERT INTO [dbo].[SanPham]
                            ([maSanPham]
                            ,[tenSanPham]
                            ,[ngayTao]
                            ,[ngaySua]
                            ,[id_thuongHieu]
                            ,[id_NSX])
                      VALUES
                            (?,?,?,?,?,?)
                 """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            String getIDNSXuat = "SELECT id_NSX FROM [NhaSanXuat] WHERE tenNSX LIKE ?";
            PreparedStatement getIDNSX = con.prepareStatement(getIDNSXuat);
            getIDNSX.setString(1, "%" + sanPham.getTenNSX() + "%");
            ResultSet maspResult = getIDNSX.executeQuery();
            if (!maspResult.next()) {
                throw new SQLException("Cannot find IDNSX for TÊN NHÀ SẢN XUẤT: " + sanPham.getTenNSX());
            }
            int idNSX = maspResult.getInt("id_NSX");

            String getIDThuongHieu = "SELECT id_thuongHieu FROM [ThuongHieu] WHERE tenThuongHieu LIKE ?";
            PreparedStatement getIDTH = con.prepareStatement(getIDThuongHieu);
            getIDTH.setString(1, "%" + sanPham.getTenThuongHieu() + "%");
            ResultSet clResult = getIDTH.executeQuery();
            if (!clResult.next()) {
                throw new SQLException("Cannot find Thương Hiệu for: " + sanPham.getTenThuongHieu());
            }
            int idth = clResult.getInt("id_thuongHieu");

            // Thiết lập các tham số cho PreparedStatement
            ps.setObject(1, sanPham.getMaSanPham());
            ps.setObject(2, sanPham.getTenSanPham());
            ps.setObject(3, sanPham.getNgayTao());
            ps.setObject(4, sanPham.getNgaySua());
            ps.setObject(5, idth);
            ps.setObject(6, idNSX);

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateSP(SanPham sanPham) {
        String sql = """
                UPDATE [dbo].[SanPham]
                    SET [maSanPham] = ?
                       ,[tenSanPham] = ?
                       ,[ngayTao] = ?
                       ,[ngaySua] = ?
                       ,[id_thuongHieu] = ?
                       ,[id_NSX] = ?
                  WHERE maSanPham = ?
                 """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            String getIDSP = "SELECT maSanPham FROM [SanPham] WHERE maSanPham LIKE ?";
            PreparedStatement getMaSanPham = con.prepareStatement(getIDSP);
            getMaSanPham.setString(1, "%" + sanPham.getMaSanPham() + "%");
            ResultSet maspResult = getMaSanPham.executeQuery();
            if (!maspResult.next()) {
                throw new SQLException("Cannot find MASP for TENSP: " + sanPham.getTenSanPham());
            }
            String maSP = maspResult.getString("maSanPham");

            String getIDNSXuat = "SELECT id_NSX FROM [NhaSanXuat] WHERE tenNSX LIKE ?";
            PreparedStatement getIDNSX = con.prepareStatement(getIDNSXuat);
            getIDNSX.setString(1, "%" + sanPham.getTenNSX() + "%");
            ResultSet idnsx = getIDNSX.executeQuery();
            if (!idnsx.next()) {
                throw new SQLException("Cannot find Nhà Sản Xuất for TÊN NHÀ SẢN XUẤT: " + sanPham.getTenNSX());
            }
            int idNSX = idnsx.getInt("id_NSX");

            String getIDThuongHieu = "SELECT id_thuongHieu FROM [ThuongHieu] WHERE tenThuongHieu LIKE ?";
            PreparedStatement getIDTH = con.prepareStatement(getIDThuongHieu);
            getIDTH.setString(1, "%" + sanPham.getTenThuongHieu() + "%");
            ResultSet idthuongHieu = getIDTH.executeQuery();
            if (!idthuongHieu.next()) {
                throw new SQLException("Cannot find Thương Hiệu for: " + sanPham.getTenThuongHieu());
            }
            int idth = idthuongHieu.getInt("id_thuongHieu");

            // Thiết lập các tham số cho PreparedStatement
            ps.setObject(1, sanPham.getMaSanPham());
            ps.setObject(2, sanPham.getTenSanPham());
            ps.setObject(3, sanPham.getNgayTao());
            ps.setObject(4, sanPham.getNgaySua());
            ps.setObject(5, idth);
            ps.setObject(6, idNSX);
            ps.setObject(7, maSP);

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public boolean xoaSP(int id) {
        String sql = """
                     DELETE FROM [dbo].[SanPham]
                                            WHERE id_sanPham = ?
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int add(SanPham sanPham) {
        String sql = """
                 INSERT INTO [dbo].[SanPhamChiTiet]
                            ([id_chatLieu]
                            ,[id_kichThuoc]
                            ,[id_sanPham]
                            ,[id_mauSac]
                            ,[id_hinhAnh]
                            ,[gia]
                            ,[soluongtonkho])
                      VALUES
                            (?,?,?,?,?,?,?)
                 """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            // Lấy id sản phẩm 
            String getIDSP = "SELECT id_sanPham FROM [SanPham] WHERE tenSanPham LIKE ?";
            PreparedStatement getIDSanPham = con.prepareStatement(getIDSP);
            getIDSanPham.setString(1, "%" + sanPham.getTenSanPham() + "%");
            ResultSet maspResult = getIDSanPham.executeQuery();
            if (!maspResult.next()) {
                throw new SQLException("Cannot find MASP for TENSP: " + sanPham.getTenSanPham());
            }
            int idsp = maspResult.getInt("id_sanPham");

            // Lấy id chất liệu 
            String getIDCLQuery = "SELECT id_chatLieu FROM [ChatLieu] WHERE tenChatLieu LIKE ?";
            PreparedStatement getIDChatLieu = con.prepareStatement(getIDCLQuery);
            getIDChatLieu.setString(1, "%" + sanPham.getTenChatLieu() + "%");
            ResultSet clResult = getIDChatLieu.executeQuery();
            if (!clResult.next()) {
                throw new SQLException("Cannot find ChatLieu for: " + sanPham.getTenChatLieu());
            }
            int idcl = clResult.getInt("id_chatLieu");

            // Lấy id kích thước 
            String getIDKTQuery = "SELECT id_kichThuoc FROM [KichThuoc] WHERE tenKichThuoc LIKE ?";
            PreparedStatement getIDKichThuoc = con.prepareStatement(getIDKTQuery);
            getIDKichThuoc.setString(1, "%" + sanPham.getTenKichThuoc() + "%");
            ResultSet ktResult = getIDKichThuoc.executeQuery();
            if (!ktResult.next()) {
                throw new SQLException("Cannot find KichThuoc for: " + sanPham.getTenKichThuoc());
            }
            int idkt = ktResult.getInt("id_kichThuoc");

            // Lấy id hình ảnh 
            String getIDHAQuery = "SELECT id_hinhAnh FROM [HinhAnh] WHERE IMG LIKE ?";
            PreparedStatement getIDHinhAnh = con.prepareStatement(getIDHAQuery);
            getIDHinhAnh.setString(1, "%" + sanPham.getIMG() + "%");
            ResultSet haResult = getIDHinhAnh.executeQuery();
            if (!haResult.next()) {
                throw new SQLException("Cannot find HinhAnh for: " + sanPham.getIMG());
            }
            int idha = haResult.getInt("id_hinhAnh");

            // Lấy id màu sắc
            String getIDMSQuery = "SELECT id_mauSac FROM [MauSac] WHERE tenMauSac LIKE ?";
            PreparedStatement getIDMauSac = con.prepareStatement(getIDMSQuery);
            getIDMauSac.setString(1, "%" + sanPham.getTenMauSac() + "%");
            ResultSet msResult = getIDMauSac.executeQuery();
            if (!msResult.next()) {
                throw new SQLException("Cannot find MauSac for: " + sanPham.getTenMauSac());
            }
            int idms = msResult.getInt("id_mauSac");

            // Thiết lập các tham số cho PreparedStatement
            ps.setObject(1, idcl);
            ps.setObject(2, idkt);
            ps.setObject(3, idsp);
            ps.setObject(4, idms);
            ps.setObject(5, idha);
            ps.setObject(6, sanPham.getGia());
            ps.setObject(7, sanPham.getSoluongtonkho());

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int update(SanPham sanPham) {
        String sql = """
                 UPDATE [dbo].[SanPhamChiTiet]
                    SET [id_chatLieu] = ?
                       ,[id_kichThuoc] = ?
                       ,[id_sanPham] = ?
                       ,[id_mauSac] = ?
                       ,[id_hinhAnh] = ?
                       ,[gia] = ?
                       ,[soluongtonkho] = ?
                  WHERE id_sanPham = ?
                 """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            // Lấy id sản phẩm 
            String getIDSP = "SELECT id_sanPham FROM [SanPham] WHERE tenSanPham LIKE ?";
            PreparedStatement getIDSanPham = con.prepareStatement(getIDSP);
            getIDSanPham.setString(1, "%" + sanPham.getTenSanPham() + "%");
            ResultSet maspResult = getIDSanPham.executeQuery();
            if (!maspResult.next()) {
                throw new SQLException("Cannot find MASP for TENSP: " + sanPham.getTenSanPham());
            }
            int idsp = maspResult.getInt("id_sanPham");

            // Lấy id chất liệu 
            String getIDCLQuery = "SELECT id_chatLieu FROM [ChatLieu] WHERE tenChatLieu LIKE ?";
            PreparedStatement getIDChatLieu = con.prepareStatement(getIDCLQuery);
            getIDChatLieu.setString(1, "%" + sanPham.getTenChatLieu() + "%");
            ResultSet clResult = getIDChatLieu.executeQuery();
            if (!clResult.next()) {
                throw new SQLException("Cannot find ChatLieu for: " + sanPham.getTenChatLieu());
            }
            int idcl = clResult.getInt("id_chatLieu");

            // Lấy id kích thước 
            String getIDKTQuery = "SELECT id_kichThuoc FROM [KichThuoc] WHERE tenKichThuoc LIKE ?";
            PreparedStatement getIDKichThuoc = con.prepareStatement(getIDKTQuery);
            getIDKichThuoc.setString(1, "%" + sanPham.getTenKichThuoc() + "%");
            ResultSet ktResult = getIDKichThuoc.executeQuery();
            if (!ktResult.next()) {
                throw new SQLException("Cannot find KichThuoc for: " + sanPham.getTenKichThuoc());
            }
            int idkt = ktResult.getInt("id_kichThuoc");

            // Lấy id hình ảnh 
            String getIDHAQuery = "SELECT id_hinhAnh FROM [HinhAnh] WHERE IMG LIKE ?";
            PreparedStatement getIDHinhAnh = con.prepareStatement(getIDHAQuery);
            getIDHinhAnh.setString(1, "%" + sanPham.getIMG() + "%");
            ResultSet haResult = getIDHinhAnh.executeQuery();
            if (!haResult.next()) {
                throw new SQLException("Cannot find HinhAnh for: " + sanPham.getIMG());
            }
            int idha = haResult.getInt("id_hinhAnh");

            // Lấy id màu sắc
            String getIDMSQuery = "SELECT id_mauSac FROM [MauSac] WHERE tenMauSac LIKE ?";
            PreparedStatement getIDMauSac = con.prepareStatement(getIDMSQuery);
            getIDMauSac.setString(1, "%" + sanPham.getTenMauSac() + "%");
            ResultSet msResult = getIDMauSac.executeQuery();
            if (!msResult.next()) {
                throw new SQLException("Cannot find MauSac for: " + sanPham.getTenMauSac());
            }
            int idms = msResult.getInt("id_mauSac");

            // Thiết lập các tham số cho PreparedStatement
            ps.setObject(1, idcl);
            ps.setObject(2, idkt);
            ps.setObject(3, idsp);
            ps.setObject(4, idms);
            ps.setObject(5, idha);
            ps.setObject(6, sanPham.getGia());
            ps.setObject(7, sanPham.getSoluongtonkho());
            ps.setObject(8, idsp);

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public boolean xoa(int id) {
        String sql = """
                     DELETE FROM [dbo].[SanPhamChiTiet]
                                            WHERE id_sanPham = ?
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
