package course47;

public class TryCatch2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題②
		try {
			int number = 05;
			if (10 / number == 2) {
				System.out.println("numberは5です。");
			}
		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ぐぐるべし！");
			System.err.println(e);
		}
	}
}