package star.no10991;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i < n+1; i++){
			for(int j = 0; j < n-i; j++){
				System.out.print(" ");
			}
			for(int j = 1; j < 2*i;j++){
				if(j%2!=0){
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			if(i!=n) System.out.println();
		}
	}
}
