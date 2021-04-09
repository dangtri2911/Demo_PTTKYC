package PTTKYC.MilkTea.model.Interface;

public interface NhanVienBanHang extends NhanVien {
    public void capNhatTinhTrangSanPham();
    public void xemSoLuongBanTrongNgay();
    public void xemDoanhThuNgay();
    public void kiemKeThietBi();
    public void taoHoaDon();
    public void ChinhSuaHoaDon();
    public void inHoaDon(int maDH);
    public void capNhatTrangThaiDon(int maHD);
    public void themMonChoDH(int maDH,int maSP);
    public void xoaMonKhoiDH(int maDH,int maSP);
    public void themGhiChu(int maDH, String noidung);
}
