package course35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("xの値を入れてください");
		int x = stdIn.nextInt();
		
		if (x >= 50) {
			System.out.println("yの値を入れてください");
			int y = stdIn.nextInt();
			calc(x, y);
		} else {
			calc(x);
		}
	}

	static void calc(int a) {
		System.out.println(a * 10);
	}

	static void calc(int b, int c) {
		System.out.println(b + c);
	}
}