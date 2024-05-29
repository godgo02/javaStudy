package Day17;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));
        calc.showInfo();
        calc.description();

        int[] arr ={1,2,3,4,5};
        //static 메소드는
        //객체 생성 여부와 상관없이 클래스 명. 메소드 하시면 사용 가능
        //이유는 메모리에 바로 올라가기 때문
        System.out.println(Calc.total(arr));
    }
}
