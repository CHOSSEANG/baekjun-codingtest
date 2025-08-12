package star.no2446;

/*
예제에 맞게 별을 출력하라

ex) 5

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2 * n - (2*i+1)); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < (2*i) + 2; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
