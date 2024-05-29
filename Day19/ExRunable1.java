package Day19;
class RunableTest implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.println("재미있는 자바 : "+i);
        }
    }
}
public class ExRunable1 {
    public static void main(String[] args) {
        RunableTest r = new RunableTest();
        Thread t = new Thread(r);
        t.start();
        Runnable r1=new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
