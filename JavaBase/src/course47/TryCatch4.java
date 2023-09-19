package course47;

public class TryCatch4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題④
		try {
			int result = divideNumbers(10, 5);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ぐぐるべし！");
			System.err.println(e);
		}
	}

	///////これはmainメソッドの外に書いて////////
	public static int divideNumbers(int a, int b) {
		return a / b;
	}
}