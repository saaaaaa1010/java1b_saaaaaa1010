package course24;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		bai(30);
		moji("引数だよー");
		niko(50, 40);
	}

	static void bai(int a) {
		a = a * 2;
		System.out.println(a);
	}

	static void moji(String b) {
		System.out.println(b);
	}

	static void niko(int c, int d) {
		System.out.println(c + d);
	}
}