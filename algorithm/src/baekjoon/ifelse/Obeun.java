package baekjoon.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Obeun {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(br.readLine());

		// ��� �ð��� ������ �����.
		int a = (h * 60) + m + t;
		// �ð�
		h = a / 60;
		// ��
		m = a % 60;
		if (h >= 24) {
			h = h - 24;
		}
		System.out.print(h + " " + m);
	}
}
