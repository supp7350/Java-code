import java.util.*;
class Demo4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
			
		int arr[] = new int [size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter number you have to check Occurance : ");
		int num = sc.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				count++;
			}
		}
		if(count ==2){
			System.out.println(num + " occurs 2 times in array ");
		}else if(count >2){
			System.out.println(num + " occurs more than 2 times in an array.");
		}else{
			System.out.println(num + " occurs less than 2 times in an array.");
		}
	}
}

