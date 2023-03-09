package core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassExample {

    // fields of the FinalClassExample class
    private final int id;

    private final String name;

    private final HashMap<String,String> testMap;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Getter function for mutable objects

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

    // Constructor method performing deep copy

    public ImmutableClassExample(int i, String n, HashMap<String,String> map){
        System.out.println("Performing Deep Copy for Object initialization");

        // "this" keyword refers to the current object
        this.id=i;
        this.name=n;

        HashMap<String,String> copy =new HashMap<>(map);
        Object clone = map.clone();//does the same

        this.testMap=copy;
    }

    // Test the immutable class

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String,String>();
        map1.put("1", "first");
        map1.put("2", "second");

        String s = "original";

        int i=10;

        ImmutableClassExample ce = new ImmutableClassExample(i,s,map1);

        // print the ce values
        System.out.println("ce id: "+ce.getId());
        System.out.println("ce name: "+ce.getName());
        System.out.println("ce testMap: "+ce.getTestMap());
        // change the local variable values
        i=20;
        s="modified";
        map1.put("3", "third");
        // print the values again
        System.out.println("ce id after local variable change: "+ce.getId());
        System.out.println("ce name after local variable change: "+ce.getName());
        System.out.println("ce testMap after local variable change: "+ce.getTestMap());

        HashMap<String, String> hmTest = ce.getTestMap();
        hmTest.put("4", "new");

        System.out.println("ce testMap after changing variable from getter methods: "+ce.getTestMap());

    }
}
