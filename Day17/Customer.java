package Day17;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }
    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void order() {
        //부모에 있는 것을 선택하던가
        //Buy.super.order();
        //Sell.super.order();
        //
        System.out.println("고객 판매 주문");
    }
}
