package examples;

import java.io.Serializable;

public class Cat implements Animal, Serializable {
    @Override
    public void sayHello() {
        System.out.println("hello im cat");
    }
}
