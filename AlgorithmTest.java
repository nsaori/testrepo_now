import java.awt.font.NumericShaper.Range;
import java.util.Scanner;

public class AlgorithmTest {

	public static void main(String[] args) {
		//XCubic();
		//Rectangle();
		//Watch();
		//SmallLargeEqual();
		//Range();
		SortingThreeNumbers();
	}
	
	public static void SortingThreeNumbers() {
		Scanner scanner = new Scanner(System.in);
		int[] inputNum = new int[3];
		for(int i = 0; i < inputNum.length; ++i){
			inputNum[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < inputNum.length; ++i){
			int tempNum = i;
			for(int j = i+1; j < inputNum.length; ++j){
				if (inputNum[i] > inputNum[j]) {
					tempNum = j;
				}
			}
			int temp = inputNum[i];
			inputNum[i] = inputNum[tempNum];
			inputNum[tempNum] = temp;
		}
		
		for(int i = 0; i < inputNum.length; ++i){
			System.out.print(inputNum[i] + " ");
		}
	}
	
	public static void Range() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a < b) && (b < c)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	public static void SmallLargeEqual() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a > b) {
			System.out.println(a + " > " + b);
		}else if (a == b) {
			System.out.println(a + " = " + b);
		}else {
			System.out.println(a + " < " + b);
		}
	}
	
	public static void Watch() {
		Scanner scanner = new Scanner(System.in);
		int S = scanner.nextInt();
		
		if((0 > S) || (S > 86400)){
			return;
		}
		
		int hour = S / 3600;
		int min = (S % 3600) / 60;
		int sec = (S % 3600) % 60;
		System.out.println(hour + " : " + min + " : " + sec);
	}
	
	public static void XCubic() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(Math.pow(x, 3));
	}
	
	public static void Rectangle() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a*b + " " + (a*2 + b*2));
	}
}
