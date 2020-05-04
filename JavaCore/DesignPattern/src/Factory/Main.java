package Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = Factory.getComputer("pc", "4gb", "500gb", "i5");
		Computer server = Factory.getComputer("server", "16gb", "2tb", "i7");
		System.out.println("PC: "+pc);
		System.out.println("Server: "+server);
	}

}
