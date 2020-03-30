package Bai7_II;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	List<CBGV> giaoVien;

	public QuanLy() {
		this.giaoVien = new ArrayList<>();
	}
	public void add(CBGV giaoVien) {
		this.giaoVien.add(giaoVien);
	}
	public void hienThi() {
		for (CBGV cbgv : giaoVien) {
			System.out.println(cbgv.toString());
		}
	}
	public void remove(String maSoGV) {
		for (CBGV cbgv : new ArrayList<>(giaoVien)) {
			if(cbgv.getMaSoGiaoVien().equals(maSoGV)) {
				this.giaoVien.remove(cbgv);
			}
		}
	}
	public void thucLinh(String maSoGV) {
		System.out.print("Luong giao vien: ");
		for (CBGV cbgv : giaoVien) {
			if(cbgv.getMaSoGiaoVien().equals(maSoGV)) {
				System.out.print(cbgv.getLuongCung()+cbgv.getLuongThuong()-cbgv.getTienPhat());
			}
		}
	}
	
}
