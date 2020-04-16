package BT_QuanLySoThu_II;

import java.util.ArrayList;
import java.util.Scanner;

public class Chuong {
	int maChuong;
	ArrayList<Animal> animalList;
	
	public Chuong() {
		this.animalList = new ArrayList<>();
	}
	
	public int getMaChuong() {
		return maChuong;
	}

	public void setMaChuong(int maChuong) {
		this.maChuong = maChuong;
	}

	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void display() {
		for (Animal animal : animalList) {
			animal.xemThongTin();
		}
	}
	
	public void deleteAnimal(String name) {
		for (Animal animal : animalList) {
			if (animal.getTen().equalsIgnoreCase(name)) {
				animalList.remove(animal);
				break;
			}
		}
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma chuong: ");
		maChuong = Integer.parseInt(sc.nextLine());
	}
}