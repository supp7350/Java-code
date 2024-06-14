import java.io.*;
class Array6 {
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
     int countV = 0;
     int countC = 0;
     for(int i = 0;i<size;i++) {
	if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U') {
	   countV++;
	}else {
	   countC++;
	}
     }
     System.out.println("Count of vowels : "+countV);
     System.out.println("Count of consonenet : "+countC);
   }
}
