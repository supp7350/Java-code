class StringDemo{
	public static void main(String[] args){
		String str1 = "Rohit";
		String str2 = str1;
		String str3 = new String("Virat");
		String str4 = str3;
		String str5 = new String(str1);

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));

	}
}

