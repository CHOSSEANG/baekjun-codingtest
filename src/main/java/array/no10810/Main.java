package array.no10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int ballInput = sc.nextInt();
		int[] array = new int[arrayLength];

		for(int i = 0; i < ballInput; i++) {
			int front = sc.nextInt();
			int back = sc.nextInt();
			int ballNum = sc.nextInt();
			for(int j = front-1; j <= back-1; j++) {
				array[j] = ballNum;
			}
		}

		for(int num : array) {
			System.out.print(num + " ");
		}
	}
}
