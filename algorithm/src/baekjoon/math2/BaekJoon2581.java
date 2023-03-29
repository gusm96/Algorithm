package baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// BaekJoon 2581 소수

// 문제
// 자연수 M 과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
// 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개
// 가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

// 입력
// 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
// M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

// 출력
// M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
// 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
public class BaekJoon2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10001]; // 10,000이하의 자연수
		primeNumber(arr); // 에라토스테네싀의 체 메서드 호출
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = M; i <= N; i++) {
			if (arr[i] != 0) {
				sum += i;
				temp.add(i);
			}
		}
		if (temp.isEmpty()) {
			System.out.println("-1");
		} else {
			System.out.println(sum + "\n" + temp.get(0));
		}
	}

	// 에라토스테네스의 체 알고리즘 메서드
	public static void primeNumber(int[] arr) {
		int n = 10000;
		// 배열 초기화
		for (int i = 2; i <= n; i++) {
			arr[i] = i;
		}
		// 2부터 시작해서 i의 배수를 제외
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0)
				continue;
			for (int j = i + i; j <= n; j += i) {
				arr[j] = 0; // 2의 배수들은 0으로
			}
		}
	}
}
