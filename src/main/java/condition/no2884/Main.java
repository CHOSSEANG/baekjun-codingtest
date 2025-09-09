package condition.no2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numH = sc.nextInt();
		int numM = sc.nextInt();

		int resultM = numM - 45;
		int resultH = numH;
		if(resultM < 0) {
			resultM = 60 + resultM;
			resultH -= 1;
		}

		if(resultH < 0) {
			resultH = 24 + resultH;
		}

		System.out.println(resultH + " " + resultM);
	}
}
