import java.util.Scanner;

public class task005 {
    public static void main(String[] args) {
        //x5 +6x4 +10x3 +25x2 +30x+101
        Scanner scanner= new Scanner(System.in);//создаем сканнер для ввода чилса x из консоли
        int x= scanner.nextInt(); //инициализация перемнной x типа int(целые числа) и присваиваем ему значение вводимого
        // числа в консол с помощью scanner

        double result ;
        result = Math.pow(x,5) +6*Math.pow(x,4)+10*Math.pow(x,3)  +25*Math.pow(x,2)+30*x+101;
        System.out.println(result);//инициализация переменной result типа double (вещестенные числа)
                                                        //далее тебе нужно вычислить выражение и вывести его
                                                    //
    }
}
