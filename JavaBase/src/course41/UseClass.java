package course41;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product pro1 = new Product();
		pro1.no = "A001";
		pro1.name = "Item1";
		pro1.price = 200;
		pro1.quantity = 10;

		pro1.display();
		System.out.println();

		Food food1 = new Food();
		food1.name = "パン";
		food1.price = 10000;
		food1.display();
	}
}