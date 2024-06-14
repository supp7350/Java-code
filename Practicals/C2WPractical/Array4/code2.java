import java.io.*;
class Array2 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i = 0;i<arr.length;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     int min = arr[0];
     int max = arr[0];
     for(int i = 1;i<arr.length;i++) {
       if(max<arr[i]) {
          max =  arr[i];
       }
       if(min>arr[i]) {
         min = arr[i];
       }
     }
     int diff = max - min;
     System.out.println("Difference between max and min is "+diff);
   }
}
