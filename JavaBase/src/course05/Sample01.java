package course05;

//import・・・Scannerパーツの取り付け
//一回だけ書く
import java.util.Scanner;

public class Sample01 {
	
	public static void main(String[] args) {
		//Scanner StdIn・・・Scanner使用準備
		//一回だけ書く
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("xとyを加算します");
		System.out.println("xの値を入力してください");
		
		//StdIn.nextInt・・・Scanner使用（キーボード入力が発生する）
		//好きな時に好きなだけ使える
		//変数「x」に入力した内容が格納される。
		double x = stdIn.nextDouble();

		System.out.println("yの値を入力してください");
		int y = stdIn.nextInt();
		
		//int zを作成し、
		//キーボードから入力した値を格納
		//System.out.println("zの値を入力してください");
		//int z = stdIn.nextInt();
		
		System.out.println("x + y  = " + (x + y));
	}
}