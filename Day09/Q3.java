package Day09;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

    static int fishRandomMake(int[][] hosu, Random r, int fishCount){
        for(int i = 0;i<3;i++){
            int fy = r.nextInt(5); //행 좌표 랜덤
            int fx = r.nextInt(5); //열 좌표 랜덤

            if(hosu[fy][fx] == 0){
                hosu[fy][fx] = 1; // 호수에 물고기 배치
                fishCount++;
            }
            else{
                i--;
            }
        }
        return fishCount;
    }

    static void noCastingPrint(int[][] hosu){
        for(int i = 0;i<hosu.length;i++){ //행
            for(int j = 0;j<hosu[i].length;j++){
                if(hosu[i][j] == 0){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }

    static void castingFisher(int[] fisher,Scanner sc){
        while (true){
            System.out.println("행 입력 : ");
            fisher[0] = sc.nextInt();
            System.out.println("열 입력 : ");
            fisher[1] = sc.nextInt();
            if(fisher[0]>-1 && fisher[0] < 5 && fisher[1] > -1 && fisher[1] <5){
                break;
            }
        }
        System.out.println("y: "+fisher[0]+" x: "+fisher[1]);
    }

    static int checkFish(int[][] hosu, int[] fisher,int fishCount){
        if(hosu[fisher[0]][fisher[1]] == 1){
            System.out.println("물고기를 잡았습니다.");
            hosu[fisher[0]][fisher[1]] = 0;
            fishCount--;
        }
        return fishCount;
    }

    static void castingPrint(int[][] hosu, int[] fisher){
        for(int i = 0;i<hosu.length;i++){ //행
            for(int j = 0;j<hosu[i].length;j++){
                if(i == fisher[0] && j == fisher[1]){
                    System.out.print("X");
                }
                else if(hosu[i][j] == 0){
                    System.out.print("○");
                }
                else{
                    System.out.print("●");
                }
            }
            System.out.println();
        }
    }

    static int fisherMoveInput(Scanner sc){
        System.out.print("1.위 2.아래 3.왼쪽 4.오른쪽 : ");
        int num = sc.nextInt();
        return num;
        //        6. 캐스팅된 좌표를 위 아래 왼쪽 오른쪽으로 이동 실행
    }

    static void fisherMove(int[] fisher, int num){
        if(num == 1){
            fisher[0]--;
            if(fisher[0]<0){
                System.out.println("더이상 위로 움직일 수 없습니다.");
                fisher[0] = 0;
            }
            //        6-1 이동할 수 있는지 여부를 확인
            //        6-1-1 이동 X 이동을 못하는 걸 알려준다.
            //        6-1-2 이동할 수 있으면 이동을 합니다.
        }
        else if(num == 2){
            fisher[0]++;
            if(fisher[0]>4){
                System.out.println("더이상 아래로 움직일 수 없습니다.");
                fisher[0] = 4;
            }
            //        6-1 이동할 수 있는지 여부를 확인
            //        6-1-1 이동 X 이동을 못하는 걸 알려준다.
            //        6-1-2 이동할 수 있으면 이동을 합니다.
        }
        else if(num == 3){
            fisher[1]--;
            if(fisher[1]<0){
                System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
                fisher[1] = 0;
            }
            //        6-1 이동할 수 있는지 여부를 확인
            //        6-1-1 이동 X 이동을 못하는 걸 알려준다.
            //        6-1-2 이동할 수 있으면 이동을 합니다.
        }
        else if(num == 4){
            fisher[1]++;
            if(fisher[1]>4){
                System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
                fisher[1] = 4;
            }
            //        6-1 이동할 수 있는지 여부를 확인
            //        6-1-1 이동 X 이동을 못하는 걸 알려준다.
            //        6-1-2 이동할 수 있으면 이동을 합니다.
        }
        else{
            System.out.println("잘못된 입력입니다.");
        }
    }

    static void start(){
        //0. 호수 만들기[5][5], 입력객체생성 , Random 객체 생성, 캐스팅 좌표 변수 2개, 물고기 카운트 변수
        int[][] hosu = new int[5][5]; // 초기화 0 -> 물고기 1
        Scanner sc = new Scanner(System.in);
        Random r= new Random();
        //int y; // 행
        //int x; // 열
        int[] fisher = new int[2];
        int fishCount = 0; // 0-> 밑에 물고기 배치할 때 증가 시켜서 3으로 변경
        //1. 호수에 물고기 배치 3마리
        fishCount=fishRandomMake(hosu,r,fishCount);
        //2. 물고기 배치된 호수 출력
        noCastingPrint(hosu);
        //2. 캐스팅
        castingFisher(fisher,sc);
        //3. 물고기 잡은 여부 확인
        fishCount=checkFish(hosu,fisher,fishCount);
        //4. 물고기, 캐스팅된 호수 출력
        castingPrint(hosu,fisher);
        //------------------------------------
        //        무한루프
        while(fishCount > 0){
            //        5. 1.위 2.아래 3.왼쪽 4.오른쪽
            int num = fisherMoveInput(sc);
            fisherMove(fisher,num);

            //        6-1-2-1 물고기 있는지 여부 확인
            // -> 있으면 물기고 카운트 변화주고 캐스팅 좌표 이동 호수에 물고기 없는 값으로 치환
            // -> 없으면 캐스팅 좌표 이동
            fishCount=checkFish(hosu,fisher,fishCount);

            castingPrint(hosu,fisher);
            //        5번으로 이동
        }
        //        --------------------------------------
        //                물고기  모두 잡았습니다.
        System.out.println("물고기를 모두 잡았습니다.");
        System.out.println("축하합니다.");
    }

    public static void main(String[] args) {
       start();
    }
}
