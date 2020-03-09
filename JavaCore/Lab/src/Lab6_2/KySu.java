package Lab6_2;

import java.util.Scanner;

public class KySu extends CanBo{

	private String nganhDaoTao;
	
	public KySu(String hoTen, String namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	public KySu() {
		
	}
	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nganh dao tao: ");
		nganhDaoTao = sc.nextLine();
		System.out.println();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.print("Nganh dao tao: "+getNganhDaoTao());
		System.out.println();
	}
}
