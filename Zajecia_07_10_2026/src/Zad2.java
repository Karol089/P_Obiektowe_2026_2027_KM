import java.util.Scanner;


public class Zad2 {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita: ");
        int n = scanner.nextInt();

        int mySum = 0;
        int mySumEven = 0;
        if(n > 0){
            for(int i = 0; i < n + 1; i++){
                mySum += i;
                if(i % 2 == 0) {
                    mySumEven += i;
                }
            }
        } else {
            for(int i = 0; i > n - 1; i--){
                mySum += i;
                if(i % 2 == 0) {
                    mySumEven += i;
                }
            }
        }


        System.out.println("\nPodana Liczba jest " + (n % 2 == 0 ? "parzysta" : "nieparzysta") + ".");
        System.out.println("Podana liczba jest " + (n % 3 == 0 ? "podzielna" : "niepodzielna") + " przez 3.");
        System.out.printf("Suma liczb od 1 do %d wynosi: %d\n", n, mySum);
        System.out.printf("Suma liczb parzystych od 1 do %d wynosi: %d\n", n, mySumEven);
    }
}
