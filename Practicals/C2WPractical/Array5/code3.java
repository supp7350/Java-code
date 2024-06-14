import java.io.*;
class Array3 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     int arr[] = new int[size];
     int temparr[] = new int[size];
     System.out.println("Enter elements of array : ");
     for(int i =0;i<size;i++) {
       arr[i] = Integer.parseInt(br.readLine());
       temparr[i] = arr[i];
     }
     for(int i =0;i<size/2;i++) {
        int temp = arr[i];
	arr[i] = arr[size-i-1];
	arr[size-i-1] = temp;
     }
     int flag = 0;
     for(int i =0;i<size;i++) {
        if(arr[i]==temparr[i]) {
	}else {
	  flag = 1;
	  break;
	} 
     }
     if(flag==0) {
       System.out.println("Array is Palindrome");
     }else {
       System.out.println("Array is not Palindrome");
     }
   }
}
