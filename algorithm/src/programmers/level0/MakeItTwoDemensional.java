package programmers.level0;

import java.util.Arrays;

public class MakeItTwoDemensional {
    public int[][] solution(int[] num_list, int n){
        int[][] answer = new int [num_list.length/n][n];
        for(int i = 0; i < answer.length; i++){
        }
        return answer;
    }
    public static void main(String[] args){
        int n = 2;
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8,};
        MakeItTwoDemensional md = new MakeItTwoDemensional();
        Arrays.stream(md.solution(num_list,n)).forEach(System.out::println);
    }
}
