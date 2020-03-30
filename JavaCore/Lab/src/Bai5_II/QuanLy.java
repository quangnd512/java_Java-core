package Bai5_II;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	List<KhachSan> khachSan;

	public QuanLy() {
		this.khachSan = new ArrayList<>();
	}
	public void add(KhachSan khachSan) {
		this.khachSan.add(khachSan);
	}
	public void hienThi() {
		for (KhachSan khachSan2 : khachSan) {
			System.out.println(khachSan2.toString());
		}
	}
	public void remove(String soCMT) {
		for (KhachSan khachSan2 : new ArrayList<>(khachSan)) {
			if(khachSan2.getSoCMT().equals(soCMT)) {
				this.khachSan.remove(khachSan2);
			}
		}
	}
	public void tienPhong(String soCMT) {
		for (KhachSan khachSan2 : khachSan) {
			if(khachSan2.getSoCMT().equals(soCMT)) {
				if(khachSan2.getLoaiPhong().equals("A")) {
					System.out.println("Phi cua khach hang "+khachSan2.getHoTen()+" la: "+(khachSan2.getSoNgayThue()*500));
				}else if(khachSan2.getLoaiPhong().equals("B")) {
					System.out.println("Phi cua khach hang "+khachSan2.getHoTen()+" la: "+(khachSan2.getSoNgayThue()*300));
				}else {
					System.out.println("Phi cua khach hang "+khachSan2.getHoTen()+" la: "+(khachSan2.getSoNgayThue()*100));
				}
			}
		}
	}
}
