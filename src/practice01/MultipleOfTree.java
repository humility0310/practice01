package practice01;

import java.util.Scanner;
import java.util.Random;

public class MultipleOfTree {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int answer = 0;
		int counter = 0;
		char regame = 'd';
		do {
			int quest = random.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어보세요 ");
			int min = 1;
			int max = 100;

			while (quest != answer) {
				System.out.println(min + "-" + max);
				counter++;
				System.out.print(counter + ">>");
				answer = scanner.nextInt();
				if (answer < quest) {
					System.out.println("더 높게");
					min = answer;
				} else if (answer > quest) {
					System.out.println("더 낮게");
					max = answer;
				}
			}
			System.out.println("맞았습니다.\n다시하시겠습니까.(y/n)>>");
			regame = scanner.next().charAt(0);

			switch (regame) {
			case 'y':
				continue;
			case 'n':
				break;
			}

			if (regame == 'n') {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			break;
		} while (true);
		scanner.close();
	}
}