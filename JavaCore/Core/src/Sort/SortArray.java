package Sort;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int [] arr = {1,3,5,2,4,9,7,6,10,8};
		System.out.println("Truoc sap xep: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		Arrays.sort(arr);
		
		
		System.out.println("sau sap xep: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
}
