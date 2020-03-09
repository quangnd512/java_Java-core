package ToanTu;

public class ToanTu {

	public static void main(String[] args) {
	/**
	* 1. ++ và --
	* VD:
	*/		
		int a = 1;
		System.out.println(a++); //a++ = a = 1 => a = 1 ++ = 2
		System.out.println(++a); //++a = a ++ = 3 => a = 3
		System.out.println(a+++1); //a++ + 1 = a + 1 = 4 => a = 4
		System.out.println(++a+1); //++a +1 = 4++ +1 =5 => a = 5
		
	/**
	 * 2. Toán tử logic !
	 * Là phủ phủ định của biến
	 * 
	 * 3. Toán tử gán
	 * A += B <=> A = A + B
	 * 
	 * 4. Toán tử điều kiện
	 * Biến = (Điều kiện) ? (giá trị nếu đúng) : (giá trị nếu sai)
	 * VD:
	 */
		int b =8, c=9,e=b+c, f=b*c;
		int d = (2<3)?f:e;
		System.out.println(d);
		
	/**
	 * 
	 */
	}

}
