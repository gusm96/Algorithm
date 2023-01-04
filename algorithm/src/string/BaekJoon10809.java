package string;
// BaekJoon 10809 알파베 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제
// 알파벳 소문자로만 이루어진 단어 S가 주어진다.
// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
// 포함되어 있지 않는 경우에는 -1을 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 단어 S가 주어진다.
// 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

// 출력
// 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ...z가 처음 등장하는 위치를
// 공백으로 구분해서 출력한다.
// 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
// 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

public class BaekJoon10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println("1==============================================\n");
		stringCharAt(s);
		System.out.println("\n2==============================================\n");
		stringIndexOf(s);
	}

	// charAt()을 이용한 방법
	public static void stringCharAt(String s) {
		// a-z 26개의 알파벳을 -1로 초기화
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for (int var : arr) {
			System.out.print(var + " ");
		}
	}

	// indexOf()를 이용한 방법
	public static void stringIndexOf(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c = 'a'; c <= 'z'; c++)
			sb.append(s.indexOf(c) + " ");
		System.out.println(sb);

	}
}
