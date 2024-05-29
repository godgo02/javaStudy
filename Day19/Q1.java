package Day19;

class Account{
    private int total = 0;
    synchronized void deposit(){
        total += 1000;
    }
    public int getTotal(){
        return total;
    }
}

class Customer extends Thread{
    Account a;
    Customer(Account a, String s){
        this.a = a;
        setName(s);
    }
    @Override
    public void run() {
        int i = 0;
        while(a.getTotal()<500000){
            System.out.println(getName()+":"+ ++i + "번째");
            a.deposit();
        }
    }
}
public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        Account a = new Account();
        Customer[] c = new Customer[5];
        for(int i =0;i<c.length;i++){
            c[i] = new Customer(a, (i+1)+"번째 성금자");
        }

        for(int i = 0;i<c.length;i++){
            c[i].start();
        }
        for(int i = 0;i<c.length;i++){
            c[i].join();
        }
        System.out.println("성금 총액은 : "+a.getTotal());
    }
}
