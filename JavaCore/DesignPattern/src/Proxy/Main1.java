package Proxy;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMessage executor = new Proxy("quangnd", "quang123@");
		executor.runMessage("quangnd");
	}
}
