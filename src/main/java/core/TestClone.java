package core;

import java.util.Objects;

public class TestClone {
    int x, y;
    TestClone()
    {
        x = 10;
        y = 20;
    }
}

// Driver Class
class Main {
    public static void main(String[] args)
    {
        TestClone ob1 = new TestClone();

        System.out.println(ob1.x + " " + ob1.y);

        // Creating a new reference variable ob2
        // pointing to same address as ob1
        TestClone ob2 = ob1;


//        Object clone = ob2();
//        clone.toString()
        // Any change made in ob2 will
        // be reflected in ob1
        ob2.x = 100;

        System.out.println(ob1.x + " " + ob1.y);
        System.out.println(ob2.x + " " + ob2.y);
    }
}
