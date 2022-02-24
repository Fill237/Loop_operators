import java.util.Scanner;

public class task_7 {

    static final int X = 4;
    static final int Y = 9;
    static final int Z = 14;

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int size_mas = src.nextInt();
        int[] mas = new int[size_mas];                      //zadaem razmer massiva
        System.out.println("razmer massiva:" + mas.length);
        int i;
        for (i = 0; i < size_mas; i++) {             //zapolnenie elementami
            mas[i] = src.nextInt();
        }

    /*    for (int element : mas) {                   //perebor elementov
            System.out.printf("%d\t%d\n", i, element);
            i++;
        } */

        for (i = 0; i < mas.length; i++)
                if (mas[i] == X || mas[i] == Y || mas[i] == Z){
                    System.out.println("Данное значение имеется в константах");
                            } else
                            System.out.println("Нет ни одного значения из констант");
    }
}