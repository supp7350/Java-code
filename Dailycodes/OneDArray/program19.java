import java.util.*;
class Onedarray{
        public static void main(String[] args){
                int [] empId = new int[3]{110,120,130};

                System.out.println(empId[0]);
                System.out.println(empId[1]);
                System.out.println(empId[2]);

                empId[0] = 10;
                empId[1] = 20;
                empId[2] = 30;

                System.out.println(empId[0]);
                System.out.println(empId[1]);
                System.out.println(empId[2]);
        }
}
