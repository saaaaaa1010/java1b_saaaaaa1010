package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Character me = new Character();
		System.out.println("プレイヤー１の名前を入力してください");
		me.name=stdIn.next();
		System.out.println("プレイヤー１のパラメーターを入力してね");
		me.hp=stdIn.nextInt();
		me.str=stdIn.nextInt();
		me.dex=stdIn.nextInt();
		me.agi=stdIn.nextInt();
		me.def=stdIn.nextInt();
		me.viewStatus();
		
		Character tonari = new Character();
		System.out.println("プレイヤー２の名前を入力してください");
		tonari.name=stdIn.next();
		System.out.println("プレイヤー２のパラメーターを入力してね");
		tonari.hp=stdIn.nextInt();
		tonari.str=stdIn.nextInt();
		tonari.dex=stdIn.nextInt();
		tonari.agi=stdIn.nextInt();
		tonari.def=stdIn.nextInt();
		tonari.viewStatus();
		me.battle(me,tonari);
	}
}