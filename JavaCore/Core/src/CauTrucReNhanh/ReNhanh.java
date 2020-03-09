package CauTrucReNhanh;

public class ReNhanh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. if else
		 * VD:
		 */
		int a = 10, b = 20;
		if(a>b) {
			System.out.println("A lon hon B.!");
		}else if(a<b){
			System.out.println("A nho hon B.!");
		}else {
			System.out.println("Hai so bang nhau.!");
		}
		
		/**
		 * 2. witch case
		 * VD:
		 */
		int c = 15;
		switch (c) {
		case 25:
			System.out.println("C bang 25");
			break;

		default: System.out.println("C khong bang 25");
			break;
		}
	}

}
