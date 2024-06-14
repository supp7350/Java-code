
                import java.io.*;
class code4{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ENTER A NUMBER");
                int num=Integer.parseInt(br.readLine());
                int temp=num;
                int sum=0;
                for(int i=1;i<=num/2;i++){
                        if(num%i==0){
                         sum=sum+i;

                        }
                }
                if(sum<temp){
                        System.out.println(temp+" IS ABUNDANT NUMBER");
                }
                else
                        System.out.println(temp+ " IS A DEFICIENT NUMBER");
        }
}
