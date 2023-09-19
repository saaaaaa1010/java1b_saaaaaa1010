package course40;

public class Array03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		int[] numbers = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < 5; i++) {
			sum = sum + numbers[i];
			//sum+=numbers[i];
		}
		System.out.println(sum);
	}
}