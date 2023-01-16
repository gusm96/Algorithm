package math1;
// BaekJoon 2839 설탕 배달

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제
// 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다.
// 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
// 설탕 공장에서 만드는 설탕은 봉지에 담겨 있다.
// 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
// 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램설탕을 배달해야 할 때,
// 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
// 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

// 입력
// 첫쨰 줄에 N이 주어진다.

// 출력
// 상근이가 배달하는 봉지의 최소 개수를 출력한다.
// 만약 정확하게 N킬로그램을 만들 수 없다면 -1을 출력하라.

public class BaekJoon2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int five = 0; // 5kg 봉지
		int three = 0; // 3kg 봉지

		while (N % 5 != 0 && N > 0) {
			N -= 3;
			three++;
		}
		five = N / 5;
		N = N % 5; // 5kg 봉지에 담고 남은 설탕
		if (N < 0) {
			System.out.println(-1);
		} else {
			System.out.println(five + three);
		}
	}
}
