class Demo1{
	public static void main(String [] args){
		int data=100;

		if(data<500){
			switch(data){
				case 100:
					System.out.println("1 Hundered");
				case 200:
					System.out.println("2 Hundered");
				case 300:
					System.out.println("3 Hundered");
				case 400:
					System.out.println("4 Hundered");
			}
		}else{
			if(data>500){
				switch(data){
					case 600:
						System.out.println("6 Hundered");
					case 700:
						System.out.println("7 Hundered");
					case 800:
						System.out.println("8 Hundered");
					case 900:
						System.out.println("9 Hundered");
					case 1000:
						System.out.println("Thousand");
				}
			} else{
				System.out.println("Coder :");
			}
		}
	}
}

