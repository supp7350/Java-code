import java.util.*;
class Demo9{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of aray : ");
		int size =sc.nextInt();

		int arr[] =new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	
		int count=0;
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int var =0;
			int num1;
			while(num>0){
				num1=num%10;
				var=(var*10)+num1;
				num/=10;
			}
		
			if(var==arr[i]){
				count++;
			}
		}
		System.out.println("Count of palindrome elemnts is : "+count);
	}
}

