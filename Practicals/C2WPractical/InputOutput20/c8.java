import java.util.Scanner;
class c8{
        public static void main(String[] args){
                System.out.println("ENTER NUMBER TO PRINT TABLE ");
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
             
                int add=0;
		while(num>0){
			int rem=num%10;
			num=num/10;
			add=rem+add;
                        System.out.println(add+" ");
                        }
        }
}
