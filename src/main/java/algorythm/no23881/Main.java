package algorythm.no23881;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] A = new int[N + 1]; // 1-indexed 배열 사용
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		int swapCount = 0;
		boolean found = false;

		// 선택 정렬 구현
		for (int last = N; last >= 2; last--) {
			// A[1..last] 중 가장 큰 수의 인덱스 찾기
			int maxIndex = 1;
			for (int i = 2; i <= last; i++) {
				if (A[i] > A[maxIndex]) {
					maxIndex = i;
				}
			}

			// 가장 큰 수가 마지막 위치에 있지 않다면 교환
			if (maxIndex != last) {
				// 교환 수행
				int temp = A[last];
				A[last] = A[maxIndex];
				A[maxIndex] = temp;

				swapCount++;

				// K번째 교환이라면 결과 출력
				if (swapCount == K) {
					System.out.println(A[maxIndex] + " " + A[last]);
					found = true;
					break;
				}
			}
		}

		// K번의 교환이 일어나지 않았다면 -1 출력
		if (!found) {
			System.out.println(-1);
		}
	}
}
