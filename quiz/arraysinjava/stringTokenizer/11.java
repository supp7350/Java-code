 import java.util.*;
class Demo11{
	public static void main(String [] args){
		String str ="c o r e 2 w e b";
		StringTokenizer strtoken = new StringTokenizer(str," ");
		
		while(strtoken.hasMoreTokens()){
			System.out.println(strtoken.nextToken() + ",");
		}
	}
}

