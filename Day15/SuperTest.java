package Day15;

class A{
    int a;
    A(int a) {

    }
    A(String str){

    }
}
class B extends A{
//    B(){
//        super(5);
//    }
    int a;
    B(int a){
        super(a);
    }
    B(String str){
        super(str);
    }
    void abc(){
        this.a = 10;
        super.a = 20;
    }
    int superReturn(){
        return super.a;
    }
}
public class SuperTest {
    public static void main(String[] args) {
        B b = new B("하이");
        B b1 = new B(10);
        b1.abc();
        //부모 멤버변수 a랑 내꺼 a랑 출력
        //System.out.println(this.b.a); //에러
        //this와 super 클래스 안에서 사용해야 됩니다.
        System.out.println(b1.a);
        System.out.println(b1.superReturn());
    }
}