import java.io.*;
class code2{
        public static void main(String[] args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int row = Integer.parseInt(br.readLine());
                for (int i=1 ; i<=row ; i++ ){
                int num=row;
			for (int j=1 ; j<=i ; j++){
                                 System.out.print(num-- + " ");
                        }
                         System.out.println();
                }
        }
}
                                                                                                                 
