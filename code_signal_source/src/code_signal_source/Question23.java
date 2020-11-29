package code_signal_source;

public class Question23 {
	public static void main(String[] args) {
		int[][] image = {{7,4,0,1}, 
				 {5,6,2,2}, 
				 {6,10,7,8}, 
				 {1,4,2,0}};
		System.out.println(boxBlur(image));
	}
	static int[][] boxBlur(int[][] image) {
	    int[][] output = new int[image.length/2][image[0].length/2];
		for(int i = 0; i < image.length - 2; i++) {
			for(int j = 0; j < image[i].length-2; j++) {
				output[i][j] = (image[i][j]+image[i][j+1]+image[i][j+2]+image[i+1][j]+image[i+1][j+1]+image[i+1][j+2]+image[i+2][j]+image[i+2][j+1]+image[i+2][j+2])/9;
			}
		}
		return output;

	}
}
