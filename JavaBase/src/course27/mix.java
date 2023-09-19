package course27;

import java.util.Random;
import java.util.Scanner;

public class mix {
	public static void main(String[] args) {
		int gamecount = 0;
		int wincount = 0;
		int losecount = 0;
		int syozikin = 1000;

		Scanner stdIn = new Scanner(System.in);
		//int z = stdIn.nextInt();
		int z = 1000;
		System.out.println("現在の所持金は" + z + "です");

		Random random1 = new Random();
		int randomNumber1 = random1.nextInt(12);
		System.out.println("カードは" + randomNumber1 + "です。次のカードはこれよりも高い？低い？");

		System.out.println("高い？低い？　高い→1　低い→2");
		int yosou1 = stdIn.nextInt();
		System.out.println("現在のカード:【" + randomNumber1 + "】");

		Random random2 = new Random();
		int randomNumber2 = random2.nextInt(12);
		System.out.println(randomNumber2);

		String result = hantei(randomNumber1, randomNumber2, yosou1);
		System.out.println(result);
	}

	//勝敗判定メソッド
	static String hantei(int ransu1, int ransu2, int yosou1) {
		String winlose = "あ";
		return winlose;
	}

	//終了判定メソッド
	static int end(int modori) {
		Scanner stdIn = new Scanner(System.in);
		int endFlg = stdIn.nextInt();
		if (endFlg == 9999) {
			System.out.println("終了");
			modori = 0;
		} else {
			System.out.println("継続");
			modori = 1;
		}
		return modori;
	}

	//
	static int hilow(int x, int y) {
		Scanner stdIn = new Scanner(System.in);
		int hantei = stdIn.nextInt();
		int kekka;
		if (hantei == 1 && x > y) {
			kekka = 0;
		} else if (hantei == 2 && x < y) {
			kekka = 0;
		} else {
			kekka = 1;
		}
		return kekka;
	}
}