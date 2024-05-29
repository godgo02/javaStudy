package Day19;

class ThreadTest extends Thread{
    @Override
    public void run() {
        // 종업원에게 시킬일을 작성하면 됩니다.
        for (int i = 1;i<=10;i++){
            System.out.println("재미있는 자바 : "+i);
        }
    }
}
public class ExThread1 {
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest(); // 쓰레드 생성
        t.start();
        for(int i = 1;i<=10;i++){
            System.out.println("Main 쓰레드 : "+i);
        }
    }
}
