package practice01;

public class Prob2 {

	public static void main(String[] args) {
		int countNum = 1;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf(countNum + i + j + " ");
			}
			System.out.println("");
		}
	}
}
