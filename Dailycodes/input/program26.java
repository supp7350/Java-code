import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name : ");
		String name = br.readLine();

		System.out.println("Enter the name of the Society : ");
		String Sname = br.readLine();

		System.out.println("Enter the wing : ");
		String wing = br.readLine();

		System.out.println("Enter the flat no. : ");
		String flat_no = br.readLine();

		System.out.println("Name : " + name);
		System.out.println("SName : " + Sname);
		System.out.println("wing : " + wing);
		System.out.println("flat_no : " + flat_no);
	}
}


