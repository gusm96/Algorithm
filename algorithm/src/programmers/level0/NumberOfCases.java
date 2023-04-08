package programmers.level0;

// 구슬을 나누는 경우의 수
// 문제 설명
// 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
// 구슬은 모두 다르게 생겼습니다.
// 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬개수 share이
// 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한
// 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

// 문제 풀이
// 이 문제는 Factorial 알고리즘을 사용하여 풀면 된다.
public class NumberOfCases {
    private int solution(int balls, int share) {
        int answer = 0;
        // 서로 다른 n개 중 m개를 뽑는 경우의 수 공식
        // n!/(n-m)! X m!
        answer = factorial(balls) / (factorial(balls-share) * factorial(share));
        return answer;
    }

    private int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        NumberOfCases nc = new NumberOfCases();
        System.out.println(nc.solution(balls, share));
    }
}
