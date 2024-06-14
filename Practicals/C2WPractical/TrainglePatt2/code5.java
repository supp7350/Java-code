import java.io.*;

class code5{
        public static void main(String[] args) throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                int row= Integer.parseInt(br.readLine());
		int ch=65+row;
                for(int i=1;i<= row;i++){
                        //int ch=64+row;
                        for(int j=1;j<=i;j++){
			       	System.out.print((char)ch++);
			}
			System.out.println();
		}
	}
}
