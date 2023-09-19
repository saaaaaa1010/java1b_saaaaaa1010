package course57;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//1-100までのランダムな数値を生成し、変数「ransu」に格納する。
		Scanner stdIn = new Scanner(System.in);
		Random rnd = new Random();
		int ransu = rnd.nextInt(100) + 1;
		int i = 0;

		while (true) {
			System.out.println("数を入れてね");
			int a = stdIn.nextInt();

			if (ransu == a) {
				System.out.println(i + "回目でクリア！答えは" + ransu + "です");
				break;

			} else {
				if (ransu > a) {
					System.out.println("答えはもっと大きい数字です");
				} else {
					System.out.println("答えはもっと小さい数字です");
				}
				i = i + 1;
			}
		}
	}
}