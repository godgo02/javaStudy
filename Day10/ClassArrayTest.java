package Day10;

public class ClassArrayTest {
    public static void main(String[] args) {
        A[] a = new A[5];
        for(int i = 0;i<a.length;i++){
            a[i] = new A();
        }
        a[0].a = 10; //에러 발생

        A a1;
        a1 = a[0];
        System.out.println(a1);
        System.out.println(a[0]);
        a[0] = null;
        System.out.println(a1);
        System.out.println(a[0]);
    }


}
