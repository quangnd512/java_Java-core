package Cau3;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorManager {
	ArrayList<String> colorList;

	public ColorManager() {
		this.colorList = new ArrayList<>();
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap ma mau can them: ");
			String color = sc.nextLine();
			colorList.add(color);
			
			System.out.println("Tiep tuc nhap hay khong (Y/N): ");
			String option = sc.nextLine();
			if (option.equalsIgnoreCase("n")) {
				break;
			}
		}
	}
	
	public void display() {
		System.out.println("Danh sach ma mau: ");
		for (int i = 0; i < colorList.size(); i++) {
			System.out.print(" "+colorList.get(i));
		}
		System.out.println();
	}
	
	//Check ma mau
		public int checkMaMau(String color) {
			for (int i = 0; i < colorList.size(); i++) {
				if (colorList.get(i).equalsIgnoreCase(color)) {
					return i;
				}
			}
			return -1;
		}
}
