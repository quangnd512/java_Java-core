package ThreadEx2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		Thread1 t1 = new Thread1(data);
		Thread2 t2 = new Thread2(data);
		t2.start();
		t1.start();
	}

}
