public class Car extends Transport implements TireReplacement {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("��������� ���������");
    }

    @Override
    public void updateTyre() {
        System.out.println("������ �������� ����������");
    }
}
