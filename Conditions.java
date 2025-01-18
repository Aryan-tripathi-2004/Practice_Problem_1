import java.util.*;

class Conditions{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int num = sc.nextInt();

		switch(num){
			case 0:
				System.out.println("Your number is : Zero");
				break;
			case 1:
            System.out.println("Your number is : One");
            break;
			case 2:
            System.out.println("Your number is : Two");
            break;
			case 3:
            System.out.println("Your number is : Three");
            break;
			case 4:
            System.out.println("Your number is : Four");
            break;
			case 5:
            System.out.println("Your number is : Five");
            break;
			case 6:
            System.out.println("Your number is : Six");
            break;
			case 7:
            System.out.println("Your number is : Seven");
            break;
			case 8:
            System.out.println("Your number is : Eight");
            break;
			case 9:
            System.out.println("Your number is : Nine");
            break;
			default:
				System.out.println("The Input Number should be in a range of 0-9");
		}
		
	}
}
	
