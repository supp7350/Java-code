	import java.io.*;
class code1{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		//int temp=num;
		System.out.println("ENTER A NUMBER");
		int num=Integer.parseInt(br.readLine());
		int temp=num;
		 int[] arr=new int[temp];
		for(int i =1;i<num;i++){
			
			//if(num%i==0){
				for(int j=0;j<i;j++){
				 if(num%i==0){
					arr[j]=i;
				}
			}
		}
		for(int k=0;k<num;k++){
			sum=sum+arr[k];
		}
		if(sum==temp){
			 System.out.println(temp+"IS A PERFECT NUMBER");
		}
		else
			 System.out.println(temp+"IS NOT  A PERFECT NUMBER");
	}
}

