package star.no13015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 첫 번째 줄과 마지막 줄
		String firstLastLine = "";
		for (int i = 0; i < N; i++) {
			firstLastLine += "*";
		}
		for (int i = 0; i < 2 * N - 3; i++) {
			firstLastLine += " ";
		}
		for (int i = 0; i < N; i++) {
			firstLastLine += "*";
		}

		System.out.println(firstLastLine);

		// 위쪽 절반 (2번째 줄부터 N번째 줄까지)
		for (int i = 1; i < N; i++) {
			String line = "";

			// 왼쪽 바깥 공백
			for (int j = 0; j < i; j++) {
				line += " ";
			}

			line += "*";

			// 왼쪽 안쪽 공백 (N-2개)
			for (int j = 0; j < N - 2; j++) {
				line += " ";
			}

			// 가운데 줄이면 별 하나만
			if (i == N - 1) {
				line += "*";

				// 오른쪽 안쪽 공백 (N-2개)
				for (int j = 0; j < N - 2; j++) {
					line += " ";
				}

				line += "*";
			} else {
				line += "*";

				// 중간 공백 (2*(N-1-i)-1개)
				for (int j = 0; j < 2 * (N - 1 - i) - 1; j++) {
					line += " ";
				}

				line += "*";

				// 오른쪽 안쪽 공백 (N-2개)
				for (int j = 0; j < N - 2; j++) {
					line += " ";
				}

				line += "*";
			}

			System.out.println(line);
		}

		// 아래쪽 절반 (N+1번째 줄부터 2N-1번째 줄까지)
		for (int i = N - 2; i >= 1; i--) {
			String line = "";

			// 왼쪽 바깥 공백
			for (int j = 0; j < i; j++) {
				line += " ";
			}

			line += "*";

			// 왼쪽 안쪽 공백 (N-2개)
			for (int j = 0; j < N - 2; j++) {
				line += " ";
			}

			line += "*";

			// 중간 공백 (2*(N-1-i)-1개)
			for (int j = 0; j < 2 * (N - 1 - i) - 1; j++) {
				line += " ";
			}

			line += "*";

			// 오른쪽 안쪽 공백 (N-2개)
			for (int j = 0; j < N - 2; j++) {
				line += " ";
			}

			line += "*";

			System.out.println(line);
		}

		// 마지막 줄
		System.out.println(firstLastLine);

		sc.close();
	}
}
