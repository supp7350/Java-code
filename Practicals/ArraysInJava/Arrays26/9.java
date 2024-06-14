import java.util.*;
class Demo9{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the size of an array : ");
                int size=sc.nextInt();
                
		char arr[]=new char[size];
                
		System.out.println("Enter array elements : ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.next().charAt(0);
                }	
		
	
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>='a' && arr[i]<='z'){
				System.out.println(arr[i]);
			}else{
				System.out.println("#");
			}
		}
		
		
                }

        }


