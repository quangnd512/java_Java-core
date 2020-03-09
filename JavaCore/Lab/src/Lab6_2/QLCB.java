package Lab6_2;

import java.util.Scanner;

public class QLCB {
	public int soCanBo;
	public String maSoCB;
	CongNhan [] congNhan;
	NVPhucVu [] nvPhucVu;
	KySu [] kySu;
	public QLCB(int soCanBo, String maSoCB, CongNhan [] congNhan, NVPhucVu [] nvPhucVu, KySu [] kySu) {
		this.soCanBo = soCanBo;
		this.maSoCB = maSoCB;
		this.congNhan = congNhan;
		this.nvPhucVu = nvPhucVu;
		this.kySu = kySu;
	}
	public QLCB() {
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("So luong can bo can nhap: ");
		soCanBo = sc.nextInt();
		System.out.println("Nhap ma so can bo (CN, NV, KS): ");
		maSoCB = sc.next();
		if(maSoCB.compareTo("CN")==0) {
			congNhan = new CongNhan[soCanBo];
			for (int i = 0; i < congNhan.length; i++) {
				congNhan[i] = new CongNhan(); 
				congNhan[i].nhap();
			}
		}else if(maSoCB.compareTo("NV")==0) {
			nvPhucVu = new NVPhucVu[soCanBo];
			for (int i = 0; i < nvPhucVu.length; i++) {
				nvPhucVu[i] = new NVPhucVu();
				nvPhucVu[i].nhap();
			}
		}else {
			kySu = new KySu[soCanBo];
			for (int i = 0; i < kySu.length; i++) {
				kySu[i] = new KySu();
				kySu[i].nhap();
			}
		}
	}

	public void hienThi() {
		if(maSoCB.compareTo("CN")==0) {
			for (int i = 0; i < congNhan.length; i++) {
				congNhan[i].hienThi();
			}
		}else if(maSoCB.compareTo("NV")==0) {
			for (int i = 0; i < nvPhucVu.length; i++) {
				nvPhucVu[i].hienThi();
			}
		}else {
			for (int i = 0; i < kySu.length; i++) {
				kySu[i].hienThi();
			}
		}
	}
	
	public void timKiem() {
		String search;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tu can tim kiem: ");
		search = sc.next();
		if(maSoCB.compareTo("CN")==0) {
			for (int i = 0; i < congNhan.length; i++) {
				if(search.compareTo(congNhan[i].getHoTen())==0) {
					congNhan[i].hienThi(); 
					break;
				}else {
					System.out.println("Khong co tu can tim.!");
					break;
				}
			}
		}else if(maSoCB.compareTo("NV")==0) {
			for (int i = 0; i < nvPhucVu.length; i++) {
				if(search.compareTo(nvPhucVu[i].getHoTen())==0) {
					nvPhucVu[i].hienThi();
				}else {
					System.out.println("Khong co tu can tim.!");
					break;
				}
			}
		}else {
			for (int i = 0; i < kySu.length; i++) {
				if(search.compareTo(kySu[i].getHoTen())==0) {
					kySu[i].hienThi();
				}else {
					System.out.println("Khong co tu can tim.!");
					break;
				}
			}
		}
	}
}

