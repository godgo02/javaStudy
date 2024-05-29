package Day15;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerLee.getCustomerName()+" 님이 지불해야 하는 금액은 "
        +customerLee.calcPrice(price)+"원 입니다.");
        System.out.println(customerKim.getCustomerName()+" 님이 지불해야 하는 금액은 "
                +customerKim.calcPrice(price)+"원 입니다.");
    }
}
