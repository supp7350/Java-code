import java.io.*;
class code4
{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine());
                int temp=num;
                int count=0;
		 System.out.println("FACTORS ARE :");
                while(temp>0){
               if (num%temp==0){
                     count++;
                System.out.print(temp + "  ");
                }
                temp--;


                }
                System.out.println();
		if (count==2)
                 System.out.println( num + " IS A COMPOSIE NUMBER");
                else
                   System.out.println(num +" IS NOT A COMPOSITE NUMBER");
        }
}
