import java.io.*;
class Array2 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i =0;i<size;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     int sumOdd = 0;
     int sumEven = 0;
     for(int i =0;i<size;i++) {
       if(arr[i]%2==0) {
         sumEven = sumEven + arr[i];
       }else {
         sumOdd = sumOdd + arr[i];
       }
     }
       System.out.println("Odd Sum : "+sumOdd);
       System.out.println("Even Sum : "+sumEven);
     
   }
}
