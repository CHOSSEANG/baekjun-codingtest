package star.no2444;

/*
문제
주어진 입력에 맞춰 예제와 같이 출력 하라

입력
5

예제
	*
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - (i+1) ; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2 * (i+1) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2 * (n) -2*i -3); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


/*
입력
	N : 1~ 100 정수
정리
	1. 입력 N에 따라 2*N -1 번째 줄까지 출력하라
	2. for문 반복문 첫번째는 i : 0 ~N 번째줄까지 반복
	3. for문 반복문 1-1은 빈칸 출력 j : N - (i+1) ~ 0 , i >= N 일 때 j: 0 ~ i - (N+1)
	4. for문 반복문 1-2는 별 출력 j  : 0 ~ 2*i + 1, i>=N일 때 j: 2*N - (i - N)
	5. for문 반복문 두번째는  i : 0 ~ N 까지 포함 반복
	6. for문 반복문 2-1은 빈칸 출력 j : 1 ~ N 까지 반복
	7. for문 반복문 2-2는 별 출력 j: 2*N - (i*2 +1) 완료
 */
