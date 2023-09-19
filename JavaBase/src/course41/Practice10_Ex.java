package course41;

public class Practice10_Ex {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numExArr = new int[5];
		numExArr[0] = 10;
		numExArr[1] = 50;
		numExArr[2] = 30;
		numExArr[3] = 20;
		numExArr[4] = 40;

		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				numExArr[i] = numExArr[i + 4];
			} else {
				numExArr[i] = numExArr[i - 1];
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(numExArr[i]);
		}
	}
}