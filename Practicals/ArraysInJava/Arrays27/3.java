import java.util.*;
class Demo3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		
	
		boolean b = true;
		for(int i=0;i<arr.length/2;i++){
			
			if(arr[i]==arr[size-1-i]){
				b =true;
			}else{
				b=false;
				break;
			}

		}
		
		if(b){					// bydefault b chi value true asel tr check krta  (b==true)
			System.out.println("Given array is palindrome ");
		}else{
			System.out.println("Given array is not palindrome");
		}

		
	}
}

