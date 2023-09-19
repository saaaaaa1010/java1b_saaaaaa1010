package course12;

import java.util.Scanner;

public class Practice03 {

	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("縦の数字を入力してね");
		int i = stdIn.nextInt();
		
		System.out.println("横の数字を入力してね");
		int j = stdIn.nextInt();
		
		//while (a <= i) {

			int b = 0;
			
			while (b <= j) {
				System.out.print(i * j + ",");
				j++;
			}
			System.out.println();
			i++;
		}
	}
