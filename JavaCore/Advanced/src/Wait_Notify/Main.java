package Wait_Notify;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareData share = new ShareData();
		Thread1 t1 = new Thread1(share);
		Thread2 t2 = new Thread2(share);
		t1.start();
		t2.start();
	}

}
