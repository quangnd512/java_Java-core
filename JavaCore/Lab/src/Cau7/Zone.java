package Cau7;

import java.util.ArrayList;
import java.util.Scanner;

public class Zone {
	ArrayList<Area> areaList = new ArrayList<>();
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so khu vuc cho zone: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Area area = new Area();
			area.input();
			areaList.add(area);
		}
	}
	public void inputVehicle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so xe can them: ");
		int n = sc.nextInt();
		int m;
		
		for (int i = 0; i < n; i++) {
			showOption();
			m = Integer.parseInt(sc.nextLine());
			Vehicle vehicle;
			if(m==1) {
				vehicle = new Car();
			}else {
				vehicle = new Container();
			}
			vehicle.input();
			// Tim khu vuc de luu vao zone
			for (int j = 0; j < areaList.size(); j++) {
				if (areaList.get(i).checkAvaiable(vehicle)) {
					areaList.get(i).add(vehicle);
					break;
				}
			}
		}
	}
	private void showOption() {
		System.out.println("1. Nhap Car");
		System.out.println("2. Nhap Container");
		System.out.println("Lua chon: ");
		
	}
	
	public void sort() {
		for (int i = 0; i < areaList.size(); i++) {
			areaList.get(i).sort();
		}
	}
	public void showInfo() {
		for (int i = 0; i < areaList.size(); i++) {
			areaList.get(i).showInfo();
		}
	}
}
