package baekjoon.forEach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class APlusB9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		StringBuilder sb = new StringBuilder();

		while (true) {

			// StringTokenizer 로 BufferedReader로 입력 받은 값을 " " 기준으로 문자열을 분리해준다.
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			// 만약 A+B 의 값이 0이면 반복문을 Break.
			if (A + B == 0) {
				break;
			}

			// StringBuilder 에 결과 값들을 담는다.
			sb.append((A + B)).append("\n");
		}
		// 모든 결과 값들을 담은 StringBuilder 를 출력.
		System.out.println(sb);
	}
}
