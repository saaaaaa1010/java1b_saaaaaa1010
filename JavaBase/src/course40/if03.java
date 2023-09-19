package course40;

public class if03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score = 86;
		if (score <= 90) {
			System.out.println("Excellent");
		} else {
			if (score >= 80) {
				if (score <= 90) {
					System.out.println("Good");
				} else {
					System.out.println("勉強しましょう。");
				}
			}
		}
	}
}