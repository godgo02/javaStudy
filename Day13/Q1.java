package Day13;

import java.util.Random;
import java.util.Scanner;

//낚시게임
//물고기 필요 X
class Fish{}
//호수
class Hosu {
/*
1. 물고기 5 X 5 배열 물고기 객체 3마리 있고 나머지는 모두 null
2. 호수 생성시 -> 물고기 3마리 랜덤하게 배치 (생성자)
3. 물고기를 주는 기능을 하는 메소드
4. 물고기 넘어가면 -> null로 변경해주는 기능을 하는 메소드
5. 호수에 물고기 5x5 배열을 출력해주는 메소드 -> 캐스팅 하기 전 출력 / 캐스팅 하고 난 후 출력
5-1 메소드 오버로딩을 사용해서 출력 만들겠습니다.
 */
    //1번
    Fish[][] fList = new Fish[5][5];
    //2.
    Hosu(){
        Random r = new Random();
        for(int i = 0;i<3;i++){
            int y = r.nextInt(5);
            int x = r.nextInt(5);

            if(fList[y][x] != null){
                i--;
            }
            else{
                fList[y][x] = new Fish();
            }
        }
    }
    //3.
    Fish giveFish(int[] position){
        return fList[position[0]][position[1]];
    }
    //4.
    void nullChange(int[] postion){
        fList[postion[0]][postion[1]] = null;
    }
    //5-1 캐스팅 없는 프린트
    void printHosu(){
        for(int i = 0;i<fList.length;i++){
            for(int j = 0;j<fList[i].length;j++){
                if(fList[i][j] == null){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }
    //5-2. 캐스팅된 프린트 호수
    void printHosu(int[] postion){
        for(int i = 0;i<fList.length;i++){
            for(int j = 0;j<fList[i].length;j++){
                if(postion[0] == i && postion[1] == j){
                    System.out.print("X");
                }
                else if(fList[i][j] == null){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }
}
class Fisher {
    //낚시꾼
/*
1. 캐스팅 좌표 값 변수 가지고 있어야 합니다. y,x => 배열로 사용 가능
2. 물고기를 담을 어항 3개 -> 배열 Fish[]
3. 캐스팅 -> 생성자
4. 물고기 받는 기능을 하는 메소드 -> 호수 물고기를 주면 받아서 어항에 넣는 기능 구현
5. 낚시대 이동을 하는 기능을 구현 하는 메소드 -> y 1증가 또는 1감소 x 1증가 또는 1감소
   범위 벗어나면 이동을 못하는 기능도 추가
6. 프로그램 종료를 위한 어항 검사 기능을 구현
 */
    //1.
    int[] position = new int[2];
    //2.
    Fish[] bowl = new Fish[3];
    Scanner sc = new Scanner(System.in);
    //3. 캐스팅 생성자
    Fisher(){
        while (true){
            System.out.print("행 입력 : ");
            position[0] = sc.nextInt();
            System.out.print("열 입력 : ");
            position[1] = sc.nextInt();

            if(position[0] > -1 && position[0] < 5
                    && position[1] > -1 && position[1] < 5){
                break;
            }
        }
    }
    //4.
    void reciveFish(Fish f){
        if(f != null){
            System.out.println("물고기 잡았습니다.");
        }

        for(int i = 0;i< bowl.length;i++){
            if(bowl[i] == null){
                bowl[i] = f;
                break;
            }
        }
    }
    //5.
    void fishMove(){
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num = sc.nextInt();
        if(num == 1){
            position[0]--;
            if(position[0] < 0){
                System.out.println("더이상 위로 움직일 수 없습니다.");
                position[0] = 0;
            }
        }
        else if(num == 2){
            position[0]++;
            if(position[0] > 4){
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                position[0] = 4;
            }
        }
        else if(num == 3){
            position[1]--;
            if(position[1] < 0){
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                position[1] = 0;
            }
        }
        else if(num == 4){
            position[1]++;
            if(position[1] > 4){
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                position[1] = 4;
            }
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }
    //6.
    boolean checkFish(){
        for(int i =0;i< bowl.length;i++){
            if(bowl[i] == null){
                return true;
            }
        }
        return false;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Hosu h = new Hosu(); // 물고기 3마리 배치
        h.printHosu();
        Fisher f = new Fisher(); //캐스팅
        h.printHosu(f.position);
        /*
        Fish fish =h.giveFish(f.position);
        f.reciveFish(fish);
        h.nullChange(f.position);
         */
        f.reciveFish(h.giveFish(f.position));
        h.nullChange(f.position);
        while(f.checkFish()){
            f.fishMove();
            f.reciveFish(h.giveFish(f.position));
            h.nullChange(f.position);
            h.printHosu(f.position);
        }
        System.out.println("물고기를 모두 잡았습니다.");
    }
}
