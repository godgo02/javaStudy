package Day16;

public class CarTest1 {
    public static void main(String[] args) {
        System.out.println("======자율 주행하는 자동차=======");
        Car1 mycar = new AICar();
        mycar.run();
        System.out.println("======사람이 운전하는 자동차======");
        Car1 hiscar = new ManualCar();
        hiscar.run();
    }
}
