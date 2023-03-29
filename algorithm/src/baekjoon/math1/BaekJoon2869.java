package baekjoon.math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// BaekJoon 2869 달팡이는 올라가고 싶다.

// 문제
// 땅위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 오를 것이다.
// 달팽이는 낮에 A미터 오를 수 있다. 하지만 밤에 잠을 자는 동안 B미터 미끄러진다.
// 또, 정상에 올라간 후에는 미끄러 지지 않는다.

// 입력
// 첫째 줄에 세 정수  A, B, V가 공백으로 구분되어 주어진다.

// 출력 
// 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

public class BaekJoon2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] ABV = br.readLine().split(" ");
		double a = Integer.parseInt(ABV[0]);
		double b = Integer.parseInt(ABV[1]);
		double v = Integer.parseInt(ABV[2]);
		int x = (int) Math.ceil((v - b) / (a - b));

		bw.write(String.valueOf(x));

		br.close();
		bw.flush();
		bw.close();
	}
}
