package study;

import java.util.Arrays;


public class QuickSort2 {
    // 퀵정렬 메소드
    static void quickSort(int[] arr, int left, int right) {
        // left가 right보다 크거나 같으면 재귀 호출 종료
        if (left >= right) return;

        // 분할 함수 호출하여 pivot의 인덱스 얻기
        int pivot = partition(arr, left, right);

        // pivot을 기준으로 왼쪽과 오른쪽 부분 배열에 대해 재귀 호출
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }


    // 분할 함수
    static int partition(int[] arr, int left, int right) {
        // 배열의 가장 왼쪽 값을 pivot으로 선정
        int pivot = arr[left];
        int i = left, j = right;

        // i가 j보다 작을 때까지 반복
        while (i < j) {
            // 오른쪽에서 pivot보다 작은 값을 찾기
            while (pivot < arr[j]) j--;
            // 왼쪽에서 pivot보다 큰 값을 찾기
            while (i < j && pivot >= arr[i]) i++;
            // pivot보다 작은 값이 있다면 swap
            if (i < j) swap(arr, i, j);
        }

        // pivot을 적절한 위치에 놓기
        arr[left] = arr[i];
        arr[i] = pivot;

        // pivot의 최종 인덱스를 반환
        return i;
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 4, 1, 5, 7, 8, 6};
        System.out.println("정렬 전" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\n정렬 후 " + Arrays.toString(arr));
    }
}
