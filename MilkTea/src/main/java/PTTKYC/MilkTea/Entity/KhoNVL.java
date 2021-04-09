package PTTKYC.MilkTea.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "KhoNVL")
public class KhoNVL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String diaChi;

    @OneToOne(mappedBy = "khoNVL")
    private ThuKho thuKho;

    @OneToMany(mappedBy = "khoNVL")
    private List< NVL > nvl = new ArrayList<NVL>();

    public KhoNVL(int id, String diaChi) {
        this.id = id;
        this.diaChi = diaChi;
    }

    public KhoNVL(int id, String diaChi, ThuKho thuKho) {
        this.id = id;
        this.diaChi = diaChi;
        this.thuKho = thuKho;
    }

    public KhoNVL(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
