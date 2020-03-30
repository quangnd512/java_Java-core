package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay thang: ");
		String str = sc.nextLine();
		
		String StrPattern = "[0-9]{1,2}[-|/][0-9]{1,2}[-|/][0-9]{4}";
		String StrPattern1 = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
		
		
		Pattern pt = Pattern.compile(StrPattern);
		Matcher mc = pt.matcher(str);
		if (mc.find()) {
			System.out.println("Ket qua: "+str);
		}else {
			System.out.println("Dinh dang sai.!");
		}
	}
}
