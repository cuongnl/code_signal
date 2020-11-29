package code_signal_source;


public class Question22 {
	public static void main(String[] args) {
		int arr[] = { 19, 32, 11, 23 };
		System.out.println(avoidObstacles(arr));
	}

	static int avoidObstacles(int[] inputArray) {
		int output = 1;
		while (true) {
			int i = 0;
			for (i = 0; i < inputArray.length; i++) {
				if (inputArray[i] % output == 0) {
					break;
				}
			}
			if (i == inputArray.length) {
				break;
			}
			output++;
		}
		return output;
	}
}
