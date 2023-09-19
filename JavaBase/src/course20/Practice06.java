package course20;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] arr = { "x","y","x","y","x" };

		int x = 0;
		int y = 0;

		for (String moji : arr) {
			if ("x".equals(moji)) {
				x = x + 1;
			} else {
				y = y + 1;
			}
		}
		System.out.println(x);
	}
}