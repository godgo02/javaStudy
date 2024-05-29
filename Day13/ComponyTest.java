package Day13;

public class ComponyTest {
    int[] num = {100,200,300};
    int[] num1 = new int[] {100,200,300};
    public static void main(String[] args) {
        Compony c1 = Compony.getInstance();
        Compony c2 = Compony.getInstance();
        Compony c3 = new Compony();
        System.out.println(c1 == c2);
    }
}
