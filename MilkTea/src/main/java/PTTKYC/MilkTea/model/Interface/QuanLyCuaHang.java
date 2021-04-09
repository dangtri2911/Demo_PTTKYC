package PTTKYC.MilkTea.model.Interface;

public interface QuanLyCuaHang extends NhanVienBanHang{
    public void xemBaoCao();
    public void xemThongTinNVLTaiCuaHang(int maNVL);
    public void capNhatSoLuongNVLTaiCuaHang(int maNVL, int soluong);
}
