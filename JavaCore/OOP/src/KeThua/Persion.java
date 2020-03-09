package KeThua;

public class Persion {
	public String name;
	public int age;
	public float height;
	
	public Persion(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void getInfo() {
		System.out.println("Ten: "+name+", Tuoi: "+age+", Chieu cao: "+height);
	}
}
