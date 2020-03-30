package Bai2;

public class NVPhucVu extends CanBo{
	private String congViec;
	
	public NVPhucVu(String hoTen, String namSinh, String gioiTinh, String diaChi, String congViec) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.congViec = congViec;
	}
	public String getCongViec() {
		return congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	@Override
    public String toString() {
        return "Ho va ten: " + getHoTen() + ", Nam sinh: "+getNamSinh()+", Gioi tinh: "+getGioiTinh()+", Dia chi: "+getDiaChi()+", Cong viec: "+getCongViec();
    }

}
