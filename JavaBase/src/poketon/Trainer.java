package poketon;

import java.util.Random;

public class Trainer {
	Random rand = new Random();
	int x;
	String name;
	Pocketon[] myPockes;

	Trainer() {
		name = "";
		myPockes = new Pocketon[6];

	}

	void capture(Pocketon pocke) {
		int rnd = rand.nextInt(10) + 1;
		if (rnd > pocke.difficult) {
			System.out.println("捕獲成功！");
			Pocketon MyPockes = new Pocketon(pocke.name, pocke.type, pocke.power, pocke.difficult);
			myPockes[x] = MyPockes;
			x = x + 1;
			//x++;
			//x+=1;
			myPockes[x - 1].getted = x;

		} else {
			System.out.println("捕獲失敗");
		}
	}

	void display() {
		for (int y = 0; y < x; y++) {
			System.out.println("ポケトンの名前：" + myPockes[y].name);
		}
	}
}