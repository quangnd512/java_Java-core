package KhaiNiemOOP;

public class Info {

	public static void main(String[] args) {
		Persion quang = new Persion();
		quang.name = "Quang";
		quang.age = 26;
		quang.height = 1.68f;
		System.out.println("Ten: "+quang.name+", "+"Tuoi: "+quang.age+", "+"Chieu cao: "+quang.height);
		
		//Khai bao kieu mang
		Persion [] a = new Persion[3]; //Goi doi mang doi tuong
		//Thay <kieu_du_lieu> = <Ten_class>
		for(int i=0;i<a.length;i++) {
			a[i] = new Persion(); //Khai bao doi tuong
			
			a[i].name = "Hoc sinh "+(i+1);
			a[i].age = i+16;
			a[i].height = 1.6f;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("Ten: "+a[i].name+", "+"Tuoi: "+a[i].age+", "+"Chieu cao: "+a[i].height);
		}
	}
}
