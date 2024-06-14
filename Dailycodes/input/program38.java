import java.util.*;
class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the name : ");
                String name = sc.next();

                System.out.println("Enter the name of the Society : ");
                String Sname = sc.next();

                System.out.println("Enter the wing : ");
                char wing = sc.next().charAt(0);

                System.out.println("Enter the flat no. : ");
                int flat_no = sc.nextInt();

                System.out.println("Name : " + name);
                System.out.println("SName : " + Sname);
                System.out.println("wing : " + wing);
                System.out.println("flat_no : " + flat_no);
        }
}
