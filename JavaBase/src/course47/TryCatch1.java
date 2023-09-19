package course47;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題①
		try {
			int[] array = { 1, 2, 3 };
			for (int i = 0; i <= 72; i++) {
				System.out.println(array[i]);
			}
		} catch (Exception e) {
			System.out.println("以下のエラーを検出しました！ぐぐるべし！");
			System.err.println(e);
			e.printStackTrace();
		}
	}
}