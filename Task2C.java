import java.util.Scanner;

public class Task2C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a name: ");
			arr[i] = sc.next();
		}

		int[] sal = new int[5];
		
		for (int i = 0; i < sal.length; i++) {
			System.out.print("Enter the salary for " +arr[i] +" :");
			sal[i] = sc.nextInt();
		}
		
		int maxSel = 0;
		int ind = 0;
		for (int i = 0; i < sal.length; i++) {
			if (sal[i]>maxSel) {
				maxSel = sal[i];
				ind = i;
			}
		}
		System.out.println(arr[ind]+ " " +maxSel);
		
		int totalSal = 0;
		for (int i = 0; i < sal.length; i++) {
			totalSal += sal[i];
		}
		System.out.println("All salaries " + totalSal);
		
		int average = totalSal/5;
		System.out.println("average: " +average);
		
	}
}
