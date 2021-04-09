package PTTKYC.MilkTea.Entity.Product;

import PTTKYC.MilkTea.Entity.KeToan;
import PTTKYC.MilkTea.Entity.NhanVien;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TienLuong")
public class Luong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int luong;
    private Date ngayNhanLuong;

    @ManyToOne
    @JoinColumn(name = "btkluong_id",nullable = false)
    private BangThongKeLuong bangThongKeLuong;

    @ManyToOne
    @JoinColumn(name = "nv_id",nullable = false)
    private NhanVien nhanVien;

    public Luong(int id, int luong, Date ngayNhanLuong, BangThongKeLuong bangThongKeLuong, NhanVien nhanVien) {
        this.id = id;
        this.luong = luong;
        this.ngayNhanLuong = ngayNhanLuong;
        this.bangThongKeLuong = bangThongKeLuong;
        this.nhanVien = nhanVien;
    }

    public Luong(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public Date getNgayNhanLuong() {
        return ngayNhanLuong;
    }

    public void setNgayNhanLuong(Date ngayNhanLuong) {
        this.ngayNhanLuong = ngayNhanLuong;
    }
}
