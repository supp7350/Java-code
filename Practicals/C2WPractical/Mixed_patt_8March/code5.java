import java.io.*;
class  code5{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                 System.out.println("ENTER ROWS");
                int temp=1;

                for(int i=1;i<=row;i++){
                     int h=i;
			for (int j=1;j<=i;j++){
                		if(j==1){
				System.out.print(temp + " ");
			}
		
			else{
			 	 h=i+h;
			        System.out.print(h + " ");
       				 }
			}
	 System.out.println();
	 temp++;

		}
	}
}

