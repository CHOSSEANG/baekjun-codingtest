package array.no3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> remainders = new HashSet<>();

		// 10개의 수를 입력받아 42로 나눈 나머지를 HashSet에 저장
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			remainders.add(num % 42);
		}

		// HashSet의 크기 = 서로 다른 나머지의 개수
		System.out.println(remainders.size());

		sc.close();
	}
}
