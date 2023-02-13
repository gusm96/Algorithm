package programmers.level1;

public class SquareRoot {
	public long solution(long n) {
		long answer = 0;
		answer = (long) Math.sqrt(n);
		if(answer * answer == n) {
			answer++;
			answer *= answer;
		}else {
			answer = -1;
		}
		return answer;
	}
	public static void main(String[] args) {
		long n = 121;
		SquareRoot sr = new SquareRoot();
		System.out.println(sr.solution(n));
	}
	
}
