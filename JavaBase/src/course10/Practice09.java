package course10;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		System.out.println("曜日を入力してね");
		Scanner stdIn = new Scanner(System.in);
		String month = stdIn.next();

		switch (month) {
		case "日曜":
		case "火曜":
		case "金曜":
			System.out.println("予約できません");
			break;
		case "月曜":
		case "水曜":
		case "木曜":
		case "土曜":
			System.out.println("予約できます");
			break;
		default:
			System.out.println("該当なし");
		}
	}
}
