package course19;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		//慣れよう問題⑤
		int[] numArray = new int[3];
		numArray[0] = 10;
		numArray[1] = 11;
		numArray[2] = 12;

		for (int i = 0; i < 3; i++) {
			System.out.println(numArray[i]);
		}
		System.out.println();

		//慣れよう問題⑥
		Scanner stdIn = new Scanner(System.in);
		//int a = stdIn.nextInt();
		int[] numArray2 = new int[10];
		numArray2[0] = 10;
		numArray2[1] = 11;
		numArray2[2] = 12;
		
		//応用問題
		int[] LogicArray = new int[10];
		LogicArray[0] = 100;
		LogicArray[1] = 50;
		LogicArray[2] = 75;
		LogicArray[3] = 80;
		LogicArray[4] = 65;
		
		int savepoint = 0;
		for (int b = 0; b < 5; b++) {
			if (LogicArray[b] > LogicArray[b + 1])
				savepoint = LogicArray[b];
			System.out.println(LogicArray[b]);
			
			
			
		}
		
		
	}
}
