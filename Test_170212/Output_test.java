package Test_170212;

/**
 * Created by huza on 2017. 2. 12..
 */
public class Output_test {

    public static void main(String args[]) {
        int a = 3;
        int b = 100;

        //float c = 1.2f;

        //System.out.println(a + "에 100을 곱하면 " + (a*100) + "이라는 결과가 나옵니다");
        //System.out.print(b + "\t" + (b*100));

        // 1. print()
        // 2. println()
        // 3. printf()

        //%d : integer
        //%c : character
        //%s : string
        //%f : float
        //%l : long

        //System.out.printf("%d에 100을 곱하면 %d이라는 결과가 나옵니다",a,(a*100));
        //System.out.printf("%5d%5d",a, (a*100));
        //System.out.printf("%.12f", c);

        //int d = b / a;
        //float e = b / a;
        //System.out.println(d);
        //System.out.println(e);

        //float f = 3;
        //e = b / f;
        //System.out.println(e);

        //int g = 3;
        //System.out.println(g);

        //Cast 변환 : 변수 앞에 원하는 데이터 타입을 괄호 안에 적어주면 끝

        //System.out.println((float)g);

        System.out.println(b/a);
        System.out.println((float)b/a);
        System.out.println((float)(b/a));


    }

}
