package Cau7;

import java.util.Scanner;

public class Car extends Vehicle{

	public Car(int width, int height) {
		super(2, 3);
		// TODO Auto-generated constructor stub
	}

	public Car() {
		
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nha san xuat: ");
		nhaSX = sc.nextLine();
		System.out.print("Bien so xe: ");
		bienSoXe = sc.nextLine();
		System.out.print("Nam san xuat: ");
		namSX = sc.nextLine();
		System.out.print("Chu so huu: ");
		nhaSX = sc.nextLine();
	}
	
	
	
}
