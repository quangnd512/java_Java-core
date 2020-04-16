package BT_QuanLyMayBay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLy{
	List<VeMayBay> vmb;

	public QuanLy() {
		this.vmb = new ArrayList<>();
	}
	public void add(VeMayBay vmb) {
		this.vmb.add(vmb);
	}
	
	//add
	public void addAir() {
		Scanner sc = new Scanner(System.in);
		System.out.print("So chuyen bay can nhap: ");
		int a = Integer.parseInt(sc.nextLine());
		VeMayBay [] arr = new VeMayBay[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new VeMayBay();
			arr[i].input();
			this.vmb.add(arr[i]);
		}
	}
	
	//Save DuLieuBay.txt
	public void saveAir(List<VeMayBay> vmb ,String fileName) throws IOException{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(vmb);
			System.out.println("Luu vao file thanh cong");
		} catch (Exception e) {
			
		}finally {
			fos.close();
			oos.close();
		}
	}
	
	//display DuLieuBay.txt
	public void readAir(List<VeMayBay> vmb ,String fileName) throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			vmb = (List<VeMayBay>) ois.readObject();
		} catch (Exception e) {
		}finally {
			fis.close();
			ois.close();
		}
		for (int i = 0; i < vmb.size(); i++) {
			vmb.get(i).display();
		}
	}
	
	//Sap xep giam dan theo gia ve
	public void sortAir() {
		Collections.sort(vmb, new Comparator<VeMayBay>() {

			@Override
			public int compare(VeMayBay o1, VeMayBay o2) {
				if(o1.getPrice()>o2.getPrice()) {
					return -1;
				}
				return 1;
			}
		});
		for (int i = 0; i < vmb.size(); i++) {
			vmb.get(i).display();
		}
	}
	
	//Luu thong tin vao cac list rieng cua tung hang bay
		public List<VeMayBay> getAir(String prex) {
			List<VeMayBay> airList = new ArrayList<>();
			for (VeMayBay veMayBay : vmb) {
				if (veMayBay.getId().startsWith(prex)) { //Lay tat ca nhung thang co tien to prex
					airList.add(veMayBay);
				}
			}
			return airList;
		}
	
	//Save thong tin tung hang bay ra file
	public void saveAirId() throws IOException{
		List<VeMayBay> vnAir = getAir("VN");
		saveAir(vnAir, "VietNamAir.txt");
		List<VeMayBay> vjAir = getAir("VJ");
		saveAir(vjAir, "VietJetAir.txt");
		List<VeMayBay> jetAir = getAir("JET");
		saveAir(jetAir, "JetarAir.txt");
	}
}
