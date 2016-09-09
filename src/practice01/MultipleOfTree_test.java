package practice01;

import java.util.Scanner;
import java.util.Random;

public class MultipleOfTree_test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int answer = 0;
		do {

			char regame = 'd';
			int quest = random.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어보세요 " + quest);
			int min = 1;
			int max = 100;

			while (quest != answer) {

				int counter = 0;
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
			System.out.println("맞추셨습니다. 정답은" + quest + "입니다.");
			while (!(regame == 'y')||(regame == 'n')) {
				System.out.println("다시하시겠습니까.(y/n)>>");
				regame = scanner.next().charAt(0);

				switch (regame) {
				case 'y':
					break;
				case 'n':
					break;
				default:
					System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
					continue;

				}
				break;
			}
			if (regame == 'n') {
				System.out.println("감사합니다. 게임을 종료하겠습니다.");
				break;
			} else if (regame == 'y') {
				continue;
			}
		} while (true);
		scanner.close();
	}
}