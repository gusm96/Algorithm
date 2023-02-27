package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		// 바구니 N개
		int[] basket = new int[Integer.parseInt(st.nextToken())];
		// M번 순서 역순
		int M = Integer.parseInt(st.nextToken());

		// 바구니 번호
		for (int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			for (int j = a; j < b; j++) {
				int temp = basket[j];
				basket[j] = basket[j + 1];
				basket[j + 1] = temp;
			}
		}
		for (int val : basket)
			System.out.print(val + " ");
	}
}
