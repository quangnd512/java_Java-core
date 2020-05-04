package BT_QuanLySV_JSON_toGSON;

import java.io.Serializable;

public class ClassRom implements Serializable {
	Information information;
	Student [] studentList;

	public ClassRom() {

	}
	
	public void display() {
		information.display();
		for (Student student : studentList) {
			student.display();
		}
	}
	
}
