package PTTKYC.MilkTea.Entity;

import PTTKYC.MilkTea.Entity.Product.DDH_SP;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SanPham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private String tenSanPham;
    private int gia;

    private String mota;
    private int tinhTrang;



    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    private String linkIMG;

    public SanPham(String tenSanPham, int gia, String mota, String linkIMG) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.mota = mota;
        this.linkIMG = linkIMG;
    }
    public SanPham(String tenSanPham, int gia, String mota, int tinhTrang, String linkIMG) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.mota = mota;
        this.tinhTrang = tinhTrang;
        this.linkIMG = linkIMG;
    }
    public String getLinkIMG() {
        return linkIMG;
    }

    public void setLinkIMG(String linkIMG) {
        this.linkIMG = linkIMG;
    }

    public String getMota() {
        return mota;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List< DDH_SP > getDdhSp() {
        return ddhSp;
    }

    public void setDdhSp(List< DDH_SP > ddhSp) {
        this.ddhSp = ddhSp;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @ManyToOne
    @JoinColumn(name = "menu_id",nullable = true)
    private Menu menu;



    @OneToMany(mappedBy = "sanPham")
    private List< DDH_SP > ddhSp = new ArrayList<DDH_SP>();

    public SanPham(int ID, String tenSanPham, int gia, String mota) {
        this.ID = ID;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.mota = mota;
    }

    public SanPham(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
