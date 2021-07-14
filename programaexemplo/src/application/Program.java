package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");

        product.name = leitor.nextLine();


        System.out.print("Price: ");
        product.price = leitor.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = leitor.nextInt();

        System.out.println(product);

        leitor.close();
    }
}
