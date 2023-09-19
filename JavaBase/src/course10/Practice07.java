package course10;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		System.out.println("数値を入力してください");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int num = x % 2;

		if (num == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");

		}
	}
}