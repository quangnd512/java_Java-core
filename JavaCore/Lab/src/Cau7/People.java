package Cau7;

import java.util.Scanner;

public class People {
	String id;
	String fullname;
	int old;
	
	public People(String id, String fullname, int old) {
		this.id = id;
		this.fullname = fullname;
		this.old = old;
	}

	public People() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID: ");
		id = sc.nextLine();
		System.out.print("Ho va ten: ");
		fullname = sc.nextLine();
		System.out.print("Tuoi: ");
		old = Integer.parseInt(sc.nextLine());
	}
	public void showInfo() {
		System.out.print("ID: "+getId()+", Ho ten: "+getFullname()+", Tuoi: "+getOld());
	}
	
	
	
}
