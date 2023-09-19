package course30;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Drink tea = new Drink(100, "初期データ");
		tea.display();
		
		tea.price = 150;
		tea.name = "午後の紅茶";
		tea.display();

		int sum = tea.calcSum(tea.price, 17);
		System.out.println("合計は" + sum);
	}
}