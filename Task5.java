import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i * 3;
		}

		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");

//		System.out.println(Arrays.toString(arr));
	}
}
