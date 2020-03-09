package TruuTuong;


public class PhuongThucTT extends Persion{ 

	public PhuongThucTT(String name, int age, float height) {
		super(name, age, height);
	}
	
	// Dinh nghia lai phuong thuc truu tuong
	@Override
	public Object nameAge() {
		Test t = new Test("Quang", 25, 1.67f, 8);
		System.out.println("Toi la "+this.name+" nam nay "+this.age+" tuoi.!");
		return t;
	}

	public static void main(String[] args) {
		PhuongThucTT t = new PhuongThucTT("Ha", 20, 1.7f);
		t.nameAge(); //Goi phuong thuc truu tuong
	}
}
