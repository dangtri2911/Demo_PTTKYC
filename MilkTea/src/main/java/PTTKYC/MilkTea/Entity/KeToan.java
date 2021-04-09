package PTTKYC.MilkTea.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KeToan")
public class KeToan extends NhanVien implements PTTKYC.MilkTea.model.Interface.KeToan {

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
