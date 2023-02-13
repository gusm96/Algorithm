package study;

import java.util.Scanner;

public class CodingTest {

	public static int solution(int n) {
        int answer = 1;
        int pizza = 6;
        if(n % pizza == 0){
            answer = Math.max(n , pizza) / Math.min(n,pizza);
        }
        while((Math.max(n, (pizza * answer)) % Math.min(n,(pizza* answer))) != 0){
            answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(sc.nextInt()));
		sc.close();
		}
	
}
