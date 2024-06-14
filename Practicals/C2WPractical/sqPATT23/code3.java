import java.io.*;
class code3{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
                int ch=96+row;//
                for(int i=1; i<=row ;i++){
                        //  int ch=64+row;
                        for(int j=1 ; j<=row ; j++){
				if(i%2==1){
					if(j %2==1)
					System.out.print((char)ch + " ");
				else
					System.out.print(num + " ");
			}
			else{
				if(j%2==1)
					System.out.print(num+ " ");
				else
					System.out.print((char)ch + " ");
			}
			num++;
			ch++;
			}

			System.out.println();
		}
	}
}
