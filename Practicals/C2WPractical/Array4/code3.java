import java.io.*;
class Array3 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i = 0;i<arr.length;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     int max = arr[0];
     for(int i = 1;i<arr.length;i++) {
       if(max<arr[i]) {
          max =  arr[i];
       }
     }
     int max_2;
     if(max == arr[0]) {
        max_2 = arr[1];
     }else {
        max_2 = arr[0];
     }
     for(int i = 0;i<arr.length;i++) {
       if(max_2<arr[i] && arr[i]<max) {
          max_2 =  arr[i];
       }
     }
     System.out.println("Second largest element is : "+max_2);
   }
}
