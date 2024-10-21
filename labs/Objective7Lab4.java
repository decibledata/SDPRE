public class Objective7Lab4 {
	public static void main(String[] args) {
		int currentSumTotal = 0;
		int counter = 0;
		while(counter < 20) {
			counter ++;
			currentSumTotal = currentSumTotal + counter;
		}
		System.out.println(currentSumTotal);
	}
}