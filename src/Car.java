public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("��������� ���������");
    }
    public void updateTyre() {
        System.out.println("������ �������� ����������");
    }

    public void check(Car car){
        if (car != null) {
            System.out.println("����������� " + car.getModelName());
            for (int g = 0; g < car.getWheelsCount(); g++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }
}
