import java.util.Arrays;
import java.util.Scanner;

public class task_9 {

    static final Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        int size_array = src.nextInt();
        double[] array = new double[(size_array)];
        System.out.println("Размер массива: " + array.length); //заполняем массив
        for (int i = 0; i < size_array; i++) {
            array[i] = src.nextDouble();
        }

        double average = 0; // ср. ариф.
            if (array.length>0){
                double sum = 0;
                for (int i = 0; i < array.length; i++){
                    sum +=array[i];
                }
                average = sum / array.length;
            }
        System.out.println("Среднее арифмитическое: " + average);

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * average;
        }
        System.out.println(Arrays.toString(array));
    }
}