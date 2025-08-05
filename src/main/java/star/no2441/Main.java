 package star.no2441;

/*
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
ex)  5

*****
 ****
  ***
   **
    *
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = n; i > 0; i--) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
입력
	N : 몇번째 줄까지 출력할 것인지
정리
	1. N을 한개씩 줄이는 방식(i)으로 for문 반복 필요
	2. N - i : 빈칸 출력 개수
	3. N : 별 출력 개수
 */

