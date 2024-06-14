
import java.util.*;
class Demo6{
	public static void main (String [] arsg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size = sc.nextInt();

		
		char arr [] = new char[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.print("Consonants are : ");	
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='A' || arr[i] == 'E' || arr[i]=='O' || arr[i]=='U' || arr[i]=='I' || arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o'|| arr[i]=='u' ){
				continue;
			}else{
				System.out.print(arr[i] +"\t");
			}
		}
		System.out.println();
	}
}

