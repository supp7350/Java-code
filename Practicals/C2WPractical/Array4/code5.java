import java.io.*;
class Array5 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i = 0;i<arr.length;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     for(int i = 0;i<size/2;i++) {
	int temp = arr[i];
	arr[i] = arr[size-1-i];
	arr[size-1-i] = temp;
     }
     System.out.println("Reversed array is : ");
     for(int i = 0;i<arr.length;i++) {
       System.out.println(arr[i]);
     }

   }
}
