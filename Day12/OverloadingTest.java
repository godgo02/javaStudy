package Day12;

class A{
    A(int a){
        System.out.println(a);
    }
    A(int a, int b){
        System.out.println(a+","+b);
    }
    A(){
        System.out.println("없습니다.");
    }
}

public class OverloadingTest {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A(5);
        A a2 = new A(3,4);
    }
}
