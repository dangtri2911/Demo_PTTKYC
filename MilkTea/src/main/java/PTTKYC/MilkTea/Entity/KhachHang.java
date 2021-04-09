package PTTKYC.MilkTea.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "KhachHang")
public class KhachHang implements PTTKYC.MilkTea.model.Interface.KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ID;

    private String CMND;
    private String hoten;
    private Date ngaySinh;
    private String gioitinh;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tk_ID",referencedColumnName = "ID")
    private TaiKhoan taiKhoan;

    @Override
    public void xemMenu() {

    }

    @Override
    public void thanhToanTrucTuyen() {

    }

    @Override
    public void datTruocDonHang() {

    }

    @Override
    public void themMonChoDonHang() {

    }

    @Override
    public void themGhiChu() {

    }

    @Override
    public void xoaMonKhoiDonHang() {

    }
}
