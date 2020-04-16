package BT_QuanLySoThu_II;

public class Tiger extends Animal{

	@Override
	public void tiengKeu() {
		System.out.print("Tiger sound");
	}
	
	public void xemThongTin() {
		super.xemThongTin();
		tiengKeu();
	}

}