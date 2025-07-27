package etc;

public class Main {
	public static void main(String[] args) {
		int a = 50;
		int count = 0;

		for (int i = 1; i <= a; i++) {
			if(divisor(i) % 2 != 0) count++;
		}

		System.out.println(count);
	}


	public static int divisor(int num){
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) count++;
		}

		return count;
	}
}
