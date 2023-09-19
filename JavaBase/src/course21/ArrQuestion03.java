package course21;

import java.util.Scanner;

public class ArrQuestion03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int typhoon[] = new int[12];
		typhoon[0] = 1;
		typhoon[1] = 1;
		typhoon[2] = 0;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 1;
		typhoon[6] = 4;
		typhoon[7] = 5;
		typhoon[8] = 6;
		typhoon[9] = 4;
		typhoon[10] = 6;
		typhoon[11] = 1;

		int quake[] = new int[12];
		quake[0] = 153;
		quake[1] = 127;
		quake[2] = 130;
		quake[3] = 109;
		quake[4] = 118;
		quake[5] = 164;
		quake[6] = 130;
		quake[7] = 103;
		quake[8] = 103;
		quake[9] = 104;
		quake[10] = 123;
		quake[11] = 141;

		int rain[] = new int[12];
		rain[0] = 20;
		rain[1] = 58;
		rain[2] = 107;
		rain[3] = 87;
		rain[4] = 114;
		rain[5] = 187;
		rain[6] = 200;
		rain[7] = 59;
		rain[8] = 169;
		rain[9] = 441;
		rain[10] = 158;
		rain[11] = 94;

		Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報を選んでください。\n1:台風件数　2:地震件数　3:降水量");
		String jouhou = stdIn.next();

		System.out.println("年別か年別かを選んでください。1:年別　2:月別");
		String nenbetu = stdIn.next();

		if ((jouhou + nenbetu).equals("11")) {
			int typhoonnum = 0;
			for (int i = 0; i < typhoon.length; i++) {
				typhoonnum = typhoonnum + typhoon[i];
			}
			System.out.println("1年間に起こった台風の総合計は" + typhoonnum + "件です。");
		} else {
			if ((jouhou + nenbetu).equals("21")) {
				int quakenum = 0;
				for (int i = 0; i < quake.length; i++) {
					quakenum = quakenum + quake[i];
				}
				System.out.println("1年間に起こった地震の総合計は" + quakenum + "件です。");
			} else {
				if ((jouhou + nenbetu).equals("31")) {
					int rainnum = 0;
					for (int i = 0; i < rain.length; i++) {
						rainnum = rainnum + rain[i];
					}
					System.out.println("1年間に起こった降水量の総合計は" + rainnum + "件です。");

				} else {
					System.out.println("見たい月を入力してください");
					int month = stdIn.nextInt();
					if ((jouhou + nenbetu).equals("12")) {
						System.out.println(month + "月の台風件数は" + (typhoon[month - 1]) + "件です。");

					} else {
						if ((jouhou + nenbetu).equals("22")) {
							System.out.println(month + "月の台風件数は" + (quake[month - 1]) + "件です。");

						} else {
							if ((jouhou + nenbetu).equals("32")) {
								System.out.println(month + "月の台風件数は" + (typhoon[month - 1]) + "件です。");
							}
						}
					}
				}
			}
		}
	}
}