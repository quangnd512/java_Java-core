package Bai4_II;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
	private int soHoGiaDinh;
	HoGiaDinh [] hoGiaDinh;
	public KhuPho(int soHoGiaDinh, HoGiaDinh[] hoGiaDinh) {
		this.soHoGiaDinh = soHoGiaDinh;
		this.hoGiaDinh = hoGiaDinh;
	}
	public KhuPho() {
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so ho gia dinh trong khu pho: ");
		soHoGiaDinh = sc.nextInt();
		hoGiaDinh = new HoGiaDinh[soHoGiaDinh];
		for (int i = 0; i < hoGiaDinh.length; i++) {
			System.out.println("Ho gia dinh "+(i+1));
			hoGiaDinh[i] = new HoGiaDinh();
			hoGiaDinh[i].nhap();
		}
	}
	public void hienThi() {
		for (int i = 0; i < hoGiaDinh.length; i++) {
			System.out.println("Ho gia dinh "+(i+1));
			hoGiaDinh[i].hienThi();
			System.out.println();
		}
	}
}
