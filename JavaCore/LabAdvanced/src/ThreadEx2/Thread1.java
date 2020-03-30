package ThreadEx2;

public class Thread1 extends Thread{
	Data data;
	
	public Thread1(Data data) {
		this.data = data;
	}


	@Override
	public void run() {
		for (int i = 0; i < data.name.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (data) {
				System.out.println("Ten sinh vien: "+data.name[i]);
				data.notifyAll();
				try {
					data.wait();  //t1 delay
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
