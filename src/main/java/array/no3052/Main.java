package array.no3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = 10;
		int divideValue = 42;
		int[] array = new int[loop];
		boolean[] boolArray = new boolean[divideValue];
		int result = 0;


		for(int i = 0; i < loop; i++) {
			array[i] = sc.nextInt();
			boolArray[array[i]%divideValue] = true;
		}

		for (boolean value : boolArray) {
			if (value) {
				result++;
			}
		}
		System.out.println(result);
	}
}
