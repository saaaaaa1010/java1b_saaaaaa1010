package course10;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		System.out.println("数値を入力してください");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();

		if (x == y) {
			System.out.println("おなじー");
		} else {
			if (x > y) {
				System.out.println("xがでかい！なぜならxは" + x + "でyは" + y + "だから");
			} else {
				System.out.println("yがでかい！なぜならxは" + x + "でyは" + y + "だから");
			}
		}
	}
}
