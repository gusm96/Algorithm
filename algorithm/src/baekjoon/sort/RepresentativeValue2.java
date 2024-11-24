package baekjoon.sort;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RepresentativeValue2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int average = 0, mid = 0;
        // 입력값
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            average += arr[i];
        }
        average /= 5;
        // 정렬 하고 평균값 내고 중간값 반환
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        mid = arr[2];

        System.out.println(average + "\n" + mid);
    }
}
