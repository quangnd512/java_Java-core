package Bai2;

public class CongNhan extends CanBo{

	private int bacLuong;
	
	public CongNhan(String hoTen, String namSinh, String gioiTinh, String diaChi, int bacLuong) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.bacLuong = bacLuong;
	}
	
	public int getBacLuong() {
		return bacLuong;
	}
	public void setBacLuong(int bacLuong) {
		this.bacLuong = bacLuong;
	}
	
	@Override
    public String toString() {
        return "Ho va ten: " + getHoTen() + ", Nam sinh: "+getNamSinh()+", Gioi tinh: "+getGioiTinh()+", Dia chi: "+getDiaChi()+", Bac luong: "+getBacLuong();
    }
}
