package forEach;
// BeakJoon 10951

// 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력
// 각 테스트 케이스마다 A+B를 출력한다.

// EOF란? 
// End Of File 즉, 파일의 끝
// 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문을 종료하라는 것.

public class APlusB10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;

		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			sb.append((a + b)).append("\n");

		}
		System.out.println(sb);
	}
}
