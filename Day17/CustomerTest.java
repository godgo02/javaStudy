package Day17;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.buy();
        c.sell();
        c.order();

        Sell s = (Sell) c;
        s.order();
        Buy b = (Buy) c;
        b.order();
    }
}
