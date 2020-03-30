package Cau7;

import java.util.Scanner;

public class Container extends Vehicle{

	public Container(int width, int height) {
		super(3, 5);
		// TODO Auto-generated constructor stub
	}
	
	public Container() {
		
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
