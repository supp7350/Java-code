class SwitchDemo{
        public static void main(String[] args){
                int num = 2;
                System.out.println("BEFORE SWITCH");
                switch(num){
                        case 1:
                                System.out.println("One");
				break;

                        case 2:
                                System.out.println("Two");
				break;

                        case 3:
                                System.out.println("Three");
				break;

                        default:
                                System.out.println("Default state");
                        }
                System.out.println("AFTER SWITCH");
        }
}
