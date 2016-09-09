package practice01;

import java.util.Scanner;
import java.util.Random;

public class MultipleOfTree {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int answer = 0;
		do {//한번은 무조건 실행해야하기 때문에 do-while문

			char regame = 'd';//재실행 확인 변수
			int quest = random.nextInt(100) + 1;//문제 숫자 랜덤함수로 받아오기
			System.out.println("수를 결정하였습니다. 맞추어보세요 ");
			int min = 1;//보기의 최소값
			int max = 100;//보기의 최대값

			while (quest != answer) {
				int counter = 0;//질문 횟수
				System.out.println(min + "-" + max);//정답범위 출력
				counter++;//질문횟수 추가
				System.out.print(counter + ">>");
				answer = scanner.nextInt();//입력값 받기
				if (answer < quest) {//입력값과 정답 비교문
					System.out.println("더 높게");
					min = answer;//정답보다 낮으면 최소값에 입력값 입력
				} else if (answer > quest) {
					System.out.println("더 낮게");
					max = answer;//정답보다 높으면 최대값에 입력값 입력
				}
			}

			System.out.println("맞추셨습니다. 정답은" + quest + "입니다.");

			while (regame != 'y' && regame != 'n') {//재실행 여부 (y나 n이 입력되면 나가기)
				System.out.println("다시하시겠습니까.(y/n)>>");
				regame = scanner.next().charAt(0);//String->char 타입으로 변경
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
				continue;//do-while문 재시작
			}

		} while (true);
		scanner.close();
	}
}