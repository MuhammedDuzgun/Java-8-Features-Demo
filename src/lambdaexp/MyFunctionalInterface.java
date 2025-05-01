package lambdaexp;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String s);

    //can contain multiple default methods
    default void m1() {}
    default void m2(){}

    //can contain multiple static methods
    static void m3() {}
    static void m4() {}
}
