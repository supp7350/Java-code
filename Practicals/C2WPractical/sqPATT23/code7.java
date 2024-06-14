import java.io.*;
class code7{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row=Integer.parseInt(br.readLine());
                int num=row;
        //      int ch=64+row;//
                for(int i=1; i<=row ;i++){
                         for(int j=1 ; j<=row ; j++){
				if((i%2==1) && (j%2==1)){
					System.out.print(num*num-1 + " ");
				}
				else{
					System.out.print(num*num + " ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
