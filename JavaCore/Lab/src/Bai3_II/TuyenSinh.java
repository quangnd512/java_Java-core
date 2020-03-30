package Bai3_II;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
	List<ThiSinh> thiSinh;

	public TuyenSinh() {
		this.thiSinh = new ArrayList<>();
	}
	public void add(ThiSinh thiSinh) {
		this.thiSinh.add(thiSinh);
	}
	public void hienThi() {
		for (ThiSinh thiSinh2 : thiSinh) {
			System.out.println(thiSinh2.toString());
		}
	}
	public void search(String sbd) {
		for (ThiSinh thiSinh2 : thiSinh) {
			if(thiSinh2.getSBD().equals(sbd)==true) {
				System.out.println(thiSinh2.toString());
			}
		}
	}
	
}
