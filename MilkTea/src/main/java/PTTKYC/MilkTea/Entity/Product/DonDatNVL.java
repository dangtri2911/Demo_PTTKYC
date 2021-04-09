package PTTKYC.MilkTea.Entity.Product;

import PTTKYC.MilkTea.Entity.Food;
import PTTKYC.MilkTea.Entity.NVL;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "DonDatNVL")
public class DonDatNVL {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private Date ngayDat;

    @ManyToMany
    private List< NVL > nvl = new ArrayList<NVL>();

}
