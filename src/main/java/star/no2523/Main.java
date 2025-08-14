package star.no2523;
/*
문제

아래 예제와 같이 출력되는 코드를 구현하라

예제
3

*
**
***
**
*
 */

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i =0; i<2*n-1; i++) {
			if(i<n){
				for(int j =0; j<i+1;j++){
					System.out.print("*");
				}
			} else{
				for(int j =0; j<2*n - i -1;j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
