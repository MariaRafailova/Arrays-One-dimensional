import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Моля въведете размер на масива:");
	
	int[] arr = new int[sc.nextInt()];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Въведете елемент " + (i+1));
		arr[i] = sc.nextInt();
	}
	
	if(arr.length == 1){
		System.out.println("Масивът е огледален");
	}
	else if(arr.length%2 == 0){
		
		boolean mirror = true;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == arr[arr.length -1 -i]){
				continue;
			}
			else{
				mirror = false;
				break;
			}
		}
		
		System.out.println(mirror ? "Масивът е огледален" : "Масивът не е огледален");
	}
	else{
		System.out.println("Масивът не е огледален");
	}
}
}
