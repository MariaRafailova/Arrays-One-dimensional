import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете размер на масива:");
	int n = sc.nextInt();
	
	int[] arr = new int[n];	
	
	int min = Integer.MAX_VALUE;
	
	for (int i = 0; i < n; i++) {		
		System.out.println("Моля въведете стойността на елемент " + (i+1));
		arr[i] = sc.nextInt();	
		
		if(arr[i]%3 == 0 && arr[i]<min){
			min = arr[i];
		}
	}	
	
	System.out.println("Най-малкото число кратно на 3 е " + min);
}
}
