import java.util.Scanner;
public class FirstRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Library Inventory System — First Record ===");

        System.out.print("Enter Book title: ");
        String title = input.nextLine();
        System.out.print("Enter Author: ");
        String author = input.nextLine();
        System.out.print("Enter Price: ");
        double price = input.nextDouble();
        System.out.println("\n--- Record Captured ---");
        System.out.println("Book title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);
        System.out.println("========================");
        input.close();
    }
}