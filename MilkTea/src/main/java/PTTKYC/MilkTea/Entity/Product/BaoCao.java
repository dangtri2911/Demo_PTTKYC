package PTTKYC.MilkTea.Entity.Product;

import PTTKYC.MilkTea.Entity.KeToan;
import PTTKYC.MilkTea.Entity.KhoNVL;
import PTTKYC.MilkTea.Entity.NVL;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "BaoCao")
public class BaoCao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String noiDung;

    @ManyToOne
    @JoinColumn(name = "KeToan_id",nullable = false)
    private KeToan keToan;

    public BaoCao(int ID, Date ngayBatDau, Date ngayKetThuc, String noiDung, KeToan keToan) {
        this.ID = ID;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.noiDung = noiDung;
        this.keToan = keToan;
    }

    public BaoCao(int ID, Date ngayBatDau, Date ngayKetThuc, String noiDung) {
        this.ID = ID;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.noiDung = noiDung;
    }

    public BaoCao(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
