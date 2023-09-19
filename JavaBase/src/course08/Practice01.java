package course08;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		System.out.println("何月？");
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		
		if (x == 2) {
			System.out.println(x + ("月は28日まであります。"));
		} else {
			if (x == 4 || x == 6 || x == 9 || x == 11) {
				System.out.println(x + ("月は30日まであります。"));
			} else {
				if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) {
					System.out.println(x + ("月は31日まであります。"));
		
				}
			}
		}
	}
}