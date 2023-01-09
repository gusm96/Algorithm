package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BaekJoon 1193 분수 찾기

// 문제
// 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 
// 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
// X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 X가 주어진다.

// 출력
// 첫째 줄에 분수를 출력한다.
public class BaekJoon1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 원하는 위치의 분수 값을 찾기 위한 X를 입력 받는다.
		int x = Integer.parseInt(br.readLine());
		firstSolution(x);

	}

	public static void firstSolution(int x) {
		int diagonal = 1, diagCnt = 0;
		int parent, child = 0;
		while (true) {
			if (x <= diagCnt + diagonal) {
				// 홀수 이냐 짝수이냐
				if (diagonal % 2 == 1) {
					// 홀수에는 분모 증가 분자 감소
					parent = x - diagCnt;
					child = diagonal - (x-diagCnt-1);
					System.out.println(child+"/"+parent);
					break;
				} else {
					// 짝수에는 분자 증가 분모 감소
					parent = diagonal - (x-diagCnt-1);
					child = x - diagCnt;
					System.out.println(child+"/"+parent);
					break;
				}
			} else {
				diagCnt += diagonal; 
				diagonal++;
			}
		}
	}
}
