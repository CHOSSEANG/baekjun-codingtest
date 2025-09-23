package array.no10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int compareNum = sc.nextInt();
		int[] numArray = new int[length];
		int count = 0;

		for(int i = 0; i < length; i++) {
			numArray[i] = sc.nextInt();
		}

		for(int num : numArray) {
			if(num < compareNum){
				if(count != 0) {
					System.out.print(" ");
				}
				System.out.print(num);
				count++;
			}
		}
	}
}
