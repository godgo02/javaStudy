package Day16;
abstract class Car{
    abstract void run();
    abstract void refuel();
    void stop() {
        System.out.println("차가 멈춥니다.");
    }
}
class Bus extends Car{
    @Override
    void run() {
        System.out.println("버스가 달립니다.");
    }
    @Override
    void refuel() {
        System.out.println("천연가스를 충전합니다.");
    }
    void takePassenger(){
        System.out.println("승객을 버스에 태웁니다.");
    }

}
class AutoCar extends Car{
    @Override
    void run() {
        System.out.println("차가 달립니다.");
    }
    @Override
    void refuel() {
        System.out.println("휘발유를 주유합니다.");
    }
    void load(){
        System.out.println("짐을 싣습니다.");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        bus.run();
        autoCar.run();

        bus.refuel();
        autoCar.refuel();

        bus.takePassenger();
        autoCar.load();

        bus.stop();
        autoCar.stop();
    }
}
