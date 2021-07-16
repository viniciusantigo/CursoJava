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

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of the products to be added in stock: ");
        int quantity = leitor.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated Data: " + product);

        System.out.println();
        System.out.print("Enter the number of the products to be removed in stock: ");
        quantity = leitor.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        leitor.close();
    }
}
