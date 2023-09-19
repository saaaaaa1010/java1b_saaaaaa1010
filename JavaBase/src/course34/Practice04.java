package course34;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		
		int[] variable = new int[x];
		variable[0] = 10;
		variable[1] = 20;
		variable[2] = 30;
		variable[3] = 40;
		variable[4] = 50;
		
		int sum = 0;
		for (int i = 0; i < variable.length; i++) {
			sum = sum + variable[i];
		}
		//System.out.println(sum);
	}
}