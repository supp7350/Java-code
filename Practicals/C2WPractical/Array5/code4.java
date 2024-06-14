import java.io.*;
class Array4 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i =0;i<size;i++) {
       arr[i] = Integer.parseInt(br.readLine());
     }
     int index=0;
     int flag = 0;
     for(int i =0;i<size;i++) {
       int j = i+1;
       while(j<size) {
         if(arr[i]==arr[j]) {
	   flag = 1;
	   index = i;
	   break;
	 }
	 j++;
       }
       if(flag==1) {
         break;
       }
     }
     if(flag==0) {
       System.out.println("There is no duplicate element");
     }else {
       System.out.println("First duplicate element present at index "+index);
     }
   }
}
