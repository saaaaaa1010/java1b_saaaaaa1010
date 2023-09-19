package poketon;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Pocketon pocke = new Pocketon("", "", 0, 0);
		Battle battle = new Battle();
		while (true) {

			System.out.println("1・・・捕獲");
			System.out.println("2・・・図鑑を見る");
			System.out.println("3・・・バトル");
			System.out.println("99 ・・プログラム終了");
			Scanner stdIn = new Scanner(System.in);
			int menu = stdIn.nextInt();
			if (menu == 1) {
				System.out.println("ポケトンの名前いれて");
				pocke.name = stdIn.next();
				System.out.println("タイプいれて（ほのお、みず、じめん、くさ）");
				pocke.type = stdIn.next();
				System.out.println("戦闘力いれて");
				pocke.power = stdIn.nextInt();
				System.out.println("捕獲難易度いれて");
				pocke.difficult = stdIn.nextInt();
				trainer.capture(pocke);
				trainer.display();
			}

			if (menu == 2) {
				trainer.display();
			}

			if (menu == 3) {
				try {
					System.out.println("ポケトン一匹目の名前を入れてください");
					String poke1 = stdIn.next();
					System.out.println("ポケトン二匹目の名前を入れてください");
					String poke2 = stdIn.next();
					int i;
					for (i = 0; !(poke1.equals(trainer.myPockes[i].name)); i++) {
					}

					int j;
					for (j = 0; !(poke2.equals(trainer.myPockes[j].name)); i++) {
					}

					battle.doBattle(trainer.myPockes[i], trainer.myPockes[j]);
				} catch (Exception e) {

				}
			}
			if (menu == 99) {
				break;
			}
		}
	}
}