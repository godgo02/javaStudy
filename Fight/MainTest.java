package Fight;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        //1. 기사 악마 객체 생성
        Unit knight = new Knight("기사",50,2000,2000);
        Unit villain = new Villain("악당",80,1200,1200);
        //2. 배틀 객체 생성 <- 버프 객체 생성이 자동으로 만드렁짐
        Battle battle = new Battle();
        //경기시작
        boolean turn = true; // true 기사 false 악당
        int count = 1;
        while(knight.getHp() > 0 && villain.getHp() > 0 ){
            System.out.println(count+"번 째 경기가 시작됩니다.");
            if(turn){ // 기사
                System.out.println("=========================================");
                //1. 기사 버프 발동
                battle.randBurf(knight);
                //2. 기사 악당 공격
                battle.attack(knight,villain);
                turn = false;
                System.out.println("=========================================");
            }
            else{//악당
                System.out.println("=========================================");
                //1. 기사 버프 발동
                battle.randBurf(villain);
                //2. 기사 악당 공격
                battle.attack(villain,knight);
                turn =true;
                System.out.println("=========================================");
            }
            Thread.sleep(1000); //1초
            count++;
        }
        if(knight.getHp() <= 0){
            System.out.println("악당 승리!!!!");
        }
        else{
            System.out.println("기사 승리!!!!");
        }
    }
}
