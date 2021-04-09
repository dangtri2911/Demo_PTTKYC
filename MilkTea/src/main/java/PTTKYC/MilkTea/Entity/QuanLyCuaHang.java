package PTTKYC.MilkTea.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "QuanLyCuaHang")
public class QuanLyCuaHang extends NhanVienBanHang implements PTTKYC.MilkTea.model.Interface.QuanLyCuaHang {
    public QuanLyCuaHang(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh, CuaHang cuaHang) {
        super(ID, CMND, hoten, ngaySinh, gioitinh);
        this.cuaHang = cuaHang;
    }

    public QuanLyCuaHang() {
        super();
    }

    @OneToOne(cascade = CascadeType.DETACH)
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
