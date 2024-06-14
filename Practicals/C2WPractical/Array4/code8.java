import java.io.*;
class Array8 {
   public static void main(String[] args)throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Enter size of array : ");
     int size = Integer.parseInt(br.readLine());
     char arr[] = new char[size];
     System.out.println("Enter elements of array : ");
     for(int i = 0;i<arr.length;i++) {
       arr[i] = (char)br.read();
       br.skip(1);
     }
     System.out.print("Enter element to check : ");
     char key = (char)br.read();
     br.skip(1);
     int count = 0;
     for(int i = 0;i<size;i++) {
	if(arr[i]==key){
	  count++;
	}
     }
     System.out.println(key+" occures "+count+" times");
   }
}
