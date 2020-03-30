package Singleton;

public class Nguoi {
	String name;
	int age;
	public Nguoi(String name, int age) {
		this.name = name;
		this.age = age;
	};
	
	public void titlePersion() {
		System.out.println("Title: "+name+", "+age);
	}
	
	
}
