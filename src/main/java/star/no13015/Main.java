package star.no13015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int width = 4 * N - 3; // 전체 너비

		for (int i = 0; i < 2 * N - 1; i++) {
			char[] line = new char[width];
			for (int j = 0; j < width; j++) {
				line[j] = ' ';
			}

			if (i == 0 || i == 2 * N - 2) {
				// 첫째, 마지막 줄
				for (int j = 0; j < N; j++) {
					line[j] = '*';
					line[width - 1 - j] = '*';
				}
			} else {
				int row = (i < N) ? i : 2 * N - 2 - i; // 대칭을 위한 행 번호

				// 왼쪽 별들
				line[row] = '*';
				line[row + N - 1] = '*';

				// 오른쪽 별들
				if (row != N - 1) {
					// 가운데 줄이 아닐 때는 별 2개
					line[width - 1 - row - N + 1] = '*';
					line[width - 1 - row] = '*';
				} else {
					// 가운데 줄일 때는 별 1개
					line[width - 1 - row] = '*';
				}
			}

			// 뒤쪽 공백 제거
			int end = width - 1;
			while (end >= 0 && line[end] == ' ') {
				end--;
			}

			for (int j = 0; j <= end; j++) {
				System.out.print(line[j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
