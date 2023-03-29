package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		// 바구니 N개
		int N = Integer.parseInt(st.nextToken());
		// M번 넣을 횟수
		int M = Integer.parseInt(st.nextToken());
		// 가장 처음 바구니에는 공이 들어있지 않다.
		// 바구니에는 공을 1개만 넣을 수 있다.
		// 도현이는 앞으로 M번 공을 넣으려고 한다.
		int[] basket = new int[N];
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			// a번 바구니 부터 b번 바구니까지 c번 번호가 적혀있는 공을 넣는다.
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			for (int j = a; j <= b; j++) {
				basket[j - 1] = c;
			}
		}
		for (int val : basket)
			System.out.print(val + " ");

	}
}
