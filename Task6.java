import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter Array 1 size:");
	int[] arr1 = new int[sc.nextInt()];
	System.out.println("Please enter Array 2 size:");
	int[] arr2 = new int[sc.nextInt()];
	
	if(arr1.length == arr2.length){
		for(int i = 0; i< arr1.length; i++){
			System.out.println("Please enter element " + (i+1) + " for array 1");
			arr1[i]=sc.nextInt();
		}
		for(int j= 0; j< arr1.length; j++){
			System.out.println("Please enter element " + (j+1) + " for array 2");
			arr2[j]=sc.nextInt();
		}
		
		boolean equal = true;
		
		for (int k = 0; k < arr2.length; k++) {
			if(arr1[k] != arr2[k]){
				equal = false;
				break;
			}			
		}
		
		System.out.println(equal ? "Equal" : "Not equal");
	}
	else {
		System.out.println("Not equal");
	}
}
}
