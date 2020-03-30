package Cau7;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleMgr {
	ArrayList<People> peopleList = new ArrayList<>();
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so chu xe: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			People people = new People();
			people.input();
			peopleList.add(people);
			
		}
	}
}
