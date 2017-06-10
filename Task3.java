import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number:");
		int n = sc.nextInt();

		int[] arr = new int[10];

		arr[0] = n;
		arr[1] = n;

		for (int i = 2; i < 10; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		System.out.print("[");
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
		
//		System.out.println(Arrays.toString(arr));
	}
}
