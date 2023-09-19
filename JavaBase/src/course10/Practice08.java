package course10;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		System.out.println("数値を3つ入力してください");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int z = stdIn.nextInt();

		if (x > y) {
			if (x > z) {
				if (z > y) {
					System.out.println(x + "が1番大きい数値です。");
					System.out.println(z + "が2番目に大きい数値です。");
					System.out.println(y + "が3番目に大きい数値です。");

				}
			}
		}
	}
}
