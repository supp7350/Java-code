import java.util.*;
class Demo2{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the array size : ");
                int size=sc.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                int sum1=0,sum2=0;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]%2==0){
                                sum1+=arr[i];
                        }
                        else{
                                sum2+=arr[i];
                        }
                }
                System.out.println("Odd sum : "+sum2);
                System.out.println("Even sum : "+sum1);
        }
}

