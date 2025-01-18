import java.util.*;

class RandomNumber{
	public static void main(String args[]){
		int arr[] = new int[5];

		System.out.println("5 RAndom Numbers are : ");

		for(int i=0;i<5;i++){
			arr[i] = (int)(Math.random()*899)+100;
			System.out.print(arr[i]+"  ");
		}
		
		int max = 0;
		for(int i=0;i<5;i++){
			if(arr[i]>max) max = arr[i];
		}

		System.out.println("Maximum Number is : "+ max); 
	}
}
