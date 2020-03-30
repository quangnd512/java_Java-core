package Interface;

public class Hoa implements IPersion{

	@Override
	public void soThich() {
		System.out.println("Hoa thich doc sach "+ book);		
	}
	public static void main(String[] agrs) {
		Hoa hoa = new Hoa();
		hoa.soThich();
	}

}
