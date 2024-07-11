/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1041.com.service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import pro1041.com.entity.NhanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import pro1041.com.entity.KhuyenMai;
import pro1041.com.utils.DBConnect;

/**
 *
 * @author Tom
 */
public class NhanVienService {

    public List<NhanVien> getAll() {
        String sql = """
                     SELECT [id_nhanVien]
                           ,[maNhanVien]
                           ,[tenNhanVien]
                           ,[gioiTinh]
                           ,[trangThai]
                           ,[sdt]
                           ,[ngayTao]
                           ,[ngaySua]
                       FROM [dbo].[NhanVien]
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> dsnv = new ArrayList<>();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5), rs.getString(6), rs.getDate(7), rs.getDate(8));
                dsnv.add(nv);
            }
            return dsnv;
        } catch (Exception e) {
        }
        return null;
    }

    public int add(NhanVien nv) {
        String sql = """
                     INSERT INTO [dbo].[NhanVien]
                                ([maNhanVien]
                                ,[tenNhanVien]
                                ,[gioiTinh]
                                ,[trangThai]
                                ,[sdt]
                                ,[ngayTao]
                                ,[ngaySua])
                          VALUES
                                (?,?,?,?,?,?,?)
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getMaNhanVien());
            ps.setObject(2, nv.getTenNhanVien());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.isTrangThai());
            ps.setObject(5, nv.getSdt());
            ps.setObject(6, nv.getNgayTao());
            ps.setObject(7, nv.getNgaySua());

            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean xoa(int id) {
        String sql = """
                     DELETE FROM [dbo].[NhanVien]
                           WHERE id_nhanVien=?
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int sua(int id, NhanVien nv) {
        String sql = """
                     UPDATE [dbo].[NhanVien]
                        SET [maNhanVien] = ?
                           ,[tenNhanVien] = ?
                           ,[gioiTinh] = ?
                           ,[trangThai] =?
                           ,[sdt] = ?
                           ,[ngayTao] = ?
                           ,[ngaySua] = ?
                      WHERE id_nhanVien=?
                     """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, nv.getMaNhanVien());
            ps.setObject(2, nv.getTenNhanVien());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.isTrangThai());
            ps.setObject(5, nv.getSdt());
            ps.setObject(6, nv.getNgayTao());
            ps.setObject(7, nv.getNgaySua());
            ps.setObject(8, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
