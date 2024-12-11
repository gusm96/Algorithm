package study;

import java.util.Random;


public class QuickSort2 {
    private static Random random = new Random();

    // QuickSort의 최악의 경우를 개선하기 위한 방법
    static void randomPivotQuickSort(int[] arr, int begin, int end) {
        if (end <= begin) return;

        int pivot = randomPartition(arr, begin, end);

        randomPivotQuickSort(arr, begin, pivot - 1);
        randomPartition(arr, pivot + 1, end);
    }

    // 가장 첫번째 값 퀵정렬 메소드
    static void firstPivotQuickSort(int[] arr, int start, int end) {
        // start가 end보다 크거나 같으면 재귀 호출 종료
        if (start >= end) return;

        // 분할 함수 호출하여 pivot의 인덱스 얻기
        int pivot = partition(arr, start, end);

        // pivot을 기준으로 첫번째 값과 마지막 부분 배열에 대해 재귀 호출
        firstPivotQuickSort(arr, start, pivot - 1);
        firstPivotQuickSort(arr, pivot + 1, end);
    }

    // 랜덤 퀵정렬을 위한 분할 함수
    static int randomPartition(int[] arr, int begin, int end) {
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

    // 분할 함수
    static int partition(int[] arr, int begin, int end) {
        // 배열의 가장 첫번째 값을 pivot으로 선정
        int pivot = arr[begin];
        int i = begin, j = end;

        // i가 j보다 작을 때까지 반복
        while (i < j) {
            // 마지막에서 pivot보다 작은 값을 찾기
            while (pivot < arr[j]) j--;
            // 첫번째 값에서 pivot보다 큰 값을 찾기
            while (i < j && pivot >= arr[i]) i++;
            // pivot보다 작은 값이 있다면 swap
            if (i < j) swap(arr, i, j);
        }

        // pivot을 적절한 위치에 놓기
        arr[begin] = arr[i];
        arr[i] = pivot;

        // pivot의 최종 인덱스를 반환
        return i;
    }

    static void swap(int[] arr, int begin, int end) {
        int temp = arr[begin];
        arr[begin] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = 10000 - i; // 역순으로 채우기
        }

        int[] arr2 = arr.clone();
        // 랜덤 피벗 퀵 정렬 수행 및 시간 측정
        long startTime = System.nanoTime();
        randomPivotQuickSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        System.out.println("랜덤 피벗 퀵 정렬 결과: ");
        System.out.println("수행 시간: " + (endTime - startTime) / 1_000_000.0 + " 밀리세컨드");

        // 첫번째 피벗 퀵 정렬 수행 및 시간 측정
        startTime = System.nanoTime();
        firstPivotQuickSort(arr2, 0, arr2.length - 1);
        endTime = System.nanoTime();
        System.out.println("첫번째 피벗 퀵 정렬 결과: ");
        System.out.println("수행 시간: " + (endTime - startTime) / 1_000_000.0 + " 밀리세컨드");
    }
}
