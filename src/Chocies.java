import java.util.Scanner;

public class Chocies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vad vill du göra? ");
        System.out.println("1. gå hem ");
        System.out.println("2. stanna i skolan");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Du går hem");
        }
        else if (choice == 2) {
            System.out.println("Snyggt, du stannar kvar i skolan!");
        }
        else {
            System.out.println("Det är inte ett godkänt val. ");
        }

    }
}
