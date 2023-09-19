package course41;

public class Food {
	String name;
	int price;

	public	Food(String n, int p) {
		name = n;
		price = p;
	}

	public Food() {
		// TODO 自動生成されたコンストラクター・スタブ
		name = "初期";
		price = 0;
	}

	void display() {
		System.out.println(name);
		System.out.println(price);
	}
}