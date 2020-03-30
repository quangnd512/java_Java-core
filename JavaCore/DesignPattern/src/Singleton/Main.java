package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Khởi tạo đối tượng
		PersionMgr pmr = PersionMgr.getInstance();
		
		//add đối tượng vào list
		pmr.add(new Nguoi("A", 20));
	}

}
