class SwitchDemo{
        public static void main(String[] args){
                int num = 2;
                System.out.println("BEFORE SWITCH");
                switch(num){
                        case 1:
                                System.out.println("One");
                        case 2:
                                System.out.println("Two");
                        case 3:
                                System.out.println("Three");
                        default:
                                System.out.println("Default state");
                        }
                System.out.println("AFTER SWITCH");
        }
}