package Day12;

import java.util.Scanner;

class Computer{
    String menu;
    String cpu;
    int price;

    Computer(String menu, String cpu, int price){
        this.menu = menu;
        this.cpu = cpu;
        this.price = price;
    }
    void use(){
        System.out.println("제조사가 "+menu+"인"+cpu+"컴퓨터를 사용한다.");
    }
}
class AirCorn{
    String menu;
    String type;
    int price;

    AirCorn(String menu, String type, int price){
        this.menu = menu;
        this.type = type;
        this.price = price;
    }
    void use(){
        System.out.println("제조사가 "+menu+"인"+type+"에어컨을 사용한다.");
    }
}
class Ref{
    String menu;
    String type;
    String size;
    int price;
    Ref(String menu, String type, String size,int price){
        this.menu = menu;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    void use(){
        System.out.println("제조사가 "+menu+"인"+type+"형"+size+" 냉장고가 식품을 관리한다.");
    }
}
class AirCleaner{
    String menu;
    int price;
    AirCleaner(String menu, int price){
        this.menu = menu;
        this.price = price;
    }
    void use(){
        System.out.println("제조사가 "+menu+"인 공기청정기가 공기를 깨끗하게 한다.");
    }
}
class Mart{
    //1.컴퓨터 10대
    Computer[] c = new Computer[10];
    //2.에어컨 10대
    AirCorn[] a = new AirCorn[10];
    //3.냉장고 10대
    Ref[] r = new Ref[10];
    //4.공기청정기 10대
    AirCleaner[] ac = new AirCleaner[10];

    int index = -1;// 만에하나 바로 접근하면 죽으라고
    //생성자에서 배열에 객체를 넣어줍니다.
    Mart(){
        for(int i =0;i<10;i++){
            if(i<5){
                c[i] = new Computer("삼성","i7",200);
                a[i] = new AirCorn("삼성","벽걸이",100);
                r[i] = new Ref("삼성","양문","600L",200);
                ac[i] = new AirCleaner("LG",80);
            }
            else{
                c[i] = new Computer("LG","i5",150);
                a[i] = new AirCorn("LG","스탠드",250);
                r[i] = new Ref("LG","4도어","800L",350);
                ac[i] = new AirCleaner("다이슨",60);
            }
        }
    }
    /*
    Computer sendComputer(String type){
        for(int i = 0;i<c.length;i++){
            if(c[i]!=null){
                if(c[i].menu.equals(type)){
                    return c[i];
                }
            }
        }
        return null;
    }
     */
    Computer sendComputer(int start, int end){
        for(int i = start;i<end;i++){
            if(c[i]!=null){
                index = i;
               return c[i];
            }
        }
        return null;
    }
    AirCorn sendAirCorn(int start, int end){
        for(int i = start;i<end;i++){
            if(a[i]!=null){
                index = i;
                return a[i];
            }
        }
        return null;
    }
    Ref sendRef(int start, int end){
        for(int i = start;i<end;i++){
            if(r[i]!=null){
                index = i;
                return r[i];
            }
        }
        return null;
    }

    AirCleaner sendAirCleaner(int start, int end){
        for(int i = start;i<end;i++){
            if(ac[i]!=null){
                index = i;
                return ac[i];
            }
        }
        return null;
    }

    void changeNullComputer(){
        c[index] = null;
    }
    void changeNullAirCorn(){
        a[index] = null;
    }
    void changeNullRef(){
        r[index] = null;
    }
    void changeNullAirCleaner(){
        ac[index] = null;
    }

}
class Consumer{
    //1.컴퓨터 10대를 담을 수 있는 그릇
    Computer[] c = new Computer[10];
    //2.에어컨 10대를 담을 수 있는 그릇
    AirCorn[] a = new AirCorn[10];
    //3.냉장고 10대를 담을 수 있는 그릇
    Ref[] r = new Ref[10];
    //4.공기청정기 10대를 담을 수 있는 그릇
    AirCleaner[] ac = new AirCleaner[10];
    //5. 돈
    int money;

    void receiveComputer(Computer com){
        for(int i =0;i<c.length;i++){
            if(c[i] == null){
                c[i] = com;
                break;
            }
        }
    }
    void receiveAirCorn(AirCorn airCorn){
        for(int i =0;i<a.length;i++){
            if(a[i] == null){
                a[i] = airCorn;
                break;
            }
        }
    }
    void receiveRef(Ref ref){
        for(int i =0;i<r.length;i++){
            if(r[i] == null){
                r[i] = ref;
                break;
            }
        }
    }
    void receiveAirCleaner(AirCleaner airCleaner){
        for(int i =0;i<ac.length;i++){
            if(ac[i] == null){
                ac[i] = airCleaner;
                break;
            }
        }
    }

