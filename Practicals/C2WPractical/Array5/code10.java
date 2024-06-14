import java.io.*;
class Array10 {
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
       int fact = 1;
       int j = 1;
       while(j<=arr[i]) {
	 fact = fact*j;
	 j++;
       }
       System.out.print(fact+",");
     }
   }
}
