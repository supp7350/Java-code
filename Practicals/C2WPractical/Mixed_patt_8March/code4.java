import java.io.*;
class  code4{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                 System.out.println("ENTER ROWS");
                int temp=row;
                for(int i=1;i<=row;i++){
                        for (int j=1;j<=i;j++){
        			 if(j==1)
				 System.out.print(temp + " ");
        			else
				System.out.println((temp+temp)+ " ");

        }
	temp--;
		 System.out.println();
}
}
}
