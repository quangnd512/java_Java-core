package Cau3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManagerCat {
	List<CatDetail> catDetail;

	public ManagerCat() {
		this.catDetail = new ArrayList<>();
	}
	public void add(ColorManager color) {
		System.out.println("Nhap so con meo can them: ");
		Scanner sc = new Scanner(System.in);
		int b = sc .nextInt();
		for (int i = 0; i < b; i++) {
			CatDetail cat = new CatDetail();
			cat.nhap(color);
			catDetail.add(cat);
		}
	}
	public void hienThi() {
		for (CatDetail catDetail2 : catDetail) {
			catDetail2.hienThi();
		}
	}
	public void soft() {
		Collections.sort(catDetail, new Comparator<CatDetail>() {

			@Override
			public int compare(CatDetail o1, CatDetail o2) {
				return o1.getMau().compareToIgnoreCase(o2.getMau());
			}
		});
		hienThi();
	}
	
	public void sortByTableColor() {
		Collections.sort(catDetail, new Comparator<CatDetail>() {

			@Override
			public int compare(CatDetail o1, CatDetail o2) {
				// TODO Auto-generated method stub
				if (o1.getIdColor()>=o2.getIdColor()) {
					return -1;
				}
				return 1;
			}
		});
		hienThi();
	}
	
	public void find() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap loai can tim kiem: ");
		String a = sc.nextLine();
		for (CatDetail catDetail2 : catDetail) {
			if (catDetail2.getLoai().equalsIgnoreCase(a)) {
				catDetail2.hienThi();
			}else {
				System.err.println("Khong tim thay con meo nao");
				break;
			}
		}
		
	}
	
}
