import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException{
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the name : ");
		String name = br.readLine();
                System.out.println("name : "+name);

                System.out.println("Enter the name of Company : ");
		String cmp_name = br.readLine();
		System.out.println("cmp_name : "+cmp_name);
        }
}
