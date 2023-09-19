package course11;

public class Sample02 {

	public static void main(String[] args) {
		//whlie文 鉄板構文
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
			i++;
		}
	}
}
