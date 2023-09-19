package course32;

public class UseClass1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Drink monster = new Drink();
		monster.display();

		monster.price = 300;
		monster.name = "モンスターエナジー";
		monster.display();
		
		int sum = monster.calcSum(monster.price, 24);
		System.out.println("合計は" + sum);
	}
}