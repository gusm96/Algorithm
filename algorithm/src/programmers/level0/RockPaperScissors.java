package programmers.level0;

public class RockPaperScissors {
	public String solution(String rsp) {
		String answer = "";
		for (char c : rsp.toCharArray())
			if (Character.toString(c).equals("0")) {
				answer += "5";
			} else if (Character.toString(c).equals("2")) {
				answer += "0";
			} else {
				answer += "2";
			}

		return answer;
	}

	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		System.out.println(rps.solution("2"));
	}
}
