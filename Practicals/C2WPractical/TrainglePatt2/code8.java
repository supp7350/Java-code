import java.io.*;

class code8{
        public static void main(String[] args) throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                int row= Integer.parseInt(br.readLine());
               
                char ch='b';
                int num=1;

                for(int i=1;i<= row;i++){
               
                        for(int j=1;j<=i;j++){
				if(j%2 ==1)
				System.out.print(j);
			else{
				System.out.print(ch++);
			}
	//		ch++;
			}
		ch++;
			System.out.println();
			}
	}
}
				
