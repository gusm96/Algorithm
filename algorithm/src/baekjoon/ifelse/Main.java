package baekjoon.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if (a > 0 && b > 0) {
			System.out.print("1");
		} else if (a > 0 && b < 0) {
			System.out.print("4");
		} else if (a < 0 && b > 0) {
			System.out.print("2");
		} else {
			System.out.print("3");
		}
	}
}