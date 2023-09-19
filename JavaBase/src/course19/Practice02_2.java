package course19;
import java.util.Arrays; 
public class Practice02_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		System.out.println(Arrays.toString(logicArray));

		Arrays.sort(logicArray);
		System.out.println(Arrays.toString(logicArray));
	}
}