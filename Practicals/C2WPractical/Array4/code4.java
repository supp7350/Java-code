import java.io.*;
class Array4 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i = 0;i<arr.length;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     System.out.print("Enter no. to check : ");
     int num = Integer.parseInt(br.readLine());
     int count = 0;
     for(int i = 0;i<arr.length;i++) {
	if(arr[i] == num) {
	  count++;
	}
     }
     if(count>2) {
       System.out.println(num+" occures more than 2 times");
     }else if(count == 2) {
       System.out.println(num+" occures 2 times");
     }

   }
}
