package app;

public class StaticCalculator {
    private static int numberOfOperations = 0;

    public static int add(int a, int b){
        numberOfOperations++;
        return a + b;
    }

    public static int add(int a, int b, int c){
        numberOfOperations++;
        return a + b + c;
    }

    public static double add(double a, double b){
        numberOfOperations++;
        return a + b;
    }

    public static int substract(int a, int b){
        numberOfOperations++;
        return a - b;
    }

    public static int multiply(int a, int b){
        numberOfOperations++;
        return a * b;
    }

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }
}
