package star.no2445;


/*
문제

첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

입력 ex
5일 때

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i =0; i<n; i++) {
			for(int j =0; j<i+1;j++){
				System.out.print("*");
			}
			for(int j =0; j<2*n-2*(i+1);j++){
				System.out.print(" ");
			}
			for(int j =0; j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =0; i<n-1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < 2 * (i+1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
문제 정리
입력
	N

정리
	1. for문 3개 필요
 */
