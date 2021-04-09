package PTTKYC.MilkTea.Entity;

import javax.persistence.*;

@Entity
@Table(name = "QuanLyCuaHang")
public class QuanLyCuaHang extends NhanVienBanHang implements PTTKYC.MilkTea.model.Interface.QuanLyCuaHang {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cuaHang_ID",referencedColumnName = "ID")
    private CuaHang cuaHang;

    @Override
    public void xemBaoCao() {}

    @Override
    public void xemThongTinNVLTaiCuaHang(int maNVL) {
    }

    @Override
    public void capNhatSoLuongNVLTaiCuaHang(int maNVL, int soluong) {

    }
}
