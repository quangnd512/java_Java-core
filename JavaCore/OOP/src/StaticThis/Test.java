package StaticThis;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static st = new Static("Quang", 25, 1.67f);
		System.out.println("Ten truong: "+Static.univer); //Goi thong qua ten class de goi thuoc tinh hoac phuong thuc static
		System.out.println("Ten truong doi tuong: "+st.univer); //Day la cach goi bang doi tuong
		System.out.println("Total static: "+Static.total);
		System.out.println("Total object: "+st.total);
		
		//Goi 1 doi tuong khac
		Static st1 = new Static("Son", 26, 1.7f);
		System.out.println("Goi doi tuong khac: "+st1.total); //Luc nay thuoc tinh total = 1 do chung ta da goi ra static o phia tren nen no luu lai gia tri thuoc tinh static = 1
		
		//Goi ra phuong thuc tinh
		Static.getInfo();
	}

}
