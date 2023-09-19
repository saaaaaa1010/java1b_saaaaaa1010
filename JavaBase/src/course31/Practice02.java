package course31;

public class Practice02 {

	public static void main(String[] args) {
		Books[] arr = new Books[3];

		Books book1 = new Books("ITワールド", 100, "サーティファイ");
		arr[0] = book1;

		Books book2 = new Books("明解Java", 400, "柴田望洋");
		arr[1] = book2;
		//arr[2] = 30;

	}
}