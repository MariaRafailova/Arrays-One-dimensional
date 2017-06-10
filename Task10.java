import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];
		int sum = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println("Въведете елемент " + (i + 1));
			arr[i] = sc.nextInt();
			sum += arr[i];
		}

		int average = sum / 7;

		int difference = 0;
		int closest = 0;
		int minDifference = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				difference = Math.abs(arr[i] - average);

				if (difference < minDifference) {
					minDifference = difference;
					closest = arr[i];
				}
			}
		}

		System.out.printf("средна стойност %d, най-близка стойност %d", average, closest);
	}
}
