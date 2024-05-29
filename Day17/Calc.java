package Day17;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1,int num2);
    int substract(int num1, int num2);
    int times(int num1,int num2);
    int divide(int num1,int num2);

    //디폴트메소드
    //선언과 정의를 동시에 사용할 수 있고
    //메소드 오버라이딩도 당연히 가능하다.
    //추상화 개념 망가뜨렸다.
    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
    }
    static int total(int[] arr){
        int total = 0;
        //향상된 for문 많이 쓰입니다.
        //근본적으로 자료구조여야 합니다.
        for(int i : arr){
            total += i;
        }
        return total;
    }
}
