import java.util.*;
class SingleLine{
        public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter player info : ");
        String info = sc.nextLine();

        StringTokenizer st = new StringTokenizer(info,",");

	while(st.hasMoreTokens()){	
     
	System.out.println(st.nextToken());

        }
}
}
