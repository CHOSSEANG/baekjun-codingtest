package array.no10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int result = 0;
		int[] array = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			int input = sc.nextInt();
			array[i] = input;
		}

		int targetValue = sc.nextInt();


		for(int a : array) {
			if(a == targetValue) {
				result++;
			}
		}
		System.out.println(result);
	}
}
