package study;

import java.util.Arrays;

public class Pagination {
	private int[] arr;

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "Pagination [arr=" + Arrays.toString(arr) + "]";
	}

	public int[] page(int nowPage, int totalPage) {
		int[] arr = {};
		if (totalPage < 10) {
			arr = new int[totalPage];
			for (int i = 0; i < totalPage; i++) {
				arr[i] = i + 1;
			}
		} else {
			int group = (int) Math.ceil((double) nowPage / (double) 10);
			int start = ((group - 1) * 10);
			if (group == 1) {
				arr = new int[10];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = i + 1;
				}
			} else if (totalPage - (int)Math.floor((double)nowPage / (double)10)*10 < 10) {
				arr = new int[totalPage % 10];
				for (int i = start; i < start + arr.length; i++) {
					arr[i % 10] = i + 1;
				}
			} else {
				arr = new int[10];
				for (int i = start; i < group * 10; i++) {
					arr[i % 10] = i + 1;
				}
			}
		}

		for (int val : arr)
			System.out.println(val);

		return arr;
	}

	public static void main(String[] args) {
		Pagination pg = new Pagination();
		System.out.println(pg.page(31, 37));
	}
}
