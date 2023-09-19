package course10;

import java.util.Scanner;

public class Practice10没 {

	public static void main(String[] args) {
		System.out.println("曜日を入力してください");
		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.next();

		if (a.equals("日曜")) {
			System.out.println("予約できません");

			if (a.equals("月曜")) {
			System.out.println("時間帯を入力してください　1=午前　2=午後　3=夜間");
			int time2 = stdIn.nextInt();
			switch (time2) {
			case 01:
				System.out.println("予約できます");
				break;
			case 02:
				System.out.println("予約できます");
				break;
			case 03:
				System.out.println("予約できます");
				break;
/*
				if (a.equals("火曜")) {
					System.out.println("時間帯を入力してください　1=午前　2=午後　3=夜間");
					int time3 = stdIn.nextInt();
					switch (time3) {
					case 01:
						System.out.println("予約できません");
						break;
					case 02:
						System.out.println("予約できます");
						break;
					case 03:
						System.out.println("予約できます");
						break;

						if (a == "水曜") {
							System.out.println("時間帯を入力してください　1=午前　2=午後　3=夜間");
							int time4 = stdIn.nextInt();
							switch (time4) {
							case 01:
								System.out.println("予約できます");
								break;
							case 02:
								System.out.println("予約できます");
								break;
							case 03:
								System.out.println("予約できません");
								break;

								if (a == "木曜") {
									System.out.println("時間帯を入力してください　1=午前　2=午後　3=夜間");
									int time5 = stdIn.nextInt();
									switch (time5) {
									case 01:
										System.out.println("予約できます");
										break;
									case 02:
										System.out.println("予約できます");
										break;
									case 03:
										System.out.println("予約できます");
										break;

										if (a == "金曜") {
											System.out.println("時間帯を入力してください　1=午前　2=午後　3=夜間");
											int time6 = stdIn.nextInt();
											switch (time6) {
											case 01:
												System.out.println("予約できません");
												break;
											case 02:
												System.out.println("予約できます");
												break;
											case 03:
												System.out.println("予約できます");
												break;

												if (a == "土曜") {
													System.out.println("時間帯を入力してください　1=午前　2=午後　3=夜間");
													int time7 = stdIn.nextInt();
													switch (time7) {
													case 01:
														System.out.println("予約できます");
														break;
													case 02:
														System.out.println("予約できません");
														break;
													case 03:
														System.out.println("予約できません");
														break;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
}
*/
			}
			}
		}
	}
}
