package PTTKYC.MilkTea.Entity.Product;

import PTTKYC.MilkTea.Entity.KeToan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BangThongKeLuong")
public class BangThongKeLuong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "KeToan_id",nullable = false)
    private KeToan keToan;

    @OneToMany(mappedBy = "bangThongKeLuong")
    private List< Luong > luong = new ArrayList<Luong>();

    public BangThongKeLuong(int id, KeToan keToan) {
        this.id = id;
        this.keToan = keToan;
    }

    public BangThongKeLuong(int id) {
        this.id = id;
    }

    public BangThongKeLuong(){}
}
