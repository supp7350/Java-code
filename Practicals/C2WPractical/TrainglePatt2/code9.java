import java.io.*;

class code9{
        public static void main(String[] args) throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                int row= Integer.parseInt(br.readLine());
               // int num=1;
                char ch='A';
            //    int num=1;

                for(int i=1;i<= row;i++){
                      int num=1+row;
                        for(int j=1;j<=i;j++){
				if(j%2 ==1){
				System.out.print(num);
					}
				else{
				System.out.print(ch++);
				}
				num++;
				}
			
				System.out.println();
				}
			
		
		// System.out.println();
		}
	}

