package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listInt = new ArrayList<Integer>();
		int max =10, min = 1;
		for (int i = 0; i < 10; i++) {
			Random rad = new Random();
			int radInt = rad.nextInt(max-min +1)+min;
			listInt.add(radInt);
		}
		
		System.out.println("Chua sap xep: ");
		for (Integer integer : listInt) {
			System.out.print(integer.toString()+" ");
		}
		
		System.out.println("\nSap xep: ");
		
		Collections.sort(listInt);
		
		for (Integer integer : listInt) {
			System.out.print(integer.toString()+" ");
		}
	}
}
