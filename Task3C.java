import java.util.Scanner;

public class Task3C {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter days:");
	int n = sc.nextInt();
	
	int[] arr = new int[n];
	
	int sum = 0;	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the temperature:");
		arr[i] = sc.nextInt();
		sum += arr[i];
	}
	
	int ave = sum/n;
	System.out.println("average: " + ave);
	
	int[] coolDays = new int[n];
	
	int count1 = 0;
	int countMax1 = 0;
	for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]<ave){
			count1++;
			if(count1 > countMax1){
				countMax1 = count1;
			}
		}
	}
	System.out.print("Coolest period: "+ countMax1 + " days");	
	System.out.println();
	
	int count = 0;
	int countMax = 0;
	for (int i = 0; i < arr.length-1; i++) {
		if(arr[i]>arr[i+1]){
			count++;
			if(count > countMax){
				countMax = count;
			}
		}
	}
	System.out.println("Longest Cool period: " + countMax + " days");
}
}
