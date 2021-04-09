package PTTKYC.MilkTea.Entity.Product;

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

    public DonDatNVL(int ID, Date ngayDat, List< NVL > nvl) {
        this.ID = ID;
        this.ngayDat = ngayDat;
        this.nvl = nvl;
    }

    public DonDatNVL(){}
}
