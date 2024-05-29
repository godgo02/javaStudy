package Day11;

class A{
    int add(int a, int b){
        return a + b;
    }
    /*
    void add(int c, int d){

    }
     add 이름에 매개변수 정수 2개이기 때문에 중복 X
     */
    double add(double a, double b){
        return a + b;
    }
    int add(int a){
        return  a + 5;
    }
}
public class OverloadingTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(10));
        System.out.println(a.add(5,7));
        System.out.println(a.add(1.7,2.8));
    }
}
