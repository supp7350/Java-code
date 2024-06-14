 import java.util.*;
class Demo1{
	public static void main(String [] args){
		String str = "Core2web";
		StringTokenizer strtoken = new StringTokenizer(str,"");
		
		while(strtoken.hasMoreTokens()){
			System.out.println(strtoken.nextToken() + ",");
		}
	}
}

