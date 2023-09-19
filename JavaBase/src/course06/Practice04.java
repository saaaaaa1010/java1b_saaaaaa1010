package course06;
import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("数値を入力してね");
		int x = stdIn.nextInt();
		
		if(x >= 10) {	
			System.out.println("10以上だよ");
		} else {
			System.out.println("小さい");
		}
	}
}