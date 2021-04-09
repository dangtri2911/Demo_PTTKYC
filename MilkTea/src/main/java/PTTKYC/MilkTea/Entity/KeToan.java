package PTTKYC.MilkTea.Entity;

import PTTKYC.MilkTea.Entity.Product.BangThongKeLuong;
import PTTKYC.MilkTea.Entity.Product.BaoCao;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "KeToan")
public class KeToan extends NhanVien implements PTTKYC.MilkTea.model.Interface.KeToan {

    @OneToMany(mappedBy = "keToan")
    private List< BaoCao > baoCao = new ArrayList<BaoCao>();

    @OneToMany(mappedBy = "keToan")
    private List< BangThongKeLuong > bangThongKeLuong = new ArrayList<BangThongKeLuong>();

    public KeToan(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh) {
        super(ID, CMND, hoten, ngaySinh, gioitinh);
    }

    public KeToan() {
    }

    public KeToan(Long ID, String CMND, String hoten, Date ngaySinh, String gioitinh, List< BaoCao > baoCao, List< BangThongKeLuong > bangThongKeLuong) {
        super(ID, CMND, hoten, ngaySinh, gioitinh);
        this.baoCao = baoCao;
        this.bangThongKeLuong = bangThongKeLuong;
    }

    public KeToan(List< BaoCao > baoCao, List< BangThongKeLuong > bangThongKeLuong) {
        this.baoCao = baoCao;
        this.bangThongKeLuong = bangThongKeLuong;
    }

    @Override
    public void taoBaoCao() {

    }

    @Override
    public void taoBangThongKe() {

    }

    @Override
    public void suaBaoCao() {

    }

    @Override
    public void doiMatKhau() {

    }

    @Override
    public void dangXuat() {

    }
}
