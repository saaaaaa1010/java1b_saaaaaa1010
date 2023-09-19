package course18;

public class Sample02 {

	public static void main(String[] args) {
		//YesかNoを扱うboolean型もある。
		//YesをTrue、NoをFalseと言い表す。
		boolean x = true;
		boolean y = false;

		//if文はカッコの中がTrueかどうかを判定する。
		if (x) {
			System.out.println("trueだよ");
		} else {
			System.out.println("falseだよ");
		}

		//今までやってきた比較も最終的にはTrueかFalseでしかない。
		int i = 30;
		boolean z = i > 15;
		if (z) {
			System.out.println("iは15よりも大きいです");
		} else {
			System.out.println("iは15以下です。");
		}
	}
}