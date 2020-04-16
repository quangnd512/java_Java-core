package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap email: ");
		String str = sc.nextLine();
		
		String StrPattern = "^[a-zA-Z]+[-]?[\\w-]+[@]{1}[\\w]{2,}[.]{1}[a-z]{2,}$";
		
		
		Pattern pt = Pattern.compile(StrPattern);
		Matcher mc = pt.matcher(str);
		if (mc.find()) {
			System.out.println("Ket qua: "+str);
		}else {
			System.out.println("Dinh dang sai.!");
		}
	}

}

