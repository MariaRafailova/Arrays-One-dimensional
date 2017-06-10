import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the array size > 3:");
		double[] arr = new double[sc.nextInt()];

		if (arr.length > 3) {
			
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Please enter element " + (i + 1));
				arr[i] = sc.nextDouble();
			}

			double[] result = new double[3];

			double maxAbs = Double.MIN_VALUE;			
			int ind = 0;
			double abs = 0;
			
			for (int j=0 ; j<3 ; j++) {				
				for (int i = 0; i < arr.length; i++) {					
					abs = Math.abs(arr[i]);
					if (abs > maxAbs) {
						maxAbs = abs;
						ind = i;							
						result[j] = arr[i];	
//						if(there are 2 equal max number?)
					}					
				}					
				arr[ind] = 0;
				maxAbs = Double.MIN_VALUE;
			}

			System.out.println(Arrays.toString(result));
			
		} else {
			System.out.println("The array size is not greater than 3:");
		}
	}
}
