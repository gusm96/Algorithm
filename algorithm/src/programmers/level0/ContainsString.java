package programmers.level0;

public class ContainsString {
	public String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
				answer += my_string.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String my_string = "We are the world";
		ContainsString cs = new ContainsString();
		System.out.println(cs.solution(my_string));
	}
}
