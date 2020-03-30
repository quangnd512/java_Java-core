package DaLuong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareData sd = new ShareData();
		Thread1 t1 = new Thread1(sd);
		Thread1 t2 = new Thread1(sd);
		Thread1 t3 = new Thread1(sd);
		Thread1 t4 = new Thread1(sd);
		Thread1 t5 = new Thread1(sd);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
