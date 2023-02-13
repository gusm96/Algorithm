package programmers.level0;

public class ChangeIndex {
	public String solution(String my_string, int num1 , int num2) {
		String answer = "";
		String [] arr = my_string.split("");
		String s = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = s;
		for(String st : arr)
			answer += st;
		return answer;
	}
	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		ChangeIndex ci = new ChangeIndex();
		System.out.println(ci.solution(my_string, num1, num2));
	}
}
