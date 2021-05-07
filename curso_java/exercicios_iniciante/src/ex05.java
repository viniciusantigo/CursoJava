import java.util.Locale;
import java.util.Scanner; 

public class ex05 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int cod1, p1, cod2, p2;
        double val1, val2, total; 

        cod1 = sc.nextInt();
        p1 = sc.nextInt();
        val1 = sc.nextDouble();

        cod2 = sc.nextInt();
        p2 = sc.nextInt();
        val2 = sc.nextDouble();

        total = p1 * val1 + p2 * val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        sc.close();
    }
}
