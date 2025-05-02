package defaultandstaticininterfaces;

public interface Car {
    String getColor();
    String getModel();

    default String getBrand() {
        return "Mercedes";
    }

    static String getInfo() {
        return "Car Info";
    }
}
