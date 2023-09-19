package course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student stu1 = new Student();
		stu1.name = "大澤聡";
		stu1.no = 5;

		Student stu2 = new Student();
		stu2.name = "大野将邦";
		stu2.no = 7;

		Student stu3 = new Student();
		stu2.name = "おそら";
		stu2.no = 2;

		Student stu4 = new Student();
		stu2.name = "せど";
		stu2.no = 13;

		Student[] myfriend = new Student[4];
		myfriend[0] = stu1;
		myfriend[1] = stu2;
		myfriend[2] = stu3;
		myfriend[3] = stu4;

		for (int i = 0; i < 4; i++) {
			System.out.println(myfriend[i].name);
		}
	}
}