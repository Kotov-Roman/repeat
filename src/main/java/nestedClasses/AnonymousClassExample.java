package nestedClasses;

public class AnonymousClassExample {
    static int kek = 1;
    int lol = 7;
    int zed = 5;

    public void doIt() {
        int x = 5;
//        x =10;                causes compilation error, should be effectively final
        Runnable runnable = new Runnable() {
//            static int y = 5;   static is not allowed here

            int z = 10;

            //            z=5; should be effectively final
            @Override
            public void run() {
                z = 5;  //ok
                System.out.println("running" + z + x);
//                x = 7;        causes compilation error, should be effectively final
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        AnonymousClassExample anonymousClassExample = new AnonymousClassExample();
        anonymousClassExample.doIt();

        anonymousClassExample.lol = anonymousClassExample.zed;

        anonymousClassExample.zed = 15;
        System.out.println(anonymousClassExample.lol);
        System.out.println(anonymousClassExample.zed);
    }
}
