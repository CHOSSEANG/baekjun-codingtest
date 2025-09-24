package array.no10818;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		int min = 0;
		int max = 0;

		for(int i = 0; i < arrayLength; i++) {
			array[i] = sc.nextInt();
			if(i==0){
				min = array[i];
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.print(min + " " + max);
	}
}
