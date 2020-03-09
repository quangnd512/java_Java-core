package Mang;

public class Mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Khai báo mảng
		 * Cú pháp: 
		 * 	+ Khai báo: <kieu-du-lieu> [] <ten-mang>;
		 *  + Cấp phát bộ nhớ để tạo mảng: <ten-mang> = new <kieu-du-lieu>[kich-co-mang];
		 * Cú pháp rút gọn:
		 * <kieu-du-lieu> [] ten-mang = new <kieu-du-lieu>[kich-co-mang];
		 * VD:
		 */
		int [] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 9;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
	}

}
