package nestedClasses;

public class StaticNestedExample {
    private static int staticX = 1;
    private int nonStaticY = 1;

    // public|private|protected
    public static class StaticNested {
        private static int x2 = 1;
        private int y2 = 1;

        private void run() {
            System.out.println(staticX);
//            System.out.println(nonStaticY);   compilation error
            kek();
//            kek2();   can't be accessed
        }
    }

    private static void kek() {
        System.out.println("kek");
    }

    //can't be accessed
    private void kek2() {
        System.out.println("kek");
    }

    public static void main(String[] args) {
        StaticNested staticNested = new StaticNested();
        staticNested.run();
        System.out.println(staticX);
    }
}
