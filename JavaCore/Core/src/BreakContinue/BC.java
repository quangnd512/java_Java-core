package BreakContinue;

public class BC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Break: Dùng để thoát ra khỏi vòng lặp ngay khi gặp câu lệnh này
		 * 2. Continue: Dùng để bỏ qua một trường hợp vòng lặp và đến với trường hợp tiếp theo
		 * VD:  
		 */
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		for (int i : array) {
			if(i==5) { 
				continue; // Bỏ qua phần tử 5
			}else if(i==8) {
				break; // Nếu i = 8 thì thoát ra khỏi vòng lặp 
			}
			System.out.println(i);
		}
	}

}
