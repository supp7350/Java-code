import java.io.*;
class Array5 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i =0;i<size;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     for(int i =0;i<size;i++) {
       int temp = arr[i];
       int count = 0;
       while(temp>0) {
         count++;
	 temp = temp/10;
       }
       System.out.print(count+",");
     }
   }
}
