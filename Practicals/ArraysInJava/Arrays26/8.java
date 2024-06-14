import java.util.*;
class Demo8{
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
		
		int count=0;
                for(int i=0;i<arr.length;i++){
                        if(ch == arr[i]){
				count++;
			}
		}
		
		System.out.println(ch + " occurs " + count +" times nt given array.");
			

                }

        }


