package ViDu;

public class Teacher extends Student{
	String boMon;
	
	public void title() {
		super.title();
		System.out.println("Teacher extends Student");
	}
}
