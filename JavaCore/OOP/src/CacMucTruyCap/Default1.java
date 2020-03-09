package CacMucTruyCap;
import KhaiNiemOOP.*;

public class Default1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * VD: Truy cập vào thuộc tính age trong pakage KhaiNiemOOP thì không thể truy cập được
		 */
		Persion p = new Persion();
		System.out.println(p.getAge());
		System.out.println(p.age);
	}

}
