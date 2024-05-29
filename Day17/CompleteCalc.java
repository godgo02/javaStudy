package Day17;

public class CompleteCalc extends Calculator{
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        return num1/num2;
    }

    @Override
    public void description() {
        System.out.println("메롱!");
    }

    public void showInfo(){
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
