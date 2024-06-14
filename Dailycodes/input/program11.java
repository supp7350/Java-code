import java.util.Scanner;
class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the name of Student : ");
                String name = sc.next();

                System.out.println("Enter the name of collage : ");
                String clgname = sc.next();

                System.out.println("Enter the Id : ");
                int stuId = sc.nextInt();

                System.out.println("Enter CGPA : ");
                int marks = sc.nextFloat();
        }
}

