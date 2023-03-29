package baekjoon.forEach;
// BeakJoon 1110

// 문제

import java.io.BufferedReader;

// 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
// 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
// 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
// 다음 예를 보자.
// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 
// 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
// 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

// 입력

// 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

// 출력

// 첫째 줄에 N의 사이클 길이를 출력한다.

import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
	public static void main(String[] args) throws IOException {
		// 입력을 받고
		// 값을 A와 B로 분리 후 더한 값을 저장 후 다시 분리
		// 더하기 전 값의 오른쪽 값과 더한 후 값의 오른쪽 값 다시 입력
		// ... 그렇게 사이클을 돌다 처음의 입력값과 같아질 떄 사이클 횟수 출력

		// 입력받은 N 값의 왼쪽 오른쪽 수를 구하는 법은 나누기와 나머지를 이용해준다.
		// ex int left = (n / 10) % 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		if (n == 0) {
			System.out.println(1);
			return;
		}
		int num = n;
		int newN = 0;
		int count = 0;

		while (newN != n) {
			newN = num;
			count++;
			// 입력 받은 n 값이 10보다 작을 때
			if (n < 10) {
				// n 값 앞에 0을 붙여준다.
				n = (n * 10) + n;
			} else {
				n = (n % 10) * 10 + ((n % 10) + (n / 10)) % 10;
			}
		}
		System.out.println(count);
	}
}
