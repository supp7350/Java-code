import java.util.*;
class Demo3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :: ");
		int size = sc.nextInt();

		char arr[]=new char[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='A'|| arr[i]=='E'|| arr[i]=='O'|| arr[i]=='I'|| arr[i]=='U'|| arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
				System.out.println("vowel" + arr[i]+ "found at index " + i);
			}
	}
	}
}

