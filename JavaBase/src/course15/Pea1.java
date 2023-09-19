package course15;

import java.util.Random;
import java.util.Scanner;

public class Pea1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 10000;
		System.out.println("所持金は" + a + "です");
		System.out.println("掛け金を入力してください");
		int b = stdIn.nextInt();

		Random rnd = new Random();
		int num1 = 2;
		int num2 = 2;
		int num3 = 2;
		//		int num3 = rnd.nextInt(2) + 2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		if (num1 == 1) {
			if (num2 == 1) {
				if (num3 == 1) {
					int x1 = b * 5;
					System.out.println("所持金は" + (a + x1) + "です");
				}
				//ゾロ目
				if (num1 == 2) {
					if (num2 == 2) {
						if (num3 == 2) {
							int x2 = b * 3;
							System.out.println("所持金は" + (a + x2) + "です");
						}
						if (num1 == 3) {
							if (num2 == 3) {
								if (num3 == 3) {
									int x3 = b * 3;
									System.out.println("所持金は" + (a + x3) + "です");
								}
								if (num1 == 4) {
									if (num2 == 4) {
										if (num3 == 4) {
											int x4 = b * 3;
											System.out.println("所持金は" + (a + x4) + "です");
										}
										if (num1 == 5) {
											if (num2 == 5) {
												if (num3 == 5) {
													int x5 = b * 3;
													System.out.println("所持金は" + (a + x5) + "です");
												}
												if (num1 == 6) {
													if (num2 == 6) {
														if (num3 == 6) {
															int x6 = b * 3;
															System.out.println("所持金は" + (a + x6) + "です");
														}
														//456
														if (num1 == 4) {
															if (num2 == 5) {
																if (num3 == 6) {
																	int x456 = b * 2;
																	System.out.println("所持金は" + (a + x456) + "です");
																}
																if (num1 == 5) {
																	if (num2 == 6) {
																		if (num3 == 4) {
																			int x564 = b * 2;
																			System.out.println(
																					"所持金は" + (a + x564) + "です");
																		}
																		if (num1 == 6) {
																			if (num2 == 4) {
																				if (num3 == 5) {
																					int x645 = b * 2;
																					System.out.println(
																							"所持金は" + (a + x645) + "です");
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
					}
				}
			}
		}
	}
}
