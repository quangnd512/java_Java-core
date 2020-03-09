package EpKieu;

public class EpKieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Cac kieu du lieu tu nho den lon
		 * byte->short->int->long->float->double : Ngầm định. Tự máy sẽ chuyển đổi
		 * 
		 * 2. Ép kiểu là chuyển kiểu dữ liệu lớn sang kiểu dữ liệu nhỏ hơn
		 * Cú pháp: (<Kieu-du-lieu>)<ten-bien>
		 * VD:
		 */
		float a = 5.8f;
		int b = (int)a;
		System.out.println(b);
	}

}
