package PTTKYC.MilkTea.Entity;

import PTTKYC.MilkTea.Entity.Product.Luong;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @OneToMany(mappedBy = "menu")
    private List< SanPham > menu = new ArrayList<SanPham>();

    @OneToOne(mappedBy = "menu")
    private Admin admin;

    public Menu(int ID) {
        this.ID = ID;
    }

    public Menu(){}
}
