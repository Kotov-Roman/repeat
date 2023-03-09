package examples;

import java.io.Serializable;

public class Dog implements Animal , Serializable {
    @Override
    public void sayHello() {
        System.out.println("hello im dog");
    }

    public void sayDOG() {
        System.out.println("hello im dog");
    }

}
