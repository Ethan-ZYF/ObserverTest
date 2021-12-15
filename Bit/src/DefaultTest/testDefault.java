package DefaultTest;

public interface testDefault {
    static void testPrint1() {
        System.out.println("Hello World!");
    }

    default void testPrint2() {
        System.out.println("Hi World");
    }
}
