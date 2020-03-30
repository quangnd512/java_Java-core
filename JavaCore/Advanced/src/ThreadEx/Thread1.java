package ThreadEx;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("I : "+(i+1));
				}
			}
		});
		t.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// code
				
			}
		}).start();
		
		System.out.println("End");
	}

}
