import java.util.Scanner;
class c3{
        public static void main(String[] args){
                System.out.println("ENTER NUMBER");
                Scanner sc=new Scanner(System.in);
                int h=sc.nextInt();
                System.out.println(h);
                if(h%8==0)
                        System.out.println("DIVISIBLE BY 8 ");
                else
                        System.out.println("NOT DIVISIBLE BY 8");
        }
}
