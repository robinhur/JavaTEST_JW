package Test_170218;

import java.util.Scanner;

/**
 * Created by huza on 2017. 2. 18..
 */
public class IF_TEST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int b;
        boolean c;

        for (int i = 0; i <= 3; i++) {

            a = sc.next();
            b = sc.nextInt();
            //c = a.contentEquals("M");

            /*if (a.equals("M")) {

            } else if (a.equals("F")){

            }

            if (a=="M") {

            } else if (a=="F"){

            }*/


            if (a.equals("M"))
            {
                if (b >18) {

                } else {

                }
            }
            else if (a.equals("F"))
            {
                if (b >18) {

                } else {

                }
            }


        }
    }

}
