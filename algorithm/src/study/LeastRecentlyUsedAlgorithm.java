package study;


import java.util.Scanner;

// LRU 페이지 교체 알고리즘
public class LeastRecentlyUsedAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] page = new int[]{1, 3, 4, 2};


        System.out.println("현재 페이지를 입력하세요.");
        // 현재 페이지 입력.
        int currentPage = sc.nextInt();
        // 페이지에 입력한 값이 있는지 확인한다.
        // 없다면, 가장 오래된 페이지와 스와핑
        // 있다면, 해당 값을 제일 앞으로 스와핑.
        sc.close();
    }
}
