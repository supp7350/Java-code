class Demo{

	int x =70;
	String str1 = "Kanha";
	static String str2 = "Kanha";
	String str3 = new String("Kanha")
	static String str4 = new String("Kanha");

	public static void main(String[] args){
		Demo obj = new Demo();

		System.out.println(obj.x);
		System.out.println(obj.str1);
		System.out.println(obj.str2);
		System.out.println(obj.str3);
		System.out.println(obj.str4);
	}
}

