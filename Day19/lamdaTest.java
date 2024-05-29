package Day19;

interface Mynumber{
    int getMax(int num1, int num2);
}

public class lamdaTest {
    public static void main(String[] args) {
        Mynumber max = (x,y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10,20));
        /*
        JavaScript에서 많이 사용하는 패턴
        Java는 최소 interface를 통해 메소드 선언이 되어 있어야 합니다.
        int max = (a)->{
            return a;
        }
        */
    }
}
