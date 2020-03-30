package ThreadEx;

public class Main {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
		try {
			t2.join();
			
			//Hien thi ket qua
			System.out.println("Hien thi ket qua sinh ngau nhien cua 2 Thread: ");
			System.out.println("Thread 1: ");
			for (int i = 0; i < t1.listData.size(); i++) {
				System.out.print(" "+t1.listData.get(i));
			}
			System.out.println();
			System.out.println("\nThread 2: ");
			for (int i = 0; i < t2.list2.size(); i++) {
				System.out.print(" "+t2.list2.get(i));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
