package Day16;

public abstract class Car1 {
    public abstract void drive();
    public abstract void stop();
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }
    //템플릿으로 일련의 동작을 모아 놓은 메소드
    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();
    }
}
