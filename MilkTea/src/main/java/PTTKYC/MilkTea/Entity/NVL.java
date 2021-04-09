package PTTKYC.MilkTea.Entity;

import PTTKYC.MilkTea.Entity.Product.DonDatNVL;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "NVL")
public class NVL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private String tenNVL;
    private int soluong;
    private String mota;

    @ManyToOne
    @JoinColumn(name = "kho_id",nullable = false)
    private KhoNVL khoNVL;

    @ManyToMany
    private List< DonDatNVL > donDatNVL = new ArrayList<DonDatNVL>();

    public NVL(int ID, String tenNVL, int soluong, String mota) {
        this.ID = ID;
        this.tenNVL = tenNVL;
        this.soluong = soluong;
        this.mota = mota;
    }

    public NVL(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenNVL() {
        return tenNVL;
    }

    public void setTenNVL(String tenNVL) {
        this.tenNVL = tenNVL;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
