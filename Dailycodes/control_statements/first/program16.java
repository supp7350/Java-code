class SwitchDemo{
        public static void main(String[] args){
                float num = 1.5;
                System.out.println("BEFORE SWITCH");
                switch(num){
                        case 1.5:
                                System.out.println("1.5");
                                break;

                        case 2.0:
                                System.out.println("2.0");
                                break;

                        case 2.5:
                                System.out.println("2.5");
                                break;

                        default:
                                System.out.println("Default state");
                        }
                System.out.println("AFTER SWITCH");
        }
}
