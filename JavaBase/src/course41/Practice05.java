package course41;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値をいれて");
		int x = stdIn.nextInt();
		if (x >=50){
			System.out.println("50以上です。");
		}else {
			System.out.println("49以下です。");
		}
	}
}