    void allPrint(){
        for(int i = 0;i<10;i++){
            if(c[i] != null){
                c[i].use();
            }
            if(a[i] != null){
                a[i].use();
            }
            if(r[i] != null){
                r[i].use();
            }
            if(ac[i] != null){
                ac[i].use();
            }
        }
    }


}


public class Q2 {
    public static void main(String[] args) {
        Mart m = new Mart();//마트
        Consumer[] con = new Consumer[3]; // 소비자 3명
        Scanner sc = new Scanner(System.in); // 입력에 필요한 Scanner 객체

        for(int i =0;i<con.length;i++){
            con[i] = new Consumer();
            System.out.print((i+1)+"번째 소비자 : ");
            con[i].money = sc.nextInt();
        }

        while (con[0].money >= 60 || con[1].money >=60 || con[2].money >=60){
            for(int i =0;i< con.length;i++){
                System.out.println((i+1)+"번째 소비자 남은 금액 : "+con[i].money);
                //각각 자기 번호의 입력을 하게 됩니다.
                //60바다 돈이 없으면 반복을 돌려
                if(con[i].money>=60){
                    System.out.print((i+1)+"번째 소비자 상품을 선택해주세요 1.컴퓨터 2.에어콘 3.냉장고 4.공기청정기 : ");
                    int num = sc.nextInt();
                    if(num == 1){
                        System.out.println("1.삼성 2.LG");
                        int type = sc.nextInt();
                        if(type == 1){ // 200원
                            //돈있는지 확인
                            if(con[i].money >= 200){
                                Computer c = m.sendComputer(0,5);
                                if(c == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= c.price;
                                    con[i].receiveComputer(c);
                                    m.changeNullComputer();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }

                        }
                        else if(type == 2){ //150원
                            if(con[i].money >= 150){
                                Computer c = m.sendComputer(5,10);
                                if(c == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= c.price;
                                    con[i].receiveComputer(c);
                                    m.changeNullComputer();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }
                        }
                        else{
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                    else if(num == 2){
                        System.out.println("1.삼성 2.LG");
                        int type = sc.nextInt();
                        if(type == 1){ // 100원
                            //돈있는지 확인
                            if(con[i].money >= 100){
                                AirCorn a = m.sendAirCorn(0,5);
                                if(a == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= a.price;
                                    con[i].receiveAirCorn(a);
                                    m.changeNullAirCorn();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }

                        }
                        else if(type == 2){ //250원
                            if(con[i].money >= 250){
                                AirCorn a = m.sendAirCorn(5,10);
                                if(a == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= a.price;
                                    con[i].receiveAirCorn(a);
                                    m.changeNullAirCorn();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }
                        }
                        else{
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                    else if(num == 3){
                        System.out.println("1.삼성 2.LG");
                        int type = sc.nextInt();
                        if(type == 1){ // 200원
                            //돈있는지 확인
                            if(con[i].money >= 200){
                                Ref r = m.sendRef(0,5);
                                if(r == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= r.price;
                                    con[i].receiveRef(r);
                                    m.changeNullRef();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }

                        }
                        else if(type == 2){ //350원
                            if(con[i].money >= 350){
                                Ref r = m.sendRef(5,10);
                                if(r == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= r.price;
                                    con[i].receiveRef(r);
                                    m.changeNullRef();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }
                        }
                        else{
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                    else if(num ==4){
                        System.out.println("1.LG 2.다이슨");
                        int type = sc.nextInt();
                        if(type == 1){ // 80원
                            //돈있는지 확인
                            if(con[i].money >= 80){
                                AirCleaner ac = m.sendAirCleaner(0,5);
                                if(ac == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= ac.price;
                                    con[i].receiveAirCleaner(ac);
                                    m.changeNullAirCleaner();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }

                        }
                        else if(type == 2){ //60원
                            if(con[i].money >= 60){
                                AirCleaner ac = m.sendAirCleaner(5,10);
                                if(ac == null){
                                    System.out.println("물건이 모두 팔렸습니다.");
                                }
                                else{
                                    con[i].money -= ac.price;
                                    con[i].receiveAirCleaner(ac);
                                    m.changeNullAirCleaner();
                                }
                                //돈이 O -> Mart 객체 -> Consumer에 있는 배열 객체에 넘겨줍니다.
                            }
                            else{
                                System.out.println("돈이 부족합니다.");
                            }
                        }
                        else{
                            System.out.println("잘못된 입력입니다.");
                        }
                    }
                    else{
                        System.out.println("잘못된 입력입니다.");
                    }
                }
            }
        }
        for(int i =0;i< con.length;i++){
            con[i].allPrint();
        }
    }
}
