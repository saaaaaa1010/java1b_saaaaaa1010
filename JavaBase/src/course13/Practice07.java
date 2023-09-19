package course13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してね。");
		Scanner stdIn = new Scanner(System.in);

		//変数yyに入力された数値が格納されている。
		int i = 0;
		int yy = stdIn.nextInt();

		for (i = 1; i <= yy; i++) {
			int a = i % 2;
			System.out.println("現在" + i + "回目のループです。");
			if (a == 0) {
				System.out.println("偶数だよ");
			}
			if (a == 1) {
				System.out.println("奇数だよ");
			}
			if (i > 100) {
				System.out.println("どれだけ回すの");
			}
		}
	}
}