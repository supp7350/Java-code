
                import java.io.*;
class code8{
        public static void main(String[] args) throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("ENTER A NUMBER");
                int num=Integer.parseInt(br.readLine());
                int temp=num;
		int count=0;
		while(num>0){
			int rem=num%10;
			num=num/10;
			if(rem==0)
				count++;
		}
				if(count>0)
				System.out.println(temp+" is a Duck Number");
				else
				 System.out.println(temp+" is not a Duck Number");
		}
	}


