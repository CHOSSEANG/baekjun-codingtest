package loop.no25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int allAccount = sc.nextInt();
		int loop = sc.nextInt();
		int compareValue = 0;

		for(int i = 0; i < loop; i++){
			int account = sc.nextInt();
			int count = sc.nextInt();

			compareValue += account * count;
		}

		if(compareValue == allAccount) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
