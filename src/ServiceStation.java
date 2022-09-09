public class ServiceStation {

    public void check(Truck[] trucks) {
        for (Truck truck : trucks) {
            truck.check(truck);
        }
    }

    public void check(Car[] cars) {
        for (Car car : cars) {
            car.check(car);
        }
    }

    public void check(Bicycle[] bicycles){
        for (Bicycle bicycle : bicycles) {
            bicycle.check(bicycle);
        }
    }
}
