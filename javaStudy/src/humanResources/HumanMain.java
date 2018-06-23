package humanResources;

import java.util.Scanner;

public class HumanMain {
	public static void main(String[] args) {

		HumanProc hp = new HumanProc();
		HumanDTO dto = new HumanDTO();

		@SuppressWarnings("resource")
		Scanner scnMenu = new Scanner(System.in);

		while (true) {
			dto.showMenu();
			int choiceNum = scnMenu.nextInt();

			switch (choiceNum) {
			case 1:
				hp.getHumanList();
				break;
			case 2:
				hp.insertHuman();
				break;
			case 3:
				hp.updateHuman();
				break;
			case 4:
				hp.deleteHuman();
				break;
			case 5:
				System.out.println(" 종료 합니다... ");
				System.exit(0);
			}
		} // end of while
	}// end of main
}
