package Ex1;

import javax.swing.JTextField;

public class Student {
	String hoTen;
	String address;
	String email;
	int id;
	
	public Student(String hoTen, String address, String email) {
		this.hoTen = hoTen;
		this.address = address;
		this.email = email;
	}
	
	public Student(int id, String hoTen, String address, String email) {
		this.id = id;
		this.hoTen = hoTen;
		this.address = address;
		this.email = email;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
