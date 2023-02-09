package study;

import java.util.Stack;

public class Solution {
	public int[] solution(int[] arr) {
		int[] answer;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (st.size() == 0 || st.peek() != arr[i])
				st.push(arr[i]);
		}
		answer = new int[st.size()];
		for (int i = answer.length - 1; i >= 0; i--) {
			answer[i] = st.pop();
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		Solution sol = new Solution();
		System.out.println(sol.solution(arr));
	}
}
