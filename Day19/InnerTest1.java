package Day19;
class OutClass{
    private static int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){
            //num += 10; 정적 class 이기 때문에 일반 class 멤버변수를 사용을 할 수 없다.
            System.out.println(inNum);//내부 class instance 변수
            System.out.println(sInNum);//내부 class static 변수
            System.out.println(sNum); // 외부 static 변수
        }
        static void sTest(){
            System.out.println(sInNum);
            System.out.println(sNum);
            //System.out.println(inNum); 인스턴스 변수(객체 생성되어야 사용가능한 변수)
        }
    }

    static class InClass{
        int inNum = 100;
        static int sInNum = 200;
        void inTest(){
            System.out.println("OutClass num = "+num);
            System.out.println("Outclass sNum = "+sNum);
        }
        static void sTest(){

        }
    }
    public void usingClass(){
        inClass.inTest();
    }
}
public class InnerTest1 {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();

        OutClass.InStaticClass sInClass =new OutClass.InStaticClass();
        sInClass.inTest(); // 정적 class -> 인스턴스 메소드
        OutClass.InStaticClass.sTest(); // 정적 class -> 정적 메소드
    }
}
