import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the array size:");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Please enter element " + (i + 1));
			arr[i] = sc.nextInt();
		}
		
//		int[] arr = {1, 3, 2, 4, 3, 7};
		
		boolean zigzag = true;
		
		if(arr[0] >= arr[1]){
			zigzag = false;
		}
				
		for (int i = 1; i < arr.length; i++) {
			if(i%2 != 0){
				if(i == arr.length -1){
					if(arr[i] <= arr[i-1]){
						zigzag = false;
						break;
					}
				}
				else {
					if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
						continue;
					}
					else {
						zigzag = false;
						break;
					}
				}
			}
			
			if(i%2 == 0){
				if(i == arr.length -1){
					if(arr[i] >= arr[i-1]){
						zigzag = false;
						break;
					}
				}
				else {
					if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
						continue;
					}
					else {
						zigzag = false;
						break;
					}
				}
			}			
		}
		
		System.out.println(zigzag ? "изпълнява изискванията за зигзагообразна нагоре редица" : 
			"не изпълнява изискванията за зигзагообразна нагоре редица");

	}
}
