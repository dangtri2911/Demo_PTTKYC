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

    @ManyToOne
    @JoinColumn(name = "menu_id",nullable = false)
    private Menu menu;



    @OneToMany(mappedBy = "sanPham")
    private List< DDH_SP > ddhSp = new ArrayList<DDH_SP>();

    public SanPham(int ID, String tenSanPham, int gia) {
        this.ID = ID;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
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
