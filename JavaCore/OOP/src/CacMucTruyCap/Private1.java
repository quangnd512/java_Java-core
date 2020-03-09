package CacMucTruyCap;

public class Private1 {
	private int a;

	public void Private1(int a){
		this.a = a; //Truy cập vào cùng 1 class
	}
	public static void main(String[] args) {
		
		//VD: Ta không thể truy cập được vào biến đã ở chế độ private ở một class khác
		Public1 p = new Public1();
		System.out.println(p.b); //Truy cập trực tiếp -> Không truy cập được
		System.out.println(p.getB()); //Truy cập qua phương thức get
	}
}
