package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * 문제
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 수가 주어진다.
 * 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * <p>
 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */

/* 퀵정렬 써야징*/
public class SortingNumbers2 {
    public static Random random = new Random();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄에 주어지는 N
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        // N개 만큼 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 입력 받은 값 퀵정렬 - 오름차순
        randomPivotQuickSort(arr, 0, arr.length - 1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }

    public static void randomPivotQuickSort(int[] arr, int begin, int end) {
        if (end <= begin) return;

        int pivot = partition(arr, begin, end);

        randomPivotQuickSort(arr, begin, pivot - 1);
        randomPivotQuickSort(arr, pivot + 1, end);
    }

    private static void swap(int[] arr, int begin, int end) {
        int temp = arr[begin];
        arr[begin] = arr[end];
        arr[end] = temp;
    }

    private static int partition(int[] arr, int begin, int end) {
        // 무작위 피벗 선택
        int randomIndex = begin + random.nextInt(end - begin + 1);
        swap(arr, randomIndex, end); // 피벗을 마지막 요소로 이동

        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }
}
