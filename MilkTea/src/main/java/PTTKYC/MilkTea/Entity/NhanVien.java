package PTTKYC.MilkTea.Entity;

import PTTKYC.MilkTea.model.Interface.Person;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "NhanVien")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class NhanVien implements PTTKYC.MilkTea.model.Interface.NhanVien, Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ID;

    private String CMND;
    private String hoten;
    private Date ngaySinh;
    private String gioitinh;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    @Override
    public void dangXuat() {

    }
}
