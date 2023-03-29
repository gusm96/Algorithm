package baekjoon.math2;
// BaekJoon 1929 소수 구하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제
// M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 자연수 M과 N이 빈칸을 사이에 두고 주어진다.
// M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

// 출력
// 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

public class BaekJoon1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int [] arr = new int [N+1];
		for(int i = 2; i <= N; i++) {
			arr[i] = i;
		}
		for(int i = 2; i <= N; i++) {
			if(arr[i] == 0) continue;
			for(int j = i+i; j <= N; j += i) {
				arr[j] = 0;
			}
		}
		for(int i = M; i <= N; i++) {
			if(arr[i] != 0) {
				System.out.println(i);
			}
		}
	}
}
