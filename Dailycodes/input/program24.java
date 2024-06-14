import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the name of the Company : ");
                String comp_name = br.readLine();

                System.out.println("Enter the name of the employee : ");
                String emp_name = br.readLine();

                System.out.println("The name of the company is " + comp_name);
                System.out.println("The name of the employee is " + emp_name);

                System.out.println("Enter the empId : ");
                int emp_Id = Integer.parseInt(br.readLine());


                System.out.println("The name of the employee_Id is " + emp_Id);

	}
}
