package DaLuong;

public class ShareData {
	public int x = 0;
	
	public synchronized void add(int plus) {
		x+=plus;
		System.out.println("\nDay so "+x+": ");
		for (int i = 0; i < x; i++) {
			System.out.print(" "+i);
		}
	}
}
