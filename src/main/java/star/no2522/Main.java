package star.no2522;

/*
문제
예제
3

  *
 **
***
 **
  *

 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 별이 많아지는 피라미드 반복문
		for(int i =0; i<n; i++) {
			for(int j =0; j< n-i-1; j++){
				System.out.print(" ");
			}
			for(int j =0;j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 별이 적어지는 피라미드 반복문
		for(int i =0; i<n-1; i++) {
			for(int j =0; j< i+1;j++){
				System.out.print(" ");
			}
			for(int j =0; j< n-i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
