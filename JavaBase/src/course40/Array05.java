package course40;

public class Array05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		int[] numbers = { 11, 20, 31, 40, 51 };

		for (int i = 0; i < 5; i++) {
			if (numbers[i] % 2 == 1) {
				System.out.println(numbers[i]);
			}
		}
	}
}