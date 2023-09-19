package course12;

import java.util.Scanner;

public class Practice03_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("たて");
		long tate = stdIn.nextLong();
		System.out.println("よこ");
		long yoko = stdIn.nextLong();
		
		int i = 1;
		int n = 1;

		while (n <= tate) {

			while (i <= yoko) {
				System.out.print(i * n + ",");
				i++;
			}
			System.out.println();
			i = 1;
			n++;
		}
	}
}
