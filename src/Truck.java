public class Truck extends Car implements TireReplacement {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("��������� ������");
    }
}
