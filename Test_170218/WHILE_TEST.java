package Test_170218;

/**
 * Created by huza on 2017. 2. 18..
 */
public class WHILE_TEST {

    public static void main(String args[]) {

        int i = 0;

        while(i < 15) {

            i++;
            System.out.println(i);

        }

        i = 1;

        while (true) {

            if (i > 15)
                break;

            System.out.println(i);
            i++;

        }

        System.out.println("화이팅");

        //공부 말고 숙제요 숙제!!


    }

}
