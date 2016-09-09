package practice01;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("숫자를 입력해주세요:");
		String inputNum = scan.nextLine();
		for (int i = 1; i <= Integer.parseInt(inputNum); i++) {
			String str1 = Integer.toString(i);
			int clap = 0;

			if (str1.charAt(0) == '3' || str1.charAt(0) == '6' || str1.charAt(0) == '9') {
				clap++;
			}
			if (i >= 10) {
				if (str1.charAt(1) == '3' || str1.charAt(1) == '6' || str1.charAt(1) == '9') {
					clap++;
				}
			}
			if (clap != 0) {
				System.out.print(i);
				for (int j = 0; j < clap; j++) {
					System.out.print('짝');
				}
				System.out.println("");
			}
		}
		scan.close();
	}
}
