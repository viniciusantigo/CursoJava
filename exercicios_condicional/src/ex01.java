import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO");
        } 
        else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}