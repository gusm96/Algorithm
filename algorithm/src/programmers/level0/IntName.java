package programmers.level0;

public class IntName {
	

	public String  solution(int age) {
		String answer = "";
		String[] arr = {"a","b","c","d","e","f","g","h","i","j"};
		String[] st = Integer.toString(age).split("");
		for(int i = 0; i < st.length; i++) {
			answer += arr[Integer.parseInt(st[i])];
		}
		return answer;
	}
	public static void main(String[] args) {
		IntName inn = new IntName();
		System.out.println(inn.solution(100));
	}
}
