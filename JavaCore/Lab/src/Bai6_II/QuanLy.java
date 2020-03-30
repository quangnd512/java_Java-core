package Bai6_II;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	List<Truong> truong;

	public QuanLy() {
		this.truong = new ArrayList<>();
	}
	public void add(Truong truong) {
		this.truong.add(truong);
	}
	public void hienThi() {
		for (Truong truong2 : truong) {
			System.out.println(truong2.toString());
		}
	}
	public void searchHS20() {
		for (Truong truong2 : truong) {
			if (truong2.getTuoi()==20) {
				System.out.println(truong2.toString());
			}
		}
	}
	public void timSLhocSinh() {
		int dem = 0;
		for (Truong truong2 : truong) {
			if (truong2.getTuoi()==23&&truong2.getQueQuan().equals("DN")) {
				dem++;
			}
		}
		System.out.println("So hoc sinh 23 tuoi que DN la: "+dem);
	}
	
}
