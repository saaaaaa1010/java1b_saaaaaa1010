package course20;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arr = { 10, 20, 30, 40, 50 };

		int sum = 0;
		int i = 0;
		int zero = 0;
		for (int num : arr) {
			if (i== 0 || i == 4)
				zero = zero +arr[i];
		}
		System.out.println(sum);
	}
}