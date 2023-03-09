package nestedClasses;

//Non-Static Nested Classes
//        Next, here are a few quick points to remember about non-static nested classes:
//
//        They are also called inner classes
//        They can have all types of access modifiers in their declaration
//        Just like instance variables and methods, inner classes are associated with an instance of the enclosing class
//        They have access to all members of the enclosing class, regardless of whether they are static or non-static
//        They can only define non-static members

public class NonStaticInnerExample {
    private static int x = 1;
    private int y = 1;


    //    NonStaticMemberClass
// public|private|protected
    public class StaticNested {
        //        private static int x2 = 1;  compilation error - not allowed static
        private int y2 = 1;

        //even if it is private, it can be accessed from outer class
        private void run() {
            System.out.println(x);
            System.out.println(y);
            kek();
            kek2();
        }
    }

    //also can be accessed from inner class
    private static void kek() {
        System.out.println("kek");
    }

    //also can be accessed from inner class
    private  void kek2() {
        System.out.println("kek");
    }

    public static void main(String[] args) {
        NonStaticInnerExample outer = new NonStaticInnerExample();

        StaticNested staticNested = outer.new StaticNested();
        staticNested.run();
    }
}
