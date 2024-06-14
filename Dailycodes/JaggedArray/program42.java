import java.io.*;
class Onedarray{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int arrsize = Integer.parseInt(br.readLine());
		int arr[] = new int[arrsize];
		System.out.println("Enter array elements : ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}

