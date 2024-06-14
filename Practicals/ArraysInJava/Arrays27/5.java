
import java.io.*;
class Demo4i{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter array size : ");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
 		int flag=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					flag=1;
					System.out.println("First Duplicate case found at index "+i);
					break;
				}
			}
			if(flag==1){
				break;
			}
		}
	}
}

