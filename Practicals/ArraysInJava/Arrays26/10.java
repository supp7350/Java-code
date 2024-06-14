import java.util.*;
class Demo10{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the size of an array : ");
                int size=sc.nextInt();
                
		char arr[]=new char[size];
                
		System.out.println("Enter array elements : ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.next().charAt(0);
                }	
		
		System.out.print("Enter character to check : ");
		char ch =sc.next().charAt(0);
		
		
                for(int i=0;i<arr.length;i++){
                        if(ch == arr[i]){
				break;
			}else{
				System.out.println(arr[i]);
			}
		}
		
                }

        }


