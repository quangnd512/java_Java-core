package CollectionsAndFile;

public class Generic_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller<String> controller = new Controller<>();
		controller.add("A");
		controller.add("B");
		controller.add("C");
		System.out.println(controller.get(0));
	}

}
