package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 10000;
		System.out.println("所持金は" + a + "です");
		System.out.println("掛け金を入力してください");
		int b = stdIn.nextInt();
		a = a - b;

		Random rnd = new Random();
		int num1 = 2;
		int num2 = 2;
		int num3 = 2;
		//		int num3 = rnd.nextInt(2) + 2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		String num4 = String.valueOf(num1);
		String num5 = String.valueOf(num2);
		String num6 = String.valueOf(num3);

		switch (num4 + num5 + num6) {
		case "111":
			int x1 = b * 5;
			System.out.println("所持金は" + (a + x1) + "です");
			break;

		//ぞろ目
		case "222":
		case "333":
		case "444":
		case "555":
		case "666":
			int x2 = b * 3;
			System.out.println("所持金は" + (a + x2) + "です");
			break;

		//シゴロ
		case "456":
		case "465":
		case "546":
		case "564":
		case "645":
		case "654":
			int sigoro = b * 2;
			System.out.println("所持金は" + (a + sigoro) + "です");
			break;
			
		//通常の目
		case "226":
		case "225":
		case "224":
		case "223":
		case "332":
		case "221":
			System.out.println("所持金は" + (a + b) + "です");
			break;
			
		//役なし・ションベン
		case "156":
		case "777":
			System.out.println("所持金は" + (a) + "です");
			break;
			
		case "123":
			int hifumi = b * 2;
			System.out.println("所持金は" + (a - hifumi) + "です");
			break;

		/*while (syozikin > 0 && syozikin < 50000) {
		}
		If (syozikin == 0) {
			System.out.println("1050年地下行き");
		}else {
			System.out.println("ゲームクリア");
		}*/

		}
	}
}