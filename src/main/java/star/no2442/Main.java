package star.no2442;

/*
문제
	첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
	별은 가운데를 기준으로 대칭이어야 한다.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input - (i + 1); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * (i+1) - 1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
풀이
입력
	N : 몇번 째 줄까지 출력하는지
정리
	1. N번째 줄에 별을 2xN-1개를 찍는다.
	2. i=0 으로 시작해서 N까지 for 반복을 하면 된다.
	3. 왼쪽에 N-(i+1) 개의 공백을 출력 후 별을 찍으면 된다.
 */
