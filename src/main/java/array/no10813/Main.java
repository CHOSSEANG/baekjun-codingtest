package array.no10813;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		int loopCount = sc.nextInt();

		for(int i = 0; i < arrayLength; i++) {
			array[i] = i+1;
		}

		for(int i = 0; i < loopCount; i++) {
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			int temp = array[firstNum - 1];
			array[firstNum - 1] = array[secondNum - 1];
			array[secondNum - 1] = temp;
		}

		for(int i = 0; i < arrayLength; i++) {
			if (i == 0) {
				System.out.print(array[i]);
			} else{
				System.out.print(" " + array[i]);
			}
		}
	}
}
