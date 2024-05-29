package Day10;

class C{
    int x;
    int k;
    C(int a, int b){
        x = a;
        k = b;
    }
}
public class classTest2 {
    public static void main(String[] args) {
        //c 참조 변수 -> 자료형 참조 자료형이니까
        //c.x(멤버변수)
        C c = new C(5,3);
        C c1 = new C(6,7);
        System.out.println(c.x+","+c.k);
        System.out.println(c1.x+","+c1.k);
    }
}
