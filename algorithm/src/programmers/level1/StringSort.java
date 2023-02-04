package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < strings.length; i++) {
			arr.add("" + strings[i].charAt(n) + strings[i]);
		}
		Collections.sort(arr); // n 번째 문자가 같다면 알아서 단어 자체를 정렬
		answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i).substring(1, arr.get(i).length());
			// substring 으로 n 번째 문자를 잘라준다.
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		StringSort ss = new StringSort();
		System.out.println(ss.solution(strings, n));
	}
}
