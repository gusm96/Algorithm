package programmers.level1.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthNumber {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[3];
		ArrayList<Integer> arr;
		for (int i = 0; i < commands.length; i++) {
			arr = new ArrayList<>();
			int a = commands[i][0]; // 0 
			int b = commands[i][1];
			int c = commands[i][2];
			for (int j = a; i < b; j++) {
				arr.add(array[j]);
			}
			Collections.sort(arr);
			answer[i] = arr.get(c);
			for(int val : answer)
				System.out.println(val);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		KthNumber kn = new KthNumber();
		System.out.println(kn.solution(array, commands).toString());
	}
}
