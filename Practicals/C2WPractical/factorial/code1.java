import java.io.*;
class code1{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int temp=num;
		int count=0;
		while(temp>0){
		if (num%temp==0){
			count++;
		System.out.println(temp);
		}
		temp--;
		 

		}
		 System.out.println("COUNT : " +count);
	}
}
		
