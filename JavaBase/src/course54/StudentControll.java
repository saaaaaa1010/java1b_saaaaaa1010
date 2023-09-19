package course54;

public class StudentControll {
	public static void main(String[] args) {
		Student tonari = new Student(19, "なわ");

		Student me = new Student(5, "大澤聡");

		Student[] mymen = new Student[2];
		mymen[0] = tonari;
		mymen[1] = me;

		mymen[1].setName("親分");
		System.out.println(mymen[1].getName());
	}
}