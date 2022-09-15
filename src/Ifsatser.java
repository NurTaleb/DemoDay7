import java.util.Scanner;

public class Ifsatser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur många studerande är här idag");
        int numberOfStudents = scanner.nextInt();

        if (numberOfStudents == 33) {
            System.out.println("Alla verkar vara här idag");

        }

        else if (numberOfStudents > 33); {
            System.out.println("nåogn i klass rummet har hamnat fel");
        }


        if (numberOfStudents > 33) {
            System.out.println("Någon i klassrummet verkar ha hamnat fel");
        }

        if (numberOfStudents < 33) {
            System.out.println("Det fattas några elever idag, nämligen: "
            + (33 + numberOfStudents) + "stycken.");
        }
        System.out.println("--- Nu är vi utanför if-satsen");


    }
}
