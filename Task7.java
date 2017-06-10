import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter array 1 size:");
		int[] arr1 = new int[sc.nextInt()];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Please enter element " + (i + 1));
			arr1[i] = sc.nextInt();
		}

		int[] arr2 = new int[arr1.length];

		arr2[0] = arr1[0];
		arr2[arr2.length - 1] = arr1[arr2.length - 1];

		for (int i = 1; i <= arr2.length - 2; i++) {
			arr2[i] = arr1[i - 1] + arr1[i + 1];
		}

		System.out.print("[");
		for (int i = 0; i < arr2.length; i++) {
			if (i == arr2.length - 1) {
				System.out.print(arr2[i]);
			} else {
				System.out.print(arr2[i] + ", ");
			}
		}
		System.out.print("]");
	}
}
