
                import java.io.*;
class code6{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ENTER A NUMBER");
                int upto=Integer.parseInt(br.readLine());
                int num1=0;
		System.out.print(num1+ " ");	
		int num2=1;
		System.out.print(num2+" ");
		while(upto>0){
			int sum=num1+num2;
			System.out.print(sum+ " " );
			num1=num2;
			num2=sum;
			upto--;
		}
	System.out.println();
	}

}
