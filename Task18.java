import java.util.Arrays;

public class Task18 {
	public static void main(String[] args) {

		int[] arr1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };

		int[] newArr = new int[arr2.length];

		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] >= arr2[i]) {
				newArr[i] = arr1[i];
			} else {
				newArr[i] = arr2[i];
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(newArr));
	}
}
