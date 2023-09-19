package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 10000;
		System.out.println("所持金は" + a + "です");
		System.out.println("掛け金を入力してください");
		int b = stdIn.nextInt();
		a = a - b;

		Random rnd = new Random();
		int num1 = 6;
		int num2 = 5;
		int num3 = 4;
		//		int num3 = rnd.nextInt(2) + 2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		int zorome = (num1 + num2 + num3);
		switch (num1 + num2 + num3) {
		case 3:
			int x1 = b * 5;
			System.out.println("所持金は" + (a + x1) + "です");
			break;
		case 6:
			int x2 = b * 3;
			System.out.println("所持金は" + (a + x2) + "です");
			break;
		case 9:
			int x3 = b * 3;
			System.out.println("所持金は" + (a + x3) + "です");
			break;
		case 12:
			int x4 = b * 3;
			System.out.println("所持金は" + (a + x4) + "です");
			break;
		case 15:
			int x5 = b * 3;
			System.out.println("所持金は" + (a + x5) + "です");
			break;
		case 18:
			int x6 = b * 3;
			System.out.println("所持金は" + (a + x6) + "です");
			break;
			
			default	:	
			int sigoro1 = (num1);
			switch (sigoro1) {
			case 4:
			case 5:
			case 6:
				int sigoro456 = (num1 + num2 + num3);
				switch (sigoro456) {
				case 15:
					int sigoro = b * 3;
					System.out.println("所持金は" + (a + sigoro) + "です");

						}
					}
				}
			}
	}