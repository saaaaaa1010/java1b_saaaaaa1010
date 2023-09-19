package course26;

public class Practice01 {
	public static void main(String[] args) {
		int gamecount = 0;
		int wincount = 0;
		int losecount = 0;
		int 勝負数 = 10;
		int 勝利数 = 6;
		int 勝率 = syouritu(勝負数, 勝利数);
		System.out.println(勝率);

		int game = 10;

		int 敗北数 = 6;
		dispResult(game, 勝利数, 敗北数);

		int ransu1 = 10;
		int ransu2 = 10;
		int yosou1 = 1;
		int yosou2 = 1;
		hantei(ransu1, ransu2, yosou1, yosou2);
	}

	//勝率を算出するメソッド
	static int syouritu(int syourisuu, int syoubusuu) {
		int sum = syourisuu * syoubusuu;
		return sum;
	}

	//戦績管理メソッド
	static void dispResult(int game, int syourisuu, int haibokusuu) {
		System.out.println("ゲーム数：" + game + "　勝利数：" + syourisuu + "　敗北数：" + haibokusuu);
	}

	//勝敗判定メソッド
	static String hantei(int ransu1, int ransu2, int yosou1, int yosou2) {
		String winlose = "";
		return winlose;
	}
}