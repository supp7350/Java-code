import java.util.Scanner;
class c6{
        public static void main(String[] args){
                System.out.println("ENTER AGE");
                Scanner sc=new Scanner(System.in);
                int h=sc.nextInt();
                System.out.println(h);
                if(h>=18)
                        System.out.println("YOU CAN VOTE ");
                else
                        System.out.println("CAN'T VOTE");
        }
}
