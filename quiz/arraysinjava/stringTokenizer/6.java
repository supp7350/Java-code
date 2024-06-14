import java.util.*;
class Demo6{
	public static void main(String [] args){
		String str = "Core 2 web";
		StringTokenizer strtoken = new StringTokenizer(str," ");
		
		while(strtoken.hasMoreTokens()){
			System.out.print(strtoken.nextToken() +",");
		}
		System.out.println();
	}
}

