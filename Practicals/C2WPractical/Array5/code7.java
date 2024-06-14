import java.io.*;
class Array7 {
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
       int j = 1;
       int count = 0;
       while(j<=arr[i]){ 
          if(arr[i]%j==0){
             count++;
	  }
	  j++;
       }
       if(count > 2) {
         System.out.println(arr[i]+",");
       }
     }
   }
}
