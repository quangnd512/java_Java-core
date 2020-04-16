package BT_QuanLySoThu_II;

public class Cat extends Animal{

	@Override
	public void tiengKeu() {
		// TODO Auto-generated method stub
		System.out.println("Cat sound");
		
	}
	
	public void xemThongTin() {
		super.xemThongTin();
		tiengKeu();
	}

}
