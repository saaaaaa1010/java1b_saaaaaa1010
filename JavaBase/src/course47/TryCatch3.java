package course47;

public class TryCatch3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題③
		try {
			int number2 = 50;
			if (100 / number2 == 20) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ぐぐるべし！");
			System.err.println(e);
		}
	}
}