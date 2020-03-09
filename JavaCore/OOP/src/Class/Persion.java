package Class;

public class Persion {
	public String name;
	public int age;
	public float height;
	
	//Phương thức khởi tạo
	public Persion(String name, int age, float height) {
		this.name = name;  //this.name là để gọi đến biến name của class dùng để phân biệt biến name của phương thức
		this.age = age;
		this.height = height;
	}
	
	public void go(String howGo) { //Phương thức
		System.out.println(name+" đi tới "+howGo+". Cậu ấy "+age+" tuổi. Cao "+height+"cm.!");
	}

}
