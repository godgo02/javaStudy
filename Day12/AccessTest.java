package Day12;

class X{
    public int a;
    private int b;
    public void abc(){

    }
    private void def(){

    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.a);
        //System.out.println(x.b);
        x.abc();
        //x.def();
    }
}
