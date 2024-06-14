class DiffDemo{
        public static void main(String[] args){
                String str1 = "Rahul";
                String str2 = "Rahul";

                System.out.println(str1.equals(str2));
                System.out.println(str1 == str2);

		String str3 = "Ashish";
		String str4 = new String("Ashish");

		System.out.println(str3.equals(str4));
		System.out.println(str3 == str4);
	}
}
