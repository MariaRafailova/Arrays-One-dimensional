import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the array size:");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element " + (i + 1));
			arr[i] = sc.nextInt();
		}

		int maxElement = 0;
		int maxCount = 0;
		int count = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;

				if (count > maxCount) {
					maxCount = count;
					maxElement = arr[i];
				}

				// if(count == maxCount){
				//more pairs with equal elements?
				// }
				
			} else {
				count = 1;
			}
		}

		if (maxCount == 0) {
			System.out.println("All elements are different");
		}
		
		if (maxCount > 1) {
			for (int i = 1; i <= maxCount; i++) {
				if (i == maxCount) {
					System.out.print(maxElement);
				} else {
					System.out.print(maxElement + ", ");
				}
			}
		}
	}
}
