import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("введите радиус шара");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double volume = (4*3.14*r*r*r)/3;
        System.out.println("Объем шара");
        System.out.println(volume);
    }
}
