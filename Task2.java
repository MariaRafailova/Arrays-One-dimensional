import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете размер на масива:");
	
	int[] arr = new int[sc.nextInt()];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Въведете елемент " + (i+1));
		arr[i]= sc.nextInt();
	}
	
	int[] newArr = new int[arr.length*2];
	
	for (int i = 0; i < newArr.length/2; i++) {
		newArr[i] = arr[i];
	}
	
	for (int j = 0; j < newArr.length/2; j++) {
		newArr[(newArr.length-j) - 1] = newArr[j];
	}	
	
	System.out.print("[");
	for(int i = 0; i < newArr.length; i++){		
		if(i == newArr.length-1){
			System.out.print(newArr[i]);
		}
		else{
			System.out.print(newArr[i] + ", ");
		}
	}
	System.out.print("]");
}
}
