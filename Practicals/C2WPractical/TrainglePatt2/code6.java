import java.io.*;

class code6{
        public static void main(String[] args) throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                int row= Integer.parseInt(br.readLine());
               // int num=1;
		char ch='A';

                for(int i=1;i<= row;i++){
                       int num=1;
                        for(int j=1;j<=i;j++){
                        if (i%2==1)
				System.out.print(num);
			else
			System.out.print(ch);
			
			num++;
			ch++;
//	System.out.println();
			}
System.out.println();

	}
}
}
