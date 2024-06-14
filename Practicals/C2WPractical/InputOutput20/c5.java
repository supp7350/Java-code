import java.util.Scanner;
class c5{
        public static void main(String[] args){
                System.out.println("ENTER NUMBER");
                Scanner sc=new Scanner(System.in);
                int h=sc.nextInt();
                System.out.println(h);
                if(h%16==0)
                        System.out.println("DIVISIBLE BY 16 ");
                else
                        System.out.println("NOT DIVISIBLE BY 16");
        }
} 
