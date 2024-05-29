package Day14;

class A{
    int a;
}
class B extends A{
    int b;
}
class C extends A{
    int c;
}
class D extends A{
    int d;
}



public class CastingTest {
    public static void main(String[] args) {
        A a = new B();//업 캐스팅
        //a.b = 20;//Error 변수의 자료형 A라서 B의 변수 확인 X
        B b = (B)a; // 다운 캐스팅
        b.a = 10; // 모두 가능
        b.b = 20; // 모두 가능

        B[] listB = new B[10];
        C[] listC = new C[10];
        D[] listD = new D[10];

        A[] listA = new A[10];

        //A배열에는 B객체를 담을 수 있나요? 됩니다.

        listA[0] = new B();
        listA[1] = new C();
        listA[2] = new D();

        B b1 = (B)listA[0];

        //실제 객체가 무엇인지 알 수 있는 예약어 instanceof
        if(listA[1] != null) {
            if (listA[1] instanceof B) {
                System.out.println("객체는 B 입니다.");
                B b2 = (B)listA[1];
                b2.b = 30;
            } else if (listA[1] instanceof C) {
                System.out.println("객체는 C 입니다.");
                C c = (C)listA[1];
                c.c = 30;
            } else if (listA[1] instanceof D) {
                System.out.println("객체는 D 입니다.");
                D d = (D)listA[1];
                d.d = 30;
            } else {
                System.out.println("객체는 A 입니다.");
            }
        }

    }
}
