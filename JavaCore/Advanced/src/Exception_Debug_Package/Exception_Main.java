package Exception_Debug_Package;

import java.util.Scanner;

public class Exception_Main {
	public static float divide(int x, int y) throws ByZeroException {
		if (y == 0) {
			throw new ByZeroException(x, y);
		}
		return x / y;
	}

	// VD1
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("Phan tu [" + (i + 1) + "]: ");
				arr[i] = sc.nextInt();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Done.!");
		}

		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Done 2");
		}

	}

}
