package ThreadEx3;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class VeMayBay implements Serializable{
	String id;
	String name;
	String date;
	String bag;
	int price;
	public VeMayBay(String id, String name, String date, String bag, int price) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.bag = bag;
		this.price = price;
	}
	public VeMayBay() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBag() {
		return bag;
	}
	public void setBag(String bag) {
		this.bag = bag;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma chuyen bay: ");
		while (true) {
			id = sc.nextLine();
			String pattermStr="";
			if (id.startsWith("VJ")) {
				pattermStr = "VJ[1-9]{1}[0-9]{2}";
			}else if(id.startsWith("VN")) {
				pattermStr = "VN[1-9]{1}[0-9]{2}[0-9]?";
			}else if(id.startsWith("JET")){
				pattermStr = "JET[1-9]{1}[0-9]{2}";
			}else {
				System.err.println("Nhap sai cu phap.!");
				continue;
			}
			
			Pattern patterm = Pattern.compile(pattermStr);
			Matcher matcher = patterm.matcher(id);
			if (matcher.find()) {
				break;
			}else {
				System.err.println("Nhap sai cu phap.!");
			}
		}
		System.out.println("Ten chuyen bay: ");
		name = sc.nextLine();
		System.out.println("Ngay bay: ");
		date = sc.nextLine();
		System.out.println("Hanh ly ky gui: ");
		bag = sc.nextLine();
		System.out.println("Gia ve: ");
		price = Integer.parseInt(sc.nextLine());
	}
	public void display() {
		System.out.println("Ma chuyen bay: "+getId()+", Ten chuyen bay: "+getName()+", Ngay bay: "+getDate()+", Hanh ly ky gui: "+getBag()+", Gia ve: "+getPrice());
	}
}
