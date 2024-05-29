package Day02;

public class OPTest1 {
    public static void main(String[] args) {
        //산술연산자
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;
        System.out.println(totalScore);
        double avgScore = totalScore / 2.0;
        System.out.println(avgScore);

        System.out.println(6912394%3); // 나머지 연산자
        int a = 10;
        System.out.println(a++); //후치
        System.out.println(++a); //전치

        //관계 연산자
        int b = 10;
        int c = 12;
        int d = 10;

        System.out.println(b == c); // false
        System.out.println(b != c); // true
        System.out.println(b >= c); // false
        System.out.println(d <= c); // true
        System.out.println(c < b); // false

        //논리 연산자
        System.out.println(5>3 && 4 == 7 || 3 != 7);

        //단축 연산자
        int e = 10;
        int f = 5;
        e += f;
        System.out.println(e); // 15
        e -= f;
        System.out.println(e); // 10

        //삼항 연산자
        int x = e == 10 ? 1 : 0;
        System.out.println(x); // 1
    }
}
