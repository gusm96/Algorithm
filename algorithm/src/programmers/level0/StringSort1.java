package programmers.level0;

import java.util.Arrays;

public class StringSort1 {
	public int[] solution(String my_string) {
		return Arrays.stream(my_string.replaceAll("[a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
	}

	public static void main(String[] args) {
		StringSort1 ss = new StringSort1();
		System.out.println(ss.solution("hi12392").toString());
	}
}
