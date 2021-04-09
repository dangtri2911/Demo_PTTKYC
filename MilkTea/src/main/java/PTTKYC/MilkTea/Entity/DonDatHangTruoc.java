package PTTKYC.MilkTea.Entity;

import PTTKYC.MilkTea.Entity.Product.DDH_SP;
import PTTKYC.MilkTea.Entity.Product.Luong;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DonDatHangTruoc")
public class DonDatHangTruoc {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int ID;

   private LocalDateTime gioDenLayHang;
   private int tongGia;

    @OneToMany(mappedBy = "donDatHangTruoc")
    private List< DDH_SP > spList = new ArrayList<DDH_SP>();

    public DonDatHangTruoc(int ID, LocalDateTime gioDenLayHang, int tongGia) {
        this.ID = ID;
        this.gioDenLayHang = gioDenLayHang;
        this.tongGia = tongGia;
    }

    public DonDatHangTruoc(){}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDateTime getGioDenLayHang() {
        return gioDenLayHang;
    }

    public void setGioDenLayHang(LocalDateTime gioDenLayHang) {
        this.gioDenLayHang = gioDenLayHang;
    }

    public int getTongGia() {
        return tongGia;
    }

    public void setTongGia(int tongGia) {
        this.tongGia = tongGia;
    }
}
