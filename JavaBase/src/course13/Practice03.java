package course13;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i < 10; i++) {
			//偶数なら変数「y」に0が入る
			int y = i % 2;
			if(y == 0) {
				System.out.println("偶数です。");
			}
			System.out.println(i);
		}
	}
}
