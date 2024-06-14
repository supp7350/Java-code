import java.util.*;
class Demo4{
	public static void main(String [] args){
		String str = "2.3 5.6 23.5";
		StringTokenizer strtoken = new StringTokenizer(str," ");
		
		while(strtoken.hasMoreTokens()){
			float b = Float.parseFloat(strtoken.nextToken());
			System.out.println(b);
		}
	}
}

