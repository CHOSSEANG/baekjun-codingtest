package star.no2443;

/*
문제
첫째 줄에는 별 2×N-1개, 둘째 줄에는 별 2×N-3개, ..., N번째 줄에는 별 1개를 찍는 문제

별은 가운데를 기준으로 대칭이어야 한다.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 전체 줄 반복
		for (int i = 0; i < n; i++) {
			// 빈칸 추
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별 추가
			for(int j = 0; j < (2 * (n-i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
입력
	N
정리
	1. 첫째 줄에는 별이 2*N - 1개
	2. 두번째 줄에는 별이 2*N - 3개
	3. 반복문은 2개를 중첩하여 사용 처음에는 빈칸을 0개로 별을 2*N - j 로 출력
 */
