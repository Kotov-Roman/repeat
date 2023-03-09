import examples.Animal;
import examples.Cat;
import examples.Dog;
import generics.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Printer<Cat> catPrinter = new Printer<>(new Cat());
//        Printer<Dog> dogPrinter = new Printer<>(new Dog());
//        catPrinter.print();
//        dogPrinter.print();
//        meow(new Cat(), new Dog());
        meow2(1111, "asd");
        meow2(List.of(new Cat(), new Dog()));// works cuz list of objects
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        meow2(animals); //ok
//        meow2(dogs); //error cuz dogs are not allowed


    }


    public static <T extends Animal, A>  A meow3(T animal) {
        return (A) new Dog();
    }
    public static void meow2(List<? super Animal> animals) {
        for (Object animal : animals) {
            Animal animal1 = (Animal) animal;// cast is needed cuz "?" is Object
            animal1.sayHello();
        }
    }

    public static <T extends Animal> void meow1(List<T> animals) {
        for (T animal : animals) {
            animal.sayHello();
        }
    }

    public static <T extends Animal> void meow(T... args) {
        for (T arg : args) {
            arg.sayHello();
        }
    }

    // V is return type
    // <T, V> after static are needed to show that generics are params
    // otherwise would not compile cuz no Class V and T exists
    public static <T, V> V meow2(V anything, T... args) {
        System.out.println(anything);
        System.out.println(Arrays.toString(args));
        return anything;
    }
}
