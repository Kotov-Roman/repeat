package examples;

public class Printer<T extends Animal, V extends Animal> {

//     <T extends Animal,V extends Animal>  is needed for static methods
    public static <T extends Animal, V extends Animal> T print(T t, V v) {
        t.sayHello();
        v.sayHello();
        return t;
    }

    public T print2(T t, V v) {
        t.sayHello();
        v.sayHello();
        return t;
    }
}
