package Day19;

public class ExDoubleThread2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest1 t1 = new ThreadTest1(": 배우기 쉬운 자바");
        ThreadTest1 t2 = new ThreadTest1(": 배우기 어려운 자바");
        System.out.println("*********쓰레드 시작 전**************");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("*********쓰레드 시작 후**************");
    }
}
