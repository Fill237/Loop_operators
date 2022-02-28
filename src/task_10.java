import java.util.Arrays;
import java.util.Scanner;

public class task_10 {

    static final Scanner src = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Введите кол-во строк матрицы");
        int str = src.nextInt();
        System.out.println("Введите кол-во столбцов матрицы");
        int slb = src.nextInt();

        int [] [] matrix = new int[str][slb]; //параметры матрицы и заполение
        System.out.println("Надо ввести "+ str * slb + " значений для заполнения");

            for (int i = 0; i < matrix.length; i++){
                    for (int j = 0; j < matrix[i].length; j++) {
                        System.out.println("Строка матрицы: " + i + " номер элемента: " + j);
                        matrix[i][j] = src.nextInt();}
            }

        int num = 3;
            for (int i = 0; i < matrix.length; i++) {
                int j;
                for (j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] *= num;
                }
            }
            System.out.println(Arrays.toString(matrix[0]));

        }

    }