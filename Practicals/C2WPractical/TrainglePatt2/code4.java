import java.io.*;

class code4{
        public static void main(String[] args) throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                int row= Integer.parseInt(br.readLine());
                for(int i=1;i<= row;i++){
			int ch=64+row;
			for(int j=1;j<=i;j++)
				if(j %2==1){
					System.out.print((char)ch+32);
					ch--;
					}
				else{
					 System.out.print(ch--);
		}
		 System.out.println();
		}
	}
}
