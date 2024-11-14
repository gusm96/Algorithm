package programmers.level1.sort;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748
/*
* 문제 설명
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
* commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
*
제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.
*
*
입출력 예
array	commands	return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
입출력 예 설명
[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
* */
public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 시작 인덱스
            int end = commands[i][1]; // end는 포함해야 하므로 -1 하지 않음
            int k = commands[i][2] - 1; // k는 0 기반 인덱스이므로 -1

            int[] arr = new int[end - start]; // 크기 조정

            // 배열 복사
            for (int j = start; j < end; j++) {
                arr[j - start] = array[j];
            }
            quickSort(arr); // 정렬
            answer[i] = arr[k]; // k번째 요소 저장
        }
        return answer;
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left, j = right;

        while (i < j) {
            while (pivot < arr[j]) j--;
            while (i < j && pivot >= arr[i]) i++;
            if (i < j) swap(arr, i, j);
        }

        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // 다른 사람이 푼 문제
    public int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KthNumber kn = new KthNumber();

        // Measure execution time for solution
        long startTime1 = System.nanoTime();
        System.out.println("Solution 1 : " + Arrays.toString(kn.solution(array, commands)));
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // Measure execution time for solution2
        long startTime2 = System.nanoTime();
        System.out.println("Solution 2 : " + Arrays.toString(kn.solution2(array, commands)));
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        // Print execution time
        System.out.println("Execution time of solution: " + duration1 + " ns");
        System.out.println("Execution time of solution2: " + duration2 + " ns");
    }
}
