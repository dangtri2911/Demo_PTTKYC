package PTTKYC.MilkTea.Entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "NhanVienBanHang")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class NhanVienBanHang extends NhanVien implements PTTKYC.MilkTea.model.Interface.NhanVienBanHang {
    public NhanVienBanHang(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh) {
        super(ID, CMND, hoten, ngaySinh, gioitinh);
    }

    public NhanVienBanHang() {
    }

    @Override
    public void capNhatTinhTrangSanPham() {

    }

    @Override
    public void xemSoLuongBanTrongNgay() {

    }

    @Override
    public void xemDoanhThuNgay() {

    }

    @Override
    public void kiemKeThietBi() {

    }

    @Override
    public void taoHoaDon() {

    }

    @Override
    public void ChinhSuaHoaDon() {

    }

    @Override
    public void inHoaDon(int maDH) {

    }

    @Override
    public void capNhatTrangThaiDon(int maHD) {

    }

    @Override
    public void themMonChoDH(int maDH, int maSP) {

    }

    @Override
    public void xoaMonKhoiDH(int maDH, int maSP) {

    }

    @Override
    public void themGhiChu(int maDH, String noidung) {

    }
}
