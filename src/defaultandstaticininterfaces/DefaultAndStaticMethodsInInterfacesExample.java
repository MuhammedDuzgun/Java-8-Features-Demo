package defaultandstaticininterfaces;

public class DefaultAndStaticMethodsInInterfacesExample {
    public static void main(String[] args) {
        ModelA modelA = new ModelA();
        System.out.println(modelA.getModel());
        System.out.println(modelA.getColor());
        System.out.println(modelA.getBrand());
        System.out.println(Car.getInfo());

        ModelB modelB = new ModelB();
        System.out.println(modelB.getModel());
        System.out.println(modelB.getColor());
        System.out.println(modelB.getBrand());
        System.out.println(Car.getInfo());
    }
}
