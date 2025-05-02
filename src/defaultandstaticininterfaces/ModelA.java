package defaultandstaticininterfaces;

public class ModelA implements Car{
    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public String getModel() {
        return "Model A";
    }
}
