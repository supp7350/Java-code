import java.util.*;
class Demo2{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of aray : ");
		int size =sc.nextInt();

		int arr[] =new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	
		int count1=0;
		int sum =0;
		for(int i=0;i<arr.length-1;i++){
			int count=0;
			int temp=1;
			while(temp<=arr[i]){
				if(arr[i]%temp==0){
					count++;
				}
				temp++;
			}
		
		
			if(count == 2){
				sum=sum+arr[i];	
				count1++;
			}
		
		}
		
		System.out.println("Sum of all prime number is "+sum+" and count of all prime numbers in given array is "+count1);
	}
}

