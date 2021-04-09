package PTTKYC.MilkTea.Entity;

import javax.persistence.*;

@Entity
@Table(name = "CuaHang")
public class CuaHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private String diaChi;

    @OneToOne(mappedBy = "cuaHang")
    private QuanLyCuaHang quanLyCuaHang;

    public CuaHang(int ID, String diaChi, QuanLyCuaHang quanLyCuaHang) {
        this.ID = ID;
        this.diaChi = diaChi;
        this.quanLyCuaHang = quanLyCuaHang;
    }

    public CuaHang(int ID, String diaChi) {
        this.ID = ID;
        this.diaChi = diaChi;
    }

    public CuaHang(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
