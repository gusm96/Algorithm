package baekjoon.function;
// BaekJoon 1065 한수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제
// 어떤 양의 정수 X의 	등차수열을 이룬다면, 그 수를 한수라고 한다.
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에, 1,000보다 작거나 같은 자연수 N이 주어진다.

// 출력
// 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

public class Function3 {
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 수열 N 입력
		System.out.println(count(Integer.parseInt(br.readLine())));
	}
	public static int count (int n) {
		int count = 0;
		
		// 1 ~ 99 까지의 수는 모두 등차수열이므로  n이 100 보다 작은경우 그냥 return .
		if(n < 100) {
			return n;
		}else {
			// n이 100 이상인 경우 count는 99부터 시작 
			count =99;
			// 100 이상 부터 계산하면 되기 때문에 i는 100으로 시작
			for(int i = 100; i <= n; i++) {
				int a = i / 100; // 100의 자리수
				int b = (i/ 10) % 10; // 10의 자리수
				int c = i % 10; // 1의 자리수
				// 100의 자리수 10의 자리수의 공차 와 10의 자리수 1의 자리수 공차가 같다면,
				if ((a-b)== (b-c)) {
					count ++;
				}
			}
		}
		return count;
	}
}
