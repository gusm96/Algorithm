package programmers.level0;

public class ArrayRotation {
	 public int[] solution(int[] numbers, String direction) {
	        if(direction.equals("right")){
	            int temp = numbers[numbers.length-1];
	            for(int i =numbers.length-1;i>=1;i--){
	                numbers[i] = numbers[i-1];
	            }
	            numbers[0] = temp;
	        }else{
	            int temp = numbers[0];
	            for(int i =1; i<=numbers.length-1;i++){
	                numbers[i-1] = numbers[i];
	            }
	            numbers[numbers.length-1] = temp;
	        }
	        return numbers;
	    }
	 public static void main(String[]args) {
		 int [] numbers = {1, 2, 3};
		 String direction = "right";
		 ArrayRotation ar = new ArrayRotation();
		 System.out.println(ar.solution(numbers, direction));
	 }
}
