package app;

public class InitializationDemo {
    private static String staticField = "Static field initialization";
    private String instanceField = "Instance field initialization";

    static {
        System.out.println("Class initialization");
    }

    {
        System.out.println("Object initialization");
    }

    public InitializationDemo() {
        System.out.println("Constructor initialization");
    }
}
