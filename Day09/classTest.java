package Day09;

class A{
    int a; // 속성
    void print(){ //기능
        System.out.println("a는 "+a+"입니다.");
    }
}
public class classTest {
    public static void main(String[] args) {
        A a = new A();
        a.a = 20;
        a.print();

        A b = new A();
        //b.a = 20;
        b.print();
    }
}
