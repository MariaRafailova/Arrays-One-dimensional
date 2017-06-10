import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int n = sc.nextInt();		
		
		int[] arr = new int[32];
		
		int i = 0;
		int count = 0;
		
		while (n > 0) {
			arr[i] = n % 2;
			n /= 2;
			i++;
			count++;
		}
		
		int[] result = new int[count];
		
		for (int j = 0; j < result.length; j++) {
			result[j] = arr[count -1-j];
		}		

		for (int j = 0; j < result.length; j++) {
			System.out.print(result[j]);
		}		
	}
}
