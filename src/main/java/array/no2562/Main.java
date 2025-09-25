package array.no2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loopCount = 9;
		int[] array = new int[loopCount];
		int index = 0;
		int max = 0;

		for(int i = 0; i < loopCount; i++) {
			array[i] = sc.nextInt();
			if (i == 0) {
				max = array[i];
				index = i+1;
			} else if (array[i] > max) {
				max = array[i];
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
