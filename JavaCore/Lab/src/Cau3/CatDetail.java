package Cau3;

import java.util.Scanner;

public class CatDetail implements ICat{
	String loai;
	String mau;
	int idColor;
	String noiSong;
	Scanner sc = new Scanner(System.in);

	public CatDetail(String loai, String mau, String noiSong, int idColor) {
		this.loai = loai;
		this.mau = mau;
		this.idColor = idColor;
		this.noiSong = noiSong;
	}
	
	public CatDetail() {
		
	}
	

	public int getIdColor() {
		return idColor;
	}

	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public String getNoiSong() {
		return noiSong;
	}

	public void setNoiSong(String noiSong) {
		this.noiSong = noiSong;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		System.out.print("Cac loai: ");
		loai = sc.nextLine();
		System.out.print("Noi song: ");
		noiSong = sc.nextLine();
		
	}
	
	public void nhap(ColorManager color) {
		nhap();
		System.out.print("Mau: ");
		while (true) {
			mau = sc.nextLine();
			idColor = color.checkMaMau(mau);
			if(idColor!=-1) {
				break;
			}else {
				System.err.println("Nhap lai ma mau.!");
				color.display();
			}
		}
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		System.out.print("Ten: "+ten+", Loai: "+getLoai()+", Mau sac: "+getMau()+", Noi song: "+getNoiSong());
		System.out.println();
	}

}
