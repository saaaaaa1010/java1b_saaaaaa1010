package gacha;

import java.util.Random;
import java.util.Scanner;

public class Gacha01 {

	static Random rand = new Random();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何回回しますか？");
		int kaisu = stdIn.nextInt();

		for (int kaisu2 = 1; kaisu >= kaisu2; kaisu2++) {
			int random = rand.nextInt(100) + 1;
			System.out.print(kaisu2 + "回目のガチャ：");

			if (kaisu >= 301) {
				if (random <= 1) {
					ssr();

				} else {
					if (random <= 18) {
						System.out.println("SR");

					} else {
						System.out.println("R");
					}
				}

			} else {
				if (kaisu2 % 300 == 0) {
					ssr();
				} else {
					if (kaisu2 % 10 == 0) {
						if (random <= 3) {
							ssr();
						} else {
							System.out.println("SR");
						}
					} else {
						if (random <= 3) {
							ssr();

						} else {
							if (random <= 18) {
								System.out.println("SR");

							} else {
								System.out.println("R");
							}
						}
					}
				}
			}
		}
	}

	static void ssr() {
		int random = rand.nextInt(100) + 1;
		if (random <= 70) {
			System.out.println("ピックアップSSR");
		} else {
			System.out.println("通常SSR");
		}
	}
}