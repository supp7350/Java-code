import java.util.*;
class Demo8{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee count : ");
		int empCount = sc.nextInt();

		int age[] = new int[empCount];
		
		int count=0;
		for(int i=0;i<age.length;i++){
			age[i]=sc.nextInt();
			count++;
		}
	//	System.out.println("Count of employees : "+ count);
	}
}


