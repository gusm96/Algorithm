package programmers.level0;

public class Decryption {
	public String solution(String cipher, int code) {
        String answer = "";
        for(int i = code; i <= cipher.length(); i += code){
            answer += cipher.substring(i-1, i);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Decryption dc = new Decryption();
		System.out.println(dc.solution("dfjardstddetckdaccccdegk", 4));
	}
}
