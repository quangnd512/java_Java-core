package BT_QuanLySV_JSON_toGSON;

import java.io.Serializable;

public class Information implements Serializable {
	String name;
	String address;
	
	public Information() {
	}

	public Information(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println(
				"Ten: "+getName()+
				", Dia chi: "+getAddress());
	}
	
	
}
