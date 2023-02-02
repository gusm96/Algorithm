package programmers.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date2016 {

	public String solution(int a, int b) {
		String answer = "";
		String[] arr = { "MON", "THU", "WED", "THU", "FRI", "SAT", "SUN" };
		LocalDate date = LocalDate.of(2016, a, b);
		DayOfWeek day = date.getDayOfWeek();
		int dayOfWeekNum = day.getValue();
		answer = arr[dayOfWeekNum-1];
		return answer;
	}

	public static void main(String[] args) {
		Date2016 sol = new Date2016();
		System.out.println(sol.solution(5, 24));
		String srr = "arsr";
		System.out.println(srr.substring(1,3));
	}
}
