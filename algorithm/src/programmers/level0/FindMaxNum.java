package programmers.level0;

public class FindMaxNum {
	public int[] solution(int[] array) {
		int max = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		int[] answer = { max, index };

		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 8, 3 };
		FindMaxNum fmn = new FindMaxNum();
		System.out.println(fmn.solution(array));
	}
}
