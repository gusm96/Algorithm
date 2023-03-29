package baekjoon.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// BaekJoon 10757 큰 수 A + B

// 문제
// 두 정수 A와 B를 입력받은 다음 A+B를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10의1천승)ㅋㅋ

// 출력 줄에 A+B를 출력한다.
public class BaekJoon10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());

		System.out.println(A.add(B));
	}
}
