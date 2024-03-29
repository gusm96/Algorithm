package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BaekJoon 3052 나머지

// 문제
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 에를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄부터 열번쨰 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

// 출력
// 첫째 줄에, 42로 나누었을 때 , 서로 다른 나머지가 몇 개 있는지 출력한다.
public class Array6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		boolean bl;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		for (int i = 0; i < arr.length; i++) {
			bl = false;
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println(arr[i] + " , " + arr[j]);
				if (arr[i] == arr[j]) {
					bl = true;
					System.out.println("wow "+arr[i]+" 과 "+arr[j]+" 는 "+ bl);
					break;
				}
				System.out.println(bl);
			}
			if (bl == false) {
				count++;
			}
			System.out.println(i+1+"번째 Count 값은 =  "+count);
			System.out.println("=========================");
		}
		System.out.println(count);
	}
}
