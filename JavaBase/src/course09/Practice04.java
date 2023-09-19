package course09;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		System.out.println("誕生月を入力してね");
		Scanner stdIn = new Scanner(System.in);
		int month = stdIn.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("大吉ですね");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("中吉ですね");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("小吉ですね");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("大吉ですね");
			break;
		default:
			System.out.println("該当なし");
		}
	}
}
