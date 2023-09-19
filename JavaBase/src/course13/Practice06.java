package course13;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値を入力してね。");
		Scanner stdIn = new Scanner(System.in);

		//変数yyに入力された数値が格納されている。
		int yy = stdIn.nextInt();

		for (int i = 1; i <= yy; i++)
			System.out.println("現在" + i + "回目のループです。");

	}

}
