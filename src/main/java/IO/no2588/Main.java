package IO.no2588;

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int num2_100 = num2/100;
		int num2_10 = num2%100/10;
		int num2_1 = num2%10;

		int result1 = num1*num2_1;
		int result2 = num1*num2_10;
		int result3 = num1*num2_100;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result3*100 + result2*10 + result1);

	}
}
