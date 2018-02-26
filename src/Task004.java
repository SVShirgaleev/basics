import java.util.Scanner;

public class Task004 {
    //
    //(1 + y) ∗ (2x + y2 − (x + y)/(y + 1/(x2 − 4))).

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите чило y");
        int y = in.nextInt();
        System.out.println("Введите число x");
        int x = in.nextInt();
        double result;
        result =x*x-4; //  (x2 − 4)
        result=1/result; //    1/(x2 − 4)
        result= y+result; //    y + 1/(x2 − 4)
        result= (x+y)/result; //(x + y)/(y + 1/(x2 − 4))
        result = 2*x+y*y - result;
        result = (1+y)*result;

        System.out.println(result);



    }
}