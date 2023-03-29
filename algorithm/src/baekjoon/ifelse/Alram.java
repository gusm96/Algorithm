package baekjoon.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alram {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		if ((m - 45) < 0) {
			if ((h - 1) < 0) {
				System.out.print((h + 23) + " " + ((m - 45) + 60));
			} else {
				System.out.print((h - 1) + " " + ((m - 45) + 60));
			}
		} else {
			System.out.print(h + " " + (m - 45));
		}
	}
}
