package PTTKYC.MilkTea.model.Interface;

public interface Admin extends KeToan, ThuKho, QuanLyCuaHang {
    public void themTaiKhoan();
    public void xoaTaiKhoan(int idTk);
    public void chinhSuaThongTinTaiKhoan(int idTK);
    public void themMonMenu(int maSP);
    public void xoaMonMenu(int maSP);
    public void suaThongTinMonMenu(int maSP, String thongtin);
}
