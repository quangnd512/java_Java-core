package Bai2;

public class KySu extends CanBo{

	private String nganhDaoTao;
	
	public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, namSinh, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	@Override
    public String toString() {
        return "Ho va ten: " + getHoTen() + ", Nam sinh: "+getNamSinh()+", Gioi tinh: "+getGioiTinh()+", Dia chi: "+getDiaChi()+", Nganh dao tao: "+getNganhDaoTao();
    }
	
}
