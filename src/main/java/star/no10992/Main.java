package star.no10992;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i =1;i < n+1; i++){
			for(int j =0; j<n-i;j++){
				System.out.print(" ");
			}
			if(i==n){
				for(int j = 0; j < 2*i-1; j++){
					System.out.print("*");
				}
			} else{
				for(int j = 0; j < 2*i-1; j++){
					if(j==0 || j==2*i-2){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
