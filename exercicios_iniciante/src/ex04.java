import java.util.Scanner; 
import java.util.Locale; 

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int numero, hora;
        double valor, salario;

        numero = sc.nextInt();
        hora = sc.nextInt();
        valor = sc.nextDouble();

        salario = hora * valor;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}