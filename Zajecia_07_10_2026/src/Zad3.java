import java.util.Scanner;

public class Zad3 {
    public static void main(){

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int mySum = 0;

        System.out.println("Podaj 10 liczb calkowitych (po enterach): ");
        for(int i = 0; i < 10; i++){
            numbers[i] = scanner.nextInt();
            mySum += numbers[i];
        }

        int myAvg = mySum / 10;
        int myMax = numbers[0];
        int myMin = numbers[0];
        int countAboveAvg = 0;

        for(int i = 0; i < 10; i++){
            if (numbers[i] > myMax){
                myMax = numbers[i];
            }
            if (numbers[i] < myMin){
                myMin = numbers[i];
            }
            if (numbers[i] > myAvg){
                countAboveAvg += 1;
            }
        }

        System.out.printf("\nMaksymalna podana wartosc wynosi: %d", myMax);
        System.out.printf("\nMinimalna podana wartosc wynosi: %d", myMin);
        System.out.printf("\nSuma podanych wartosci wynosi: %d", mySum);
        System.out.printf("\nSrednia arytmetyczna podanych wartosci wynosi: %d", myAvg);
        System.out.printf("\nIlosc podanych wartosci powyzej sredniej wynosi: %d", countAboveAvg);

        /*System.out.println("\n");
        for(int i = 0; i < 10; i++){
            System.out.printf("%d, ", numbers[i]);
        }*/

    }
}
