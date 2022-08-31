import java.util.Scanner;
public class FirstLetterPrinter{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String intput = in.nextLine();
		System.out.println(firstLetterPrinter(intput));	
	}
	static String firstLetterPrinter(String str) {
		String[] strarr = str.split(" ");
		String output = "";
		for(String i:strarr) {
			output +=i.charAt(0);
		}
		return output;
	}
	
}
