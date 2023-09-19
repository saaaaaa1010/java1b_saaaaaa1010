package course28;

public class Sample01 {

	public static void main(String[] args) {
		//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";
		
		hu1.hp= 50;
		hu1.neru();
		
		System.out.println(hu1.name);
		
		//Chrクラスのインタンス「numata」を生成。
		//attack def spd love mp hpに好きなパラメータを設定してみよう。
		Chr numata = new Chr();
		numata.attack = 350;
		numata.def = 50;
		numata.spd = 20;
		numata.love = 0;
		numata.mp = 30;
		numata.hp = 50;
		
		Chr kajima = new Chr();
		kajima.attack = 200;
		kajima.def = 100;
		kajima.spd = 500;
		kajima.love = 50;
		kajima.mp = 50;
		kajima.hp = 100;
		
		kajima.naguru(kajima.attack, numata.def);
	}
}