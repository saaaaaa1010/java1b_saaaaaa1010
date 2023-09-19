package course20;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int x = arr.length;
		System.out.println(x);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "番目の要素は「" + arr[i] + "」");
		}
	}
}