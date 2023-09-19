package course04;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//③～⑥ ok
		String pr1 = "変数の練習問題";
		int pr2 = 100;
		int pr3 = 100*100;
		String pr4 = "Java";		
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		System.out.println(pr4 + "勉強中");
		
		//⑦ ok
		int pr61 = 100;
		int pr62 = 200;
		int pr63 = pr61 + pr62;		
		System.out.println(pr63);
		
		//⑧ ok
		String pr64 = "変数の勉強中です。";
		String pr65 = "100+100は";
		int pr66 = 100 + 100;			
		System.out.println(pr64 + pr65 +"「"+pr66+"」"+"です");

		//⑧答え
		String moji = "変数の勉強中です。100+100は「";
		int num = 100 + 100;
		String moji2 = "」です。";
		System.out.println(moji + num + moji2);

	}
}