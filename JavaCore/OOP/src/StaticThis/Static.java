package StaticThis;

public class Static {
		public String name;
		public int age;
		public float height; 
		
		//Thuộc tính static
		public static String univer = "ABC";
		public static int total = 0;
		
		public Static(String name,int age,float height) {
			this.name = name;
			this.age = age;
			this.height = height;
			total+=1;
		}
		
		//Phương thức staic
		public static void getInfo() {
			System.out.println("Xin chao truong "+univer);
		}
		/**
		 * Note:
		 * Không thể gọi thuộc tính name vào trong phương thức static được.
		 */
		
		
		static String core;
		
		//Khoi static
		static {
			System.out.println("KMA");
			core = "ATTT";
		}
		public static void main(String[] args) {
			System.out.println("Test "+core);
		}
		
		
}
