package baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// BaekJoon 1978 소수 찾기

// 문제
// 주어진 수 N개 중에서 소수가 몇 개 인지 찾아서 출력하는 프로그램을 작성하시오.

// 입력
// 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
// 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

// 출력
// 주어진 수들 중 소수의 개수를 출력한다.
public class BaekJoon1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[1001]; // 주어지는 N개의 수들은 1,000이하의 자연수 이기 때문이다.
		primeNumber(arr); // 에라토스테네스의 체 메서드를 호출해준다.
		int count = 0;
		int N = Integer.parseInt(br.readLine()); // N개의 정수 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			// num이 지워진 수가 아니라면 소수이기 때문에 count++
			if (arr[num] != 0)
				count++;
		}
		System.out.println(count);
	}

	public static void primeNumber(int[] arr) {
		int n = 1000; // 1,000 이하의 자연수
		// 배열을 초기화 한다.
		for (int i = 2; i <= n; i++) {
			arr[i] = i;
		}
		// 2부터 시작해서 i의 배수들을 배열에서 지워준다.
		for (int i = 2; i <= n; i++) {
			// 이미 지워진 수는 건너뛴다.
			if (arr[i] == 0)
				continue;
			for (int j = i + i; j <= n; j += i) {
				arr[j] = 0; // 2의 배수들은 0 으로
			}
		}
	}
}
