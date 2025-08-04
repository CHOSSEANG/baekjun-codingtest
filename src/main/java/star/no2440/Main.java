package star.no2440;

/*
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


/*
정리
입력
	N : 몇번 째 줄까지 별을 출력하는지
1. 이번에는 1개씩 숫자를 줄이면서 반복하여 별을 출력할 것
 */
