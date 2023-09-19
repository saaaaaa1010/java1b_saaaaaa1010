package course58_59;

public class Practice03 {
	public static void main(String[] args) {
		JavaMaker jm = new JavaMaker();
		for (int i = 0; i < 10; i++) {
			String startCode = "public class HelloWorld { public static void main(String[] args){"
					+ " System.out.println(\"Hello\");"
					+ ""
					+ "}}";
			jm.javaCodeStart(startCode);
		}
	}
}