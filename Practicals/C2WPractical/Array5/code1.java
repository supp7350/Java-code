import java.io.*;
class Array1 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i =0;i<size;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     int flag = 0;
     for(int i =0;i<size-1;i++) {
       if(arr[i]<=arr[i+1]) {
       }else {
         flag = 1;
	 break;
       }
     }
     if(flag==0) {
       System.out.println("Array is in ascending order");
     }else {
       System.out.println("Array is not in ascending order");
     }
   }
}
