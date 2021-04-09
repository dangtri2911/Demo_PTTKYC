package PTTKYC.MilkTea.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Admin")
public class Admin extends NhanVienBanHang implements PTTKYC.MilkTea.model.Interface.Admin {

    public Admin(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh) {
        super(ID, CMND, hoten, ngaySinh, gioitinh);
    }

    public Admin() {
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "menu",referencedColumnName = "ID")
    private Menu menu;

    @Override
    public void themTaiKhoan() {

    }

    @Override
    public void xoaTaiKhoan(int idTk) {

    }

    @Override
    public void chinhSuaThongTinTaiKhoan(int idTK) {

    }

    @Override
    public void themMonMenu(int maSP) {

    }

    @Override
    public void xoaMonMenu(int maSP) {

    }

    @Override
    public void suaThongTinMonMenu(int maSP, String thongtin) {

    }

    @Override
    public void taoBaoCao() {

    }

    @Override
    public void taoBangThongKe() {

    }

    @Override
    public void suaBaoCao() {

    }

    @Override
    public void xemBaoCao() {

    }

    @Override
    public void xemThongTinNVLTaiCuaHang(int maNVL) {

    }

    @Override
    public void capNhatSoLuongNVLTaiCuaHang(int maNVL, int soluong) {

    }

    @Override
    public void themNVL() {

    }

    @Override
    public void suaThongTinNVL(int maNVL) {

    }

    @Override
    public void xemThongTinNVL(int maNVL) {

    }

    @Override
    public void xoaNVL(int maNVL) {

    }

    @Override
    public void taoPPP() {

    }

    @Override
    public void chinhSuaPPP(int maPPP) {

    }

    @Override
    public void xoaPPP(int maPPP) {

    }
}
