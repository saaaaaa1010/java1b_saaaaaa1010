package course34;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();

		if (a >= 50) {
			System.out.println("50以上です。");
		} else {
			System.err.println("49以下です。");
		}
	}
}