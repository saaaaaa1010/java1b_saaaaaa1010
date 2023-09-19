package course53;

public class BookControll {
	public static void main(String[] args) {

		Book book1 = new Book();

		//Book book2 = new Book("ITワールド");

		String userInputTitle = "あ";
		int userInputPrice = 1000;

		Book book3 = new Book(userInputTitle, userInputPrice);
		//System.out.println(book3.getTitle);
	}
}