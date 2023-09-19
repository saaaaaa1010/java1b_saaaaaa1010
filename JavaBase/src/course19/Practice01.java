package course19;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//慣れよう問題①
		String[] mygroup = new String[10];
		mygroup[0] = "つっちー";
		mygroup[1] = "うすい";
		mygroup[2] = "ふじくら";

		//慣れよう問題②
		int[] mygroupnum = new int[10];
		mygroupnum[0] = 18;
		mygroupnum[1] = 4;
		mygroupnum[2] = 22;

		//慣れよう問題③
		int[] mynum = new int[10];
		mynum[0] = 10;
		mynum[1] = 50;
		mynum[2] = mynum[0] + mynum[1];

		//慣れよう問題④
		Scanner stdIn = new Scanner(System.in);
		int[] mynumscan = new int[10];
		mynumscan[0] = 10;
		mynumscan[1] = stdIn.nextInt();
		mynumscan[2] = mynumscan[0] + mynumscan[1];
		System.out.println(mynumscan[2]);
	}
}