package akinator;

import java.util.Scanner;

public class akinator01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		System.out.println("性別は？　1:男性 2:女性");
		String a = stdIn.next();
		System.out.println("職業は？　1:営業職 2:エンジニア");
		String b = stdIn.next();
		System.out.println("魚は好き？　1:好き 2:嫌い");
		String c = stdIn.next();
		System.out.println("肉は好き？　1:好き 2:嫌い 3:未回答");
		String d = stdIn.next();
		System.out.println("夏と冬どっちが好き？　1:夏 2:冬");
		String e = stdIn.next();
		System.out.println("猫と犬どっちが好き？　1:猫 2:犬");
		String f = stdIn.next();

		if ((a + b + c + d + e + f).equals("112321")) {
			System.out.println("あなたが思い浮かべたのはAさんです");
		} else {
			if ((a + b + c + d + e + f).equals("121322")) {
				System.out.println("あなたが思い浮かべたのはBさんです");
			} else {
				if ((a + b + c + d + e + f).equals("112121")) {
					System.out.println("あなたが思い浮かべたのはCさんです");
				} else {
					if ((a + b + c + d + e + f).equals("221312")) {
						System.out.println("あなたが思い浮かべたのはDさんです");
					} else {
						if ((a + b + c + d + e + f).equals("221311")) {
							System.out.println("あなたが思い浮かべたのはEさんです");
						} else {
							if ((a + b + c + d + e + f).equals("212122")) {
								System.out.println("あなたが思い浮かべたのはFさんです");
							} else {
								System.out.println("該当なし");
							}
						}
					}
				}
			}
		}
	}
}
