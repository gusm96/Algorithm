package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		// 바구니 N개
		int[] basket = new int[Integer.parseInt(st.nextToken())];
		// 바구니 에는 바구니 번호와 같은 공이 들어있다. ex) 1번 바구니는 1번공
		for (int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}
		// M번 횟수 바꾼다.
		int M = Integer.parseInt(st.nextToken());
		// 바꿀 바구니 2개를 선택하고 두 바구니에 들어있는 공을 서로 교환한다.
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			int temp = basket[a];
			basket[a] = basket[b];
			basket[b] = temp;
		}

		for (int val : basket)
			System.out.print(val + " ");
	}
}
