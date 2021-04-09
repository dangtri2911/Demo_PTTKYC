package PTTKYC.MilkTea.Entity;

import PTTKYC.MilkTea.Entity.Product.Luong;
import PTTKYC.MilkTea.model.Interface.Person;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "NhanVien")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class NhanVien implements PTTKYC.MilkTea.model.Interface.NhanVien, Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    private String CMND;
    private String hoten;
    private Date ngaySinh;
    private String gioitinh;

    @OneToMany(mappedBy = "nhanVien")
    private List< Luong > luong = new ArrayList<Luong>();

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tk_ID",referencedColumnName = "ID")
    private TaiKhoan taiKhoan;

    @Override
    public void doiMatKhau() {

    }

    public NhanVien(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh) {
        this.ID = ID;
        this.CMND = CMND;
        this.hoten = hoten;
        this.ngaySinh = ngaySinh;
        this.gioitinh = gioitinh;
    }

    public NhanVien() {
    }

    @Override
    public void dangXuat() {

    }
}
