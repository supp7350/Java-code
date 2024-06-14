import java.io.*;
class code6{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine());   //789
                int fact =1;
                 //System.out.println("FACTORS ARE :");
                while(num >1){
                        fact=fact*num;
                        num--;

        }
        System.out.println("FACTORIAL IS: " +fact);

        }
}
