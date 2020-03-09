package TryCatch;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int [] array = {1,2,3};
			System.out.println(array[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Mang chi co the xuat ra so array[2]");
		}
	}

}
