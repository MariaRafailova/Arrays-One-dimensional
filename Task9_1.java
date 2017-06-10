import java.util.Scanner;

public class Task9_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the array size:");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + (i + 1));
			arr[i] = sc.nextInt();
		}

		int[] arr2 = new int[arr.length];

		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = arr[arr.length - 1 - j];
		}

		System.out.print("[");
		for (int k = 0; k < arr2.length; k++) {
			if (k == arr2.length - 1) {
				System.out.print(arr2[k]);
			} else {
				System.out.print(arr2[k] + ", ");
			}
		}
		System.out.println("]");
	}
}
