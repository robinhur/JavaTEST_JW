package Test_170212;

import java.util.Scanner;

/**
 * Created by huza on 2017. 2. 12..
 */
public class Input_test {

    public static void main(String args[]) {
        Scanner my_scanner = new Scanner(System.in);

        /*int e, f, g, h;

        e = my_scanner.nextInt();
        f = my_scanner.nextInt();
        g = my_scanner.nextInt();
        h = my_scanner.nextInt();

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        */


        int a = my_scanner.nextInt();
        float b = my_scanner.nextFloat();

        String c = my_scanner.next();
        String d = my_scanner.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
