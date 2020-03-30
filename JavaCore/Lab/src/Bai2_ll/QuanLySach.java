package Bai2_ll;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
	List<ThuVien> thuVien;

	public QuanLySach() {
		this.thuVien = new ArrayList<>();
	}
	public void add(ThuVien thuVien) {
		this.thuVien.add(thuVien);
	}
	
	public void hienThi() {
		for (ThuVien thuVien2 : thuVien) {
			System.out.println(thuVien2.toString());
		}
	}
	
	public void searchSach() {
		this.thuVien.stream().filter(doc->doc instanceof Sach).forEach(doc->System.out.println(doc.toString()));
	}
	
	public void searchTapChi() {
		this.thuVien.stream().filter(doc->doc instanceof TapChi).forEach(doc->System.out.println(doc.toString()));
	}
	
	public void searchBao() {
		this.thuVien.stream().filter(doc->doc instanceof Bao).forEach(doc->System.out.println(doc.toString()));
	}
	
	public boolean delete(String id) {
		ThuVien tv = thuVien.stream().filter(o->o.getMaTaiLieu().equals(id)).findFirst().orElse(null);
		if(tv==null) {
			return false;
		}
		this.thuVien.remove(tv);
		return true;
	}
}
