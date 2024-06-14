import java.util.*;
class Demo9{
        public static void main(String [] args){
                Scanner sc = new Scanner (System.in);
                System.out.println("Enter the number :");
                int num = sc.nextInt();
	
		int sum=0;
		int temp=0;
		int num1=num;
        	while(num!=0){
			temp=num%10;
			sum=sum+temp;
			num/=10;
		}        
		if(num1%sum==0){
			System.out.println(num1+" is HARSHAD number!!");
		}else{
			System.out.println(num1+" is not HARSHAD number !!");
		}
        }
}

