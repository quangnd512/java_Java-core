package Exception_Debug_Package;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sum;
		try {
			sum = Exception_Main.divide(5, 0);
			System.out.println("Sum: "+sum);
		} catch (ByZeroException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("Quang");
		sb.append("ND");
		System.out.println(sb.toString());
	}

}
