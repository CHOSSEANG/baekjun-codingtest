package condition.no2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numHour = sc.nextInt();
		int numMin = sc.nextInt();

		int cookTime = sc.nextInt();

		int resultHour = 0;
		int resultMin = 0;

		int calcNum = numMin + cookTime;

		if(calcNum >= 60) {
			resultHour = numHour + calcNum/60;
			resultMin = calcNum%60;
		} else {
			resultHour = numHour;
			resultMin = calcNum;
		}

		if(resultHour > 23){
			resultHour = resultHour - 24;
		}

		System.out.println(resultHour + " " + resultMin);

	}
}
