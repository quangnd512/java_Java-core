package Cau7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Area {
	String address;
	int width;
	int height;
	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	public Area() {
	}
	public void add(Vehicle vehicle) {
		this.vehicleList.add(vehicle);
	}
	
	public void sort() {
		Collections.sort(vehicleList, new Comparator<Vehicle>() {

			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				// TODO Auto-generated method stub
				if (o1.getS()<o2.getS()) {
					return -1;
				}
				return 1;
			}
		});
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vi tri: ");
		address = sc.nextLine();
		System.out.print("Chieu dai: ");
		width = Integer.parseInt(sc.nextLine());
		System.out.print("Chieu rong: ");
		height = Integer.parseInt(sc.nextLine());
	}
	
	
	/////////
	public boolean checkAvaiable(Vehicle vehicle) {
		//Xep cheo - giai thuat sai
		int useWitch = 0;
		int useHeight = 0;
		for (Vehicle v : vehicleList) {
			useWitch += v.getWidth();
			useHeight +=v.getHeight();
		}
		int avaialbeWitch = width - useWitch;
		int avaialbeHeight = height - useHeight;
		if (avaialbeWitch>=vehicle.getWidth()&&avaialbeHeight>=vehicle.getHeight()) {
			return true;
		}
		return false;
	}
	/////////
	
	
	public void showInfo() {
		for (int i = 0; i <  vehicleList.size(); i++) {
			vehicleList.get(i).showInfo();
		}
	}
}
