package course24;

public class Practice04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int tensu = 100;

		//引数を複数渡すときはカンマ(,)区切りで渡す。
		calledMethod(tensu);
	}

	static void calledMethod(int tensu) {
		//受け取った値を画面に表示
		System.out.println("引数で受け取った値は" + tensu + "です。");
	}
}
