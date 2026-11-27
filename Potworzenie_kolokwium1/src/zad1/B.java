package zad1;

class B extends A {

    public B() {
        System.out.println("B()");
    }

    @Override
    public void show() {
        System.out.println("B.show");
    }
}
