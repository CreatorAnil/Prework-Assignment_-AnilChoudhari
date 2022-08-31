import java.util.Scanner;
public class MissingNumberFinder{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr= new int[size-1];
	for(int i=0;i<size-1;i++) {
		arr[i]=in.nextInt();
	}
	System.out.println(missingNumberFinder(arr,size));	
	}
	static int missingNumberFinder(int[] arr,int n) {
		int sumofrange,sumofarray;
		sumofrange= sumofarray = 0;
		for (int i=1;i<=n;i++) {
			sumofrange +=i;
			}
		for (int i:arr) {
			sumofarray += i;
			
		}
		return sumofrange - sumofarray;
		}
	    
		
	}

