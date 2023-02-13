package programmers.level1;

public class ReverseInt {
	public int[] solution(long n) {
		StringBuffer sb = new StringBuffer(Long.toString(n));
		String[] str = sb.reverse().toString().split("");
		int[] answer = new int[str.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(str[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		long n = 12345;
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.solution(n));
	}
}
