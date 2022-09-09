public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    public void check(Bicycle bicycle){
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int g = 0; g < bicycle.getWheelsCount(); g++) {
                bicycle.updateTyre();
            }
        }
    }
}
