class Demo9{
	public static void main(String [] args){
		int marathi = 37;
		int english =36;
		int hindi =35;
		int maths= 37;
		int science =40;
		int totalmarks;

		if(marathi>=35 && english>=35&& hindi>=35&& maths>=35&& science>=35){
			totalmarks = marathi + hindi + english+ maths +science;

			if(totalmarks>=400){
				System.out.println("Grade A");
			}else if(totalmarks>=300) {
				System.out.println("Grade B");
			}else {
				System.out.println("Grade P");
			}
		}else{
			System.out.println("You failed the exam");
		}
	}
}

