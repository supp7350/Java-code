import java.util.Scanner;
class c1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		System.out.println(h);
		if(h%2==0)
			System.out.println("EVEN ");
		else
			System.out.println("ODD ");
	}
}
