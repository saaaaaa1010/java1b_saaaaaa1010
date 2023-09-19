package course32;

public class Drink {
	int price;
	String name;

	void display() {
		System.out.println(price);
		System.out.println(name);
	}
	
	int calcSum(int price,int suryo) {
		int sum = price+suryo;
		return sum;
	}
}