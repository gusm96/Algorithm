package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BaekJoon 2562 최댓값
// 문제 
// 9개의 서로 다른 자연수가 주어질 때 , 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로글매을 작성하시오.
// 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61
// 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8 번째 수이다.

// 입력
// 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다.

// 출력
// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최대값이 몇 번째 수인지를 출력한다.

public class Array4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			max = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (max <= arr[j]) {
					max = arr[j];
					count = j + 1;
				}
			}
		}
		System.out.println(max + "\n" + count);

	}
}
