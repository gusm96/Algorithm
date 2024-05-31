package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class BinarySearch {
    private static int solution(int[] arr, int m) {
        Arrays.sort(arr);
        int start = 0, end = arr.length - 1, mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (m == arr[mid]) {
                return mid;
            } else if (arr[mid] < m) {
                start = mid + 1;
            } else if (m < arr[mid]) {
                end = mid - 1;
            }
        }
        throw new NoSuchElementException("찾으시는 값이 존재하지 않습니다.");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[]{1, 7, 2, 6, 10, 21, 11};
        int m = Integer.parseInt(br.readLine());
        System.out.println("Index = " + solution(arr, m));
    }
}
