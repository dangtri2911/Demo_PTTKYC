package PTTKYC.MilkTea.Entity.Product;

import PTTKYC.MilkTea.Entity.DonDatHangTruoc;
import PTTKYC.MilkTea.Entity.KeToan;
import PTTKYC.MilkTea.Entity.SanPham;

import javax.persistence.*;

@Entity
@Table(name = "Don_SP")
public class DDH_SP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @ManyToOne
    @JoinColumn(name = "DDH_id",nullable = false)
    private DonDatHangTruoc donDatHangTruoc;

    @ManyToOne
    @JoinColumn(name = "sanpham_id",nullable = false)
    private SanPham sanPham;

    private int soluong;

    public DDH_SP(int ID, DonDatHangTruoc donDatHangTruoc, SanPham sanPham, int soluong) {
        this.ID = ID;
        this.donDatHangTruoc = donDatHangTruoc;
        this.sanPham = sanPham;
        this.soluong = soluong;
    }

    public DDH_SP(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public DonDatHangTruoc getDonDatHangTruoc() {
        return donDatHangTruoc;
    }

    public void setDonDatHangTruoc(DonDatHangTruoc donDatHangTruoc) {
        this.donDatHangTruoc = donDatHangTruoc;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
