import java.io.*;
class Array9 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter number : ");
     int num = Integer.parseInt(br.readLine());
     int rev = 0;
     int rem_1 = 0;
     int temp = num;
     int count = 0;
     while(temp>0) {
       rem_1 = temp % 10;
       rev = rev*10 + rem_1;
       count++;
       temp /= 10;
     }
     System.out.println(rev);
     int arr[] =  new int[count];
     int i =0;
     int rem_2 = 0;
     while(rev>0) {
       rem_2 = rev % 10;
       arr[i] = rem_2 + 1;
       i++;
       rev /= 10;
     }
     for(int j = 0;j<arr.length;j++) {
       System.out.print(arr[j]+",");
     }
    
   }
}
