package zad4;

public class Zad4 {
    public static void main(String[] args){
        /*
        Powód nr.1:
        - kontruktor podklasy Student nie wypełnia pola name z nadklasy Person
        Możliwa poprawa:
        - implementacja odnośnika super() w konstruktorze student

        Powód nr.2
        - metoda identify jest final i nie może być nadpisana
        Możliwa poprawa:
        - odebranie metodzie identify stanu final
        */

        Student student = new Student("Andrzej", 123456);
        student.identify();
    }
}
