package code_signal_source;

public class Question20 {
	/**
	 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.	
	 */
	
	public static void main(String[] args) {
		int[] arr = {-1, 4, 10, 3, -2};
		System.out.println(arrayMaximalAdjacentDifference(arr));
	}
	
	static int arrayMaximalAdjacentDifference(int[] inputArray) {
		int length = inputArray.length;
		int result = 0;
		for (int i = 1; i < length; i++) {
				result = Math.max(result, inputArray[i]-inputArray[i-1]);
				result = Math.max(result, inputArray[i-1]-inputArray[i]);
		}
		return result;
	}

	
	
}
