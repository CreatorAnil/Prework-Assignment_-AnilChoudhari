import java.util.Scanner;
public class PatternPrinter {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		patternPrinter(n);
	}
	static void patternPrinter(int n) {
		for(int k=0;k<n;k++) {
			for(int i=n;i>0;i--) {
				for(int j=n;j>k;j--) {
					System.out.print(i);
					}
				}
			System.out.println();
			}
		}
}
