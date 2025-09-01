package algorythm.no23882;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int num = sc.nextInt();

		int[] arr = new int[length + 1]; // 1-indexed 배열 사용

		//개행 처리용
		String str1 = sc.nextLine();
		// 실제 배열 값 받는 용도
		String str2 = sc.nextLine();

		for(int i = 1; i <= length; i++) {
			arr[i] = Integer.parseInt(str2.split(" ")[i-1]);
		}

		int swapCount = 0;

		// 선택 정렬 구현
		for (int last = length; last >= 2; last--) {
			int maxIndex = 1;
			for( int i = 2; i <= last; i++ ) {
				if( arr[i] > arr[maxIndex] ) {
					maxIndex = i;
				}
			}

			if (maxIndex != last) {
				// 교환 수행
				int temp = arr[last];
				arr[last] = arr[maxIndex];
				arr[maxIndex] = temp;

				swapCount++;

				// K번째 교환이라면 결과 출력
				if (swapCount == num) {
					break;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
