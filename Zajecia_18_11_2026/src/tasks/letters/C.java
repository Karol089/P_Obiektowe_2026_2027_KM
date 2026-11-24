package tasks.letters;

import tasks.interfaces.A;
import tasks.interfaces.B;

public class C implements A, B {
    @Override
    public void hello() {
        A.super.hello();
    }
    /*java: types tasks.interfaces.A and tasks.interfaces.B are incompatible;
    class tasks.letters.C inherits unrelated defaults for hello() from types tasks.interfaces.A and tasks.interfaces.B*/
}
