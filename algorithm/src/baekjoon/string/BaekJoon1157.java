package baekjoon.string;
// BaekJoon 1157 단어공부

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제
// 알파벳 대소문자로 된 단어가 주어지면,
// 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
// 단, 대문자와 소문자를 구분하지 않는다.

// 입력
// 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.

// 출력
// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는  '?' 를 출력한다.

public class BaekJoon1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		// 입력한 단어를 모두 대문자로 만들기 위해 .toUpperCase()를 사용.
		String s = br.readLine().toUpperCase();

		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i) - 65; // A-Z 아스키코드 값에서 -65 를 하면 해당 index 를 얻을 수 있다.
			arr[temp]++; // 해당 index에 ++
		}
		int max = -1; // 배열의 초기 값이 0이기 때문에 -1로 지정
		char ch = '?';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
