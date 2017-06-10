import java.util.Arrays;
import java.util.Scanner;

public class Task9_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the array size:");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + (i + 1));
			arr[i] = sc.nextInt();
		}

		int temp = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		System.out.print("[");
		for (int k = 0; k < arr.length; k++) {
			if (k == arr.length - 1) {
				System.out.print(arr[k]);
			} else {
				System.out.print(arr[k] + ", ");
			}
		}
		System.out.println("]");

		// System.out.println(Arrays.toString(arr));
	}
}
