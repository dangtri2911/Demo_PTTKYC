package PTTKYC.MilkTea.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ThuKho")
public class ThuKho extends NhanVien implements PTTKYC.MilkTea.model.Interface.ThuKho {
    public ThuKho(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh, KhoNVL khoNVL) {
        super(ID, CMND, hoten, ngaySinh, gioitinh);
        this.khoNVL = khoNVL;
    }

    public ThuKho(KhoNVL khoNVL) {
        this.khoNVL = khoNVL;
    }

    public ThuKho(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh) {
        super(ID, CMND, hoten, ngaySinh, gioitinh);
    }
    public ThuKho() {
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kho_ID",referencedColumnName = "ID")
    private KhoNVL khoNVL;

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
