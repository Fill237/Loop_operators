import java.util.Scanner;

public class task_8 {

    static final Scanner src = new Scanner(System.in);

    public static void main (String[] args) {
        int x = src.nextInt();
        int sum = 0;
            for (int i = 0; i<x; i++){
                if (i%2==1){
                    sum+=i;
                }
            }
            System.out.println(sum);
    }

}