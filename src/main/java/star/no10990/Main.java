package star.no10990;

/*
문제

예제와 같이 나오게 코드를 작성하라

예제 입력 1
1

예제 출력 1
*



예제 입력 2
2
예제 출력 2
 *
* *


예제 입력 3
3
예제 출력 3
  *
 * *
*   *


예제 입력 4
4
예제 출력 4
   *
  * *
 *   *
*     *
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++){
			for(int j =0; j< n-i-1;j++){
				System.out.print(" ");
			}
			for(int j = 0; j < 1; j++){
				System.out.print("*");
			}
			if(i != 0){
				for(int j = 0; j < 2*i-1; j++){
					System.out.print(" ");
				}
				for(int j = 0; j < 1; j++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
