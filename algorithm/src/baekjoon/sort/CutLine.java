package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CutLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int n = Integer.valueOf(inputArr[0]);
        int k = Integer.valueOf(inputArr[1]);
        String[] arr = br.readLine().split(" ");
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = Integer.valueOf(arr[i]);
        }

        // 정렬
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = i + 1; j < score.length; j++) {
                if (score[i] < score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        System.out.println(score[k - 1]);
    }
}
