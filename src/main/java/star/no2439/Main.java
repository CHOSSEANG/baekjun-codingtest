package star.no2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print("[");
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			System.out.println();
		}
	}
}

/*
입력
	N : 별 출력 줄 수
조건
	첫째 줄 : 별 1개
	둘째 줄 : 별 2개
	셋째 줄 : 별 3개
	넷째 줄 : 별 4개
정리
	1. 오른쪽을 기준으로 별 정렬
	2. 전체반복 횟수 N에 따라 앞에 공백이 나온 후에 별을 찍어야 함
	3. N이 5일 때 1일 때는 4개 후 1개, 2일 때는 3개 후 2개
	4.즉 N-i 만큼의 공백 후에 i 만큼 별 찍기
 */
