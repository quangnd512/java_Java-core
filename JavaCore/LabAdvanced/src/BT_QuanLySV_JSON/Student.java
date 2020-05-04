package BT_QuanLySV_JSON;

import java.util.Scanner;

import org.json.JSONObject;


public class Student {
	String fullname;
	String birthday;
	String email;
	String address;
	String gender;
	
	public Student() {
		super();
	}

	public Student(String fullname, String birthday, String email, String address, String gender) {
		super();
		this.fullname = fullname;
		this.birthday = birthday;
		this.email = email;
		this.address = address;
		this.gender = gender;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void parse(JSONObject obj) {
		fullname = obj.getString("fullname");
		birthday = obj.getString("birthday");
		email = obj.getString("email");
		address = obj.getString("address");
		gender = obj.getString("gender");
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho va ten: ");
		fullname = sc.nextLine();
		System.out.println("Ngay sinh: ");
		birthday = sc.nextLine();
		System.out.println("Email: ");
		email = sc.nextLine();
		System.out.println("Dia chi: ");
		address = sc.nextLine();
		System.out.println("Gioi tinh: ");
		gender = sc.nextLine();
	}
	
	public void display() {
		System.out.println(
				"Ho ten: "+getFullname()+
				", Ngay sinh: "+getBirthday()+
				", Email: "+getEmail()+
				", Dia chi: "+getAddress()+
				", Gioi tinh: "+getGender());
	}
	
}
