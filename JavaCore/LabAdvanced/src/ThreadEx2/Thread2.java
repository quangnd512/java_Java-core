package ThreadEx2;

public class Thread2 extends Thread{
	Data data;
	
	public Thread2(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < data.address.length; i++) {
			synchronized (data) {
				data.notifyAll();
				try {
					data.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Que quan: "+data.address[i]);
			}
			synchronized (data) {
				data.notifyAll();
			}
		}
	}
}
