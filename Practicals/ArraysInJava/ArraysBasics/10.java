import java.util.*;
class Demo10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students for exam : ");
		int size = sc.nextInt();
		
		int arr [] = new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(i + " : "+arr[i]); 
		}
	}
}


