package course09;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		System.out.println("入力してね");
		Scanner stdIn = new Scanner(System.in);
		String like = stdIn.next();

		switch (like) {
		case "野菜":
		case "薬":
			System.out.println("健康的ですね");
			break;
		case "肉":
			System.out.println("肉派ですね");
			break;
		default:
			System.out.println("魚派ですね");
			break;
		}
	}
}
