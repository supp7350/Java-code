import java.io.*;
class  code2{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                
                 System.out.println("ENTER ROWS");
		int row=Integer.parseInt(br.readLine());
               int temp=row;
	       	// System.out.println("ENTER ROWS");
                int num=64+row;
                for(int i=1;i<=row;i++){
                        for (int j=1;j<=row;j++){
		System.out.print((char)num);
        System.out.print(temp-- + " ");

        }
	 temp=temp+row+1;
        System.out.println();
}
}
}
