public class Truck extends Car {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("��������� ������");
    }

    public void check(Truck truck){
        if (truck != null) {
            System.out.println("����������� " + truck.getModelName());
            for (int g = 0; g < truck.getWheelsCount(); g++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
}
