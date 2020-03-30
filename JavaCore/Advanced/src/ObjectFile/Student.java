package ObjectFile;

import java.io.Serializable;

public class Student implements Serializable{
	String name;
	String gender;
	public Student() {
	}
	
	public Student(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void display() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
