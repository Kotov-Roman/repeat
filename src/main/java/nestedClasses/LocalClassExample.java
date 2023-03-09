package nestedClasses;

public class LocalClassExample {
    private static int x = 1;
    private int y = 1;

    void run() {

        int z = 5;
//        z=4; causes error cuz is used at local class and should be effectively final

        class Local {
//            private static int x = 1;    not allowed static
            private int y3 = 1;

            int y2 = 10;
//            y=5;  compilation error - non effectively final

            void methodOfLocalClass() {
                System.out.println("methodOfLocalClass is invoked");
                System.out.println(y2);
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }
        }

        Local local = new Local();
        local.methodOfLocalClass();
    }

    public static void main(String[] args) {
        LocalClassExample main = new LocalClassExample();
        main.run();
    }
}
