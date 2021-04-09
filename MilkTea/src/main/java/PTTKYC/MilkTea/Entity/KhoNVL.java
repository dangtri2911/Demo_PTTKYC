package PTTKYC.MilkTea.Entity;

import javax.persistence.*;

@Entity
@Table(name = "KhoNVL")
public class KhoNVL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String diaChi;

    @OneToOne(mappedBy = "khoNVL")
    private ThuKho thuKho;

    @OneToMany(mappedBy = "")

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
