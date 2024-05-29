package Day05;

public class TempTest {
    public static void main(String[] args) {
        int a = 120;
        int b= 36;
        /*
        a = b;
        b = a;

         */
        //값 스왑 변수 특징 덮어쓰기이기 때문에
        int temp = b;
        b = a;
        a = temp;

        System.out.println(a+","+b);
    }
}
