import java.io.*;
class code2
{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine());
                int temp=num;
                int count=0;
                while(temp>0){  
	       if (num%temp==0){
                     count++;
                System.out.println("FACTORS ARE :"  + temp + "  ");
                }
                temp--;


                }
		if (count==2)
                 System.out.println( num + "IS A PRIME NUMBER");
		else
	           System.out.println(num +"IS A COMPOSITE NUMBER");
        }
}
       
