package programmers.level0;

import java.util.Arrays;

public class NumberOfK {
    public int solution (int i, int j, int k){
        int answer = 0;
        while(i <= j){
            char[] s = String.valueOf(i).toCharArray();
            for(int n= 0; n < s.length; n++) {
                if (s[n] - '0' == k) {
                    answer++;
                }
            }
            i++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        NumberOfK nok = new NumberOfK();
        System.out.println(nok.solution(i, j, k));
    }
}
