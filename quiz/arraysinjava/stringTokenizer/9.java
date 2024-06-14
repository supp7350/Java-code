import java.util.*;
class Demo9{
	public static void main(String [] args){
		String str = "2356245823569226589235";
		StringTokenizer strtoken = new StringTokenizer(str,"2");
		
		while(strtoken.hasMoreElements()){
			System.out.println(strtoken.nextElement());
		}
	}
}

