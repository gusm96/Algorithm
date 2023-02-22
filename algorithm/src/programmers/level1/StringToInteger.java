package programmers.level1;

public class StringToInteger {

	public int solution(String s) {
		int answer = 0;
		String minus = "";
		if (s.contains("-")) {
			s = s.substring(1);
			minus = "-";
		}
		char[] arr = s.toCharArray();
		int len = arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(minus.equals("-")) {
				answer -= (arr[i] -'0') * Math.pow(10, len);
				len --;
			}else {
				answer += (arr[i] -'0') * Math.pow(10, len);
				len--;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "";
		StringToInteger sti = new StringToInteger();
		System.out.println(sti.solution(s));
	}
}
