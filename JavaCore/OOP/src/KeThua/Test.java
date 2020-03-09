package KeThua;


public class Test extends Persion{ //Ke thua

	public int count;
	
	public Test(String name, int age, float height, int count) {
		super(name, age, height);
		// TODO Auto-generated constructor stub
		this.count = count;
	}

	
	public void getInfo() {
		super.getInfo();
		System.out.println("Diem la: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion p = new Persion("Quang", 20, 168f);
		Test t = new Test("Son", 20, 1.7f, 17);
		p.getInfo();
		System.out.println("\n");
		t.getInfo();
	}
}
