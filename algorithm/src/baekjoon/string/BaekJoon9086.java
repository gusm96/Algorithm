package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] s = br.readLine().split("");
			if (s.length == 1) {
				System.out.println(s[0] + s[0]);
			} else {
				System.out.println(s[0] + s[s.length - 1]);
			}
		}
	}
}
