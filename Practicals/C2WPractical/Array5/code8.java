import java.io.*;
class Array8 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i =0;i<size;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     int min = arr[0];
     for(int i =0;i<size;i++) {
        if(min>arr[i]) {
	  min = arr[i];
	}
     }
     int min_2;
     if(min == arr[0]) {
       min_2 = arr[1];
     }else {
       min_2 = arr[0];
     }
     for(int i =0;i<size;i++) {
       if(min_2>arr[i] && arr[i]>min) {
          min_2 = arr[i];
       }
     }
     System.out.println("Second min element is : "+min_2);
   }
}
