public class ServiceStation {

    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i] != null) {
                System.out.println("Обслуживаем " + trucks[i].getModelName());
                for (int g = 0; g < trucks[i].getWheelsCount(); g++) {
                    trucks[i].updateTyre();
                }
                trucks[i].checkEngine();
                trucks[i].checkTrailer();
            }
        }
    }

    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println("Обслуживаем " + cars[i].getModelName());
                for (int g = 0; g < cars[i].getWheelsCount(); g++) {
                    cars[i].updateTyre();
                }
                cars[i].checkEngine();
            }
        }
    }

    public void check(Bicycle[] bicycles){
        for (int i = 0; i < bicycles.length; i++) {
            if (bicycles[i] != null) {
                System.out.println("Обслуживаем " + bicycles[i].getModelName());
                for (int g = 0; g < bicycles[i].getWheelsCount(); g++) {
                    bicycles[i].updateTyre();
                }
            }
        }
    }


}
