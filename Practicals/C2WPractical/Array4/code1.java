import java.io.*;
class Array1 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i = 0;i<arr.length;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     int sum = 0;
     for(int i = 0;i<arr.length;i++) {
       sum = sum + arr[i];
     }
     int avg = sum / (arr.length);
     System.out.println("Array elements average is "+avg);

   }
}
