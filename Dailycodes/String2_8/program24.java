class StringDemo{
	public static void main(String[] args){
		String str1 = "Shashi";
		String str2 = "Core2Web";
		String str3 = "Shashi";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
