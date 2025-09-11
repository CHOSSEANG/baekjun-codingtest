package condition.no2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();

			if (num1 == num2 && num2 == num3) {
				System.out.println(10000 + (num1 * 1000));
			} else if( num1 == num2 || num1 == num3 || num2 == num3) {
				int num = 0;
				if(num1 == num2) {
					num = num1;
				} else if(num1 == num3) {
					num = num1;
				} else {
					num = num2;
				}
				System.out.println(1000 + (num * 100));
			} else {
				int num = Math.max(num1, Math.max(num2, num3));
				System.out.println(num * 100);
			}
		}
}
