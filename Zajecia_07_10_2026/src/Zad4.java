import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // brakujący średnik

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // operator przypisania "=" zamiast porównania "=="
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); // brakujący średnik
        }

        for (int i = 0; i <= 5; i++) { //nieskończona pętla, "--" zamiast "++"
            System.out.println(i);
        }

        //scanner.close(); //tylko do plików?
    }
}
