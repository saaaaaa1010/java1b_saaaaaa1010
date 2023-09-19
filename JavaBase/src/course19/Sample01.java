package course19;

public class Sample01 {
	
	public static void main(String[] args) {
		String a = "つっちー";
		String b = "うすい";
		String c = "かじま";
		String d = "おおさわ";
		String e = "すぎもと";
		String f = "ふじくら";
		String g = "おおせき";
		String h = "ながなわ";

		//配列の鉄板構文
		//[]の事を要素と呼ぶ。要素は0から始まる。
		String[] nameList = new String[10];
		nameList[0] = "つっちー";
		nameList[1] = "うすい";
		nameList[2] = "かじま";
		nameList[3] = "おおさわ";
		nameList[4] = "すぎもと";
		nameList[5] = "ふじくら";
		nameList[6] = "おおせき";
		nameList[7] = "ながなわ";

		for (int i = 0; i < 8; i++) {
			System.out.println("俺の友達の名前は" + nameList[i] + "だ。");
		}
	}
}