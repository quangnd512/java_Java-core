package ThreadEx;

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread main start");
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo(t1);
		t1.start();
		new Thread(t2).start();
		
		System.out.println("Thread main stop");
	}

}
