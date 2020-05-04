package BT_QuanLySV_JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClassRom {
	String className;
	String classAddress;
	
	List<Student> studentList = new ArrayList<>();

	public ClassRom() {

	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassAddress() {
		return classAddress;
	}

	public void setClassAddress(String classAddress) {
		this.classAddress = classAddress;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten lop hoc: ");
		className = sc.nextLine();
		System.out.println("Nhap dia chi lop hoc: ");
		classAddress = sc.nextLine();
		
		System.out.println("Nhap so hoc vien: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			Student std = new Student();
			std.input();
			studentList.add(std);
		}
	}
	
	public void display() {
		System.out.println("Ten lop: "+getClassName()+", Dia chi lop hoc: "+getClassAddress());
		for (Student student : studentList) {
			student.display();
		}
	}
	
	public void parse(JSONObject obj) {
		JSONObject infomationObj = obj.getJSONObject("information");
		JSONArray studentListObj = obj.getJSONArray("studentList");
		
		className = infomationObj.getString("name");
		classAddress = infomationObj.getString("address");
		
		for (int i = 0; i < studentListObj.length(); i++) {
			JSONObject stdObj = studentListObj.getJSONObject(i);
			
			Student std = new Student();
			std.parse(stdObj);
			studentList.add(std);
		}
	}
	
	
}
