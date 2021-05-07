import java.util.Scanner;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double raio, pi, area;

        raio = sc.nextDouble();
        pi =  3.14159;
        area = pi * Math.pow(raio, 2.0);

        System.out.printf("A=%.4f", area);
    }
}
