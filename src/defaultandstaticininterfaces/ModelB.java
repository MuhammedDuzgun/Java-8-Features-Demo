package defaultandstaticininterfaces;

public class ModelB implements Car{
    @Override
    public String getColor() {
        return "Blue";
    }

    @Override
    public String getModel() {
        return "ModelB";
    }
}
