package loop.no11021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int testCounts = Integer.parseInt(str);

		for(int i =0; i<testCounts; i++) {
			String[] str2 = br.readLine().split(" ");
			int numA = Integer.parseInt(str2[0]);
			int numB = Integer.parseInt(str2[1]);
			bw.write("Case #"+(i+1)+": "+(numA+numB)+"\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
