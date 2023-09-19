package course24;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1:足し算　2:引き算");
		int a = stdIn.nextInt();

		System.out.println("計算する数字１つ目を入れてください");
		int keisan1 = stdIn.nextInt();

		System.out.println("計算する数字２つ目を入れてください");
		int keisan2 = stdIn.nextInt();

		if (a == 1) {
			plus(keisan1, keisan2);
		}else if (a == 2) {
				minus(keisan1, keisan2);
		}
	}

	static void plus(int x, int y) {
		//受け取った値を画面に表示
		System.out.println(x + y);
	}

	static void minus(int x, int y) {
		//受け取った値を画面に表示
		System.out.println(x - y);
	}
}