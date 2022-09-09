public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

    public void check(Car car){
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int g = 0; g < car.getWheelsCount(); g++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }
}
