package practice01;

import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputNum = scan.nextLine();
		for (int i = 1; i <= Integer.parseInt(inputNum); i++) {
			int clap = 0;

			char firstNum = inputNum.charAt(0);
			char secendNum = inputNum.charAt(1);
			if (firstNum=='3'||firstNum=='6'||firstNum=='9') {
				clap++;
				if(secendNum=='3'||secendNum=='6'||secendNum=='9'){
					clap++;
				}
				System.out.println("clap="+clap);
				if(clap!=0){
					System.out.println("i="+i);
				}
			}
			
		}
		scan.close();
	}
}
