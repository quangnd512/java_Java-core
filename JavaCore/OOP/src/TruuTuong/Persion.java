package TruuTuong;

public abstract class Persion {
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
	
	public void getAbstract() {
		System.out.println(name+" da goi duoc lop abstract");
	}
	
	public abstract Object nameAge();// Phuong thuc abstract, khong co chuong trinh chay ben trong
	
}
