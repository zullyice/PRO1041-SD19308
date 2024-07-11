    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1041.com.entity;

import java.util.Date;

/**
 *
 * @author Tom
 */
public class NhanVien {
    private int id_nhanVien;
    private String maNhanVien;
    private String tenNhanVien;
    private String gioiTinh;
    private boolean trangThai;
    private String sdt;
    private Date ngayTao;
    private Date ngaySua;

    public NhanVien() {
    }

    public NhanVien(int id_nhanVien, String maNhanVien, String tenNhanVien, String gioiTinh, boolean trangThai, String sdt, Date ngayTao, Date ngaySua) {
        this.id_nhanVien = id_nhanVien;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
        this.sdt = sdt;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }

    public int getId_nhanVien() {
        return id_nhanVien;
    }

    public void setId_nhanVien(int id_nhanVien) {
        this.id_nhanVien = id_nhanVien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id_nhanVien=" + id_nhanVien + ", maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", gioiTinh=" + gioiTinh + ", trangThai=" + trangThai + ", sdt=" + sdt + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + '}';
    }
    
}
