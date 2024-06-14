import java.io.*;
class code7{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine());   //789
                int vara=0;
               int rem=0;
                int temp=num;
                while (num>0){
                rem=num%10;
                vara=vara*10 +rem;
                num/=10;
               }
                System.out.println(vara);
	}
}

