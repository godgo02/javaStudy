package Day14;

class VIPCo extends Customer{
    double saleRatio; //할인율
    VIPCo(){
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    //오버라이딩 한 메소드
    //어노테이션 or 애노테이션 태그 또는 메타데이터
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }
}

public class MethodOveridingTest {
    public static void main(String[] args) {
        Customer c1 = new VIPCo();
        Customer c2 = new Customer();

        c1.calcPrice(5000);
        c2.calcPrice(5000);

        System.out.println(c1.showCustomerInfo());
        System.out.println(c2.showCustomerInfo());
    }
}
