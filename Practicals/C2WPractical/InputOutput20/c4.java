import java.util.Scanner;
class c4{
        public static void main(String[] args){
                System.out.println("ENTER NUMBER TO PRINT TABLE ");
                Scanner sc=new Scanner(System.in);
                int h=sc.nextInt();
                System.out.println(h);
                int mul=1;
		for(int i=1;i<11;i++){
			mul=i*h;
                        System.out.println(mul+" ");
        		}
        }
}
