package VongLap;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Foreach
		 * for-each giúp chúng ta duyệt mảng mà không cần vị trí của các phần tử đó
		 * 
		 * Cú pháp:
		 *  for(<kieu-du-lieu> <ten-bien-chay> : <ten-mang>){
		 *  	<Khoi-lenh>;
		 *  } 
		 *  VD:
		 */
		int [] array = {1,2,3,4,5};
		for (int i : array) {
			System.out.println(i);
		}
		
		/**
		 * 2. Giới hạn của foreach
		 * + Không thể tìm được vị trí phần tử trong mảng
		 * + Không thể đảo ngược mảng
		 */
	}

}
