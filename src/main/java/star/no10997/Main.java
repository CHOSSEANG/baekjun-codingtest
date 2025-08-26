package star.no10997;

import java.util.Scanner;

public class Main {
	static char[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int WIDTH_SIZE = 4 * n - 3;
		int HEIGHT_SIZE = 4 * n - 1;

		arr = new char[HEIGHT_SIZE][WIDTH_SIZE];


		for(int i = 0; i < HEIGHT_SIZE; i++){
			for(int j = 0; j < WIDTH_SIZE; j++){
				arr[i][j] = ' ';
			}
		}

		draw(0, HEIGHT_SIZE, WIDTH_SIZE, n);


		for (int i = 0; i < HEIGHT_SIZE; i++) {
			int last = WIDTH_SIZE - 1;
			while (last >= 0 && arr[i][last] == ' ') last--; // 오른쪽 끝 공백 제거
			for (int j = 0; j <= last; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void draw(int start, int height_size, int width_size, int n) {
		if (n == 0) return;

		// 위쪽 가로줄 (WIDTH_SIZE 기준)
		for (int i = start; i < width_size - start; i++) {
			arr[start][i] = '*';
			arr[height_size-start-1][i] = '*';
			if(start!=0){
				arr[start][width_size-start] = '*';
			}
		}

		// 왼쪽 세로줄 (HEIGHT_SIZE 기준)
		for (int i = start; i < height_size - start; i++) {
			arr[i][start] = '*';
			if(i!=start+1){
				arr[i][width_size - start - 1] = '*';
			}
		}

		draw(start + 2, height_size, width_size, n - 1);
	}
}


