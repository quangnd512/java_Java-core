package BT_QuanLySoThu_II;

public class Dog extends Animal{

	@Override
	public void tiengKeu() {
		// TODO Auto-generated method stub
		System.out.println("Dog sound");
	}
	
	public void xemThongTin() {
		super.xemThongTin();
		tiengKeu();
	}

}
