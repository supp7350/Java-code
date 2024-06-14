import java.util.*;
class Demo10{
	public static void main(String [] args){
		String str = "Core 2 web";
		StringTokenizer strtoken = new StringTokenizer(str," ");
	
		while(strtoken.hasMoreTokens()){	
	//	while(strtoken.hasMoreElements()){
			System.out.print(strtoken.nextElement()+ ",");
	//		System.out.print(strtoken.nextToken()+ ",");
		}
		System.out.println();
	}
}

