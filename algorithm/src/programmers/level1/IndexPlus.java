package programmers.level1;

public class IndexPlus {
	public int solution(int n) {
		int answer = 0;
		while(n != 0) {
			answer += n % 10;
			n/=10;
		}
		return answer;
	}
	public int solution2(int n) {
		int answer = 0;
        String[] st = Integer.toString(n).split("");
        for(int i = 0; i < st.length; i++){
            answer += Integer.parseInt(st[i]);
        }
        return answer;
	}
	public static void main(String[] args) {
		int n = 123;
		IndexPlus ip = new IndexPlus();
		System.out.println(ip.solution(n));
		System.out.println(ip.solution2(n));
	}
}
