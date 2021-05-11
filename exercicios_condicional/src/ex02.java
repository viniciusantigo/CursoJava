import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número pra saber se ele é PAR ou ÍMPAR: ");

        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        }

        else {
            System.out.println("ÍMPAR");
        }

        sc.close();
    }
}
