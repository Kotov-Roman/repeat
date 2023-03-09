package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Dog extends Animal{
    public static void main(String... args) {
        Dog.hi();
        Animal.hi();
        System.out.println(Arrays.toString(args));


//        ArrayList<Integer> list = List.of(1, 2);
        List<Integer> list = List.of(1, 2);
//        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list2 = List.of(5,4);
//        ArrayList<Integer> list2 = new ArrayList<>(list);

        List<List<Integer>> arrayLists = List.of(list2, list);
        List<Integer> integers = arrayLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


        System.out.println(integers);
//
//        Stream.of(1,2,3)
////                .flatMap()
////                .sorted((it, next)-> next.compareTo(it) )
////                .sorted((x,y)-> {return (x < y) ? -1 : ((x == y) ? 0 : 1);})
//                .forEach(System.out::println);
//
////        list2.spliterator().
////        objects.lastIndexOf();
//        HashMap<Object, Object> map = new HashMap<>();
//        map.entrySet().iterator();
//        Hashtable<Object, Object> hashtable = new Hashtable<>();
////        hashtable.

    }

    static void hi(){
        System.out.println("hi Dog");
    }
}
