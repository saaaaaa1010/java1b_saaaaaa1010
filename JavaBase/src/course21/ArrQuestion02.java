package course21;

public class ArrQuestion02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int typhoon[] = new int[12];
		typhoon[0] = 1;
		typhoon[1] = 1;
		typhoon[2] = 0;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 1;
		typhoon[6] = 4;
		typhoon[7] = 5;
		typhoon[8] = 6;
		typhoon[9] = 4;
		typhoon[10] = 6;
		typhoon[11] = 1;

		for (int i = 0; i < typhoon.length; i++) {
			System.out.println((i + 1) + "月の台風は" + typhoon[i] + "件です。");
		}
	}
}