package array.no5597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1번부터 30번까지 학생의 제출 여부를 체크할 배열
		boolean[] submitted = new boolean[31]; // 인덱스 0은 사용하지 않음

		// 28명의 제출자 출석번호 입력받기
		for (int i = 0; i < 28; i++) {
			int studentNum = sc.nextInt();
			submitted[studentNum] = true;
		}

		// 제출하지 않은 학생 찾기
		for (int i = 1; i <= 30; i++) {
			if (!submitted[i]) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
