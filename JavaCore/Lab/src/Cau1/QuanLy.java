package Cau1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLy {
	List<Studen> studens;

	public QuanLy() {
		this.studens = new ArrayList<>() ;
	}
	public void add(Studen studen) {
		this.studens.add(studen);
	}
	public void hienThi() {
		for (Studen studen : studens) {
			studen.hienThi();
		}
	}
	public void diemTBmaxMin() {
		int min = 0, max = 0;
		float minTB = this.studens.get(0).getDiemTB();
		float maxTB = this.studens.get(0).getDiemTB();
		for (int i = 1; i < this.studens.size(); i++) {
			if(this.studens.get(i).getDiemTB()<minTB) {
				min = i;
				minTB = studens.get(i).getDiemTB();
			}
			if(this.studens.get(i).getDiemTB()>maxTB) {
				max = i;
				maxTB = studens.get(i).getDiemTB();
			}
		}
		System.out.print("Sinh vien co diem cao nhat la: ");
		this.studens.get(max).hienThi();
		System.out.print("Sinh vien co diem thap nhat la: ");
		this.studens.get(min).hienThi();
	}
	
	public void search(String searchMSV) {
		int count = 0;
		for (Studen studen : studens) {
			if (studen.getMaSV().equals(searchMSV)) {
				studen.hienThi();
				count++;
			}
		}
		if (count==0) {
			System.out.println("Khong co sinh vien nao duoc tim thay");
		}
	}
	
	public void sapXepTenSV() {
		Collections.sort(studens, new Comparator<Studen>() {

			@Override
			public int compare(Studen o1, Studen o2) {
				int cmp = o1.getName().compareTo(o2.getName());
				if(cmp>0) {
					return 1;
				}
				return -1;
			}
		});
		
		for (int i = 0; i < studens.size(); i++) {
			studens.get(i).hienThi();
		}
	}
	public void sapXepTenHB() {
		Collections.sort(studens, new Comparator<Studen>() {

			@Override
			public int compare(Studen o1, Studen o2) {
				return o1.getDiemTB()>o2.getDiemTB()?-1:1;
			}
		});
		
		for (int i = 0; i < studens.size(); i++) {
			if (studens.get(i).getDiemTB()>=8) {
				studens.get(i).hienThi();
			}
		}
	}
}
