package star.no10994;

import java.util.Scanner;

public class Main {
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = 4 * n - 3;
		arr = new char[size][size];

		// 공백으로 초기화
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				arr[i][j] = ' ';
			}
		}

		draw(0, size, n);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static void draw(int start, int size, int n) {
		if (n == 0) return;

		// 가장 바깥 사각형 그리기
		for (int i = start; i < size - start; i++) {
			arr[start][i] = '*';                     // 위
			arr[size - start - 1][i] = '*';          // 아래
			arr[i][start] = '*';                     // 왼쪽
			arr[i][size - start - 1] = '*';          // 오른쪽
		}

		// 안쪽 사각형 재귀적으로 그리기
		draw(start + 2, size, n - 1);
	}
}
