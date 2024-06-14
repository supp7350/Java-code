import java.util.*;
class Array7 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter size of array : ");
     int size = sc.nextInt();
     char arr[] = new char[size];
     System.out.println("Enter elements of array : ");
     for(int i = 0;i<arr.length;i++) {
       arr[i] = sc.next().charAt(0);
     }
     for(int i = 0;i<size;i++) {
	int temp = arr[i];
	if(temp>=97&&temp<=122) {
	  arr[i] = (char)(temp-32);
	}
     }
     for(int i = 0;i<arr.length;i++) {
       System.out.print(arr[i]+" ");
     }
   }
}
