package kokuriaru;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Random rnd = new Random();
		int rnd1 = rnd.nextInt(5) + 1;
		int rnd2 = rnd.nextInt(5) + 1;
		int rnd3 = rnd.nextInt(5) + 1;
		int rnd4 = rnd.nextInt(5) + 1;
		int rnd5 = rnd.nextInt(11) + 3;
		int rnd6 = rnd.nextInt(11) + 3;
		int rnd7 = rnd.nextInt(11) + 3;
		int rnd8 = rnd.nextInt(11) + 3;

		Player me = new Player();

		me.setKinryoku(rnd1);
		me.setGakuryoku(rnd2);
		me.setMitame(rnd3);
		me.setOmosiro(rnd4);

		Target koku = new Target();

		koku.setHituyouKin(rnd5);
		koku.setHituyouGaku(rnd6);
		koku.setHituyouMita(rnd7);
		koku.setHituyouOmo(rnd8);

		for (int i = 0; i < 7; i++) {
			int rnd9 = rnd.nextInt(4) + 1;
			System.out.println("筋力：" + me.getKinryoku() + "　　学力：" + me.getGakuryoku() + "\n見た目：" + me.getMitame()
					+ "　面白さ:" + me.getOmosiro());

			System.out.println("トレーニングメニュー");
			System.out.println("1・・・筋トレ");
			System.out.println("2・・・勉強");
			System.out.println("3・・・整形");
			System.out.println("4・・・人と喋る");

			Scanner stdIn = new Scanner(System.in);
			int a = stdIn.nextInt();

			if (a == 1) {
				me.setKinryoku(me.getKinryoku() + 1);
				System.out.println("筋力が1アップしました");
			} else if (a == 2) {
				me.setGakuryoku(me.getGakuryoku() + 1);
				System.out.println("学力が1アップしました");
			} else if (a == 3) {
				me.setMitame(me.getMitame() + 1);
				System.out.println("見た目が1アップしました");
			} else if (a == 4) {
				me.setOmosiro(me.getOmosiro() + 1);
				System.out.println("面白さが1アップしました");
			} else {
				i--;
				continue;
			}

			if (rnd9 == 1) {
				System.out.println("筋力：" + koku.getHituyouKin() + "\n");
			}
			if (rnd9 == 2) {
				System.out.println("学力：" + koku.getHituyouGaku() + "\n");
			}
			if (rnd9 == 3) {
				System.out.println("見た目：" + koku.getHituyouMita() + "\n");
			}
			if (rnd9 == 4) {
				System.out.println("面白さ：" + koku.getHituyouOmo() + "\n");
			}
		}

		System.out.println("どの能力で勝負する？");
		System.out.println("1・・・筋トレ");
		System.out.println("2・・・勉強");
		System.out.println("3・・・整形");
		System.out.println("4・・・人と喋る");

		Scanner stdIn = new Scanner(System.in);
		int b = stdIn.nextInt();
		int winflag = 0;

		if (b == 1) {
			if (rnd1 > rnd5) {
				winflag = winflag + 1;
			} else {
				System.out.println("死亡");
			}
		}
		if (b == 2) {
			if (rnd2 > rnd6) {
				winflag = winflag + 1;
			} else {
				System.out.println("死亡");
			}
		}
		if (b == 3) {
			if (rnd3 > rnd7) {
				winflag = winflag + 1;
			} else {
				System.out.println("死亡");
			}
		}
		if (b == 4) {
			if (rnd4 > rnd8) {
				winflag = winflag + 1;
			} else {
				System.out.println("死亡");
			}
		}

		int rnd10 = rnd.nextInt(4) + 1;
		if (rnd10 == 1) {
			if (me.getKinryoku() >= koku.getHituyouKin()) {
				winflag = winflag + 1;
			}
		}
		if (rnd10 == 2) {
			if (me.getGakuryoku() >= koku.getHituyouGaku()) {
				winflag = winflag + 1;
			}
		}
		if (rnd10 == 3) {
			if (me.getMitame() >= koku.getHituyouMita()) {
				winflag = winflag + 1;
			}
		}
		if (rnd10 == 4) {
			if (me.getOmosiro() >= koku.getHituyouOmo()) {
				winflag = winflag + 1;
			}
		}

		if (winflag > 1) {
			System.out.println("あなたは勝ちました。");
		}
		{
			System.out.println("死亡しました。");
		}

	}
}