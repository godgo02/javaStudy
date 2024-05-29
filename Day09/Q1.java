package Day09;

import java.util.Random;
import java.util.Scanner;

//1. 랜덤값 생성
//2. 입력
//3. 입력과 랜덤값 비교
//4. 출력

public class Q1 {
    static void makeRandom(int[] com,Random r){
        for(int i = 0;i<com.length;i++){
            com[i] = r.nextInt(9)+1;
            for(int j = 0; j<i;j++){
                if(com[i] == com[j]){
                    i--;
                    break;
                }
            }
        }
    }
    static void randomPrint(int[] com){
        System.out.println("com[0] :" + com[0]+", com[1] : "+com[1]+", com[2] : "+com[2]);
    }

    static int[] inputUser(Scanner sc){
        int[] user = new int[3];
        for(int i = 0;i<user.length;i++){
            System.out.print("숫자 "+(i+1)+" : ");
            user[i] = sc.nextInt();
            //1~9 올바른지
            if(user[i]<1 || user[i]>9){
                i--;
                continue;
            }
            //중복이 없는지
            for(int j = 0; j<i;j++){
                if(user[i] == user[j]){
                    i--;
                    break;
                }
            }
        }
        return user;
    }

    static int[] checkSB(int[] user, int[] com){
        int[] result = new int[2];
        for(int i = 0;i<user.length;i++){
            for(int j = 0;j<com.length;j++){
                if(user[i] == com[j]){ //strike or ball
                    if(i == j){
                        result[0]++;
                    }
                    else{
                        result[1]++;
                    }
                }
            }
        }
        return result;
    }

    static boolean resultPrint(int[] result){
        if(result[0] == 3){
            System.out.println("홈런입니다.");
            return false;
        }
        else if(result[0] == 0 && result[1] == 0){
            System.out.println("Out입니다.");
        }
        else{
            System.out.println("strike : "+result[0] +", ball : "+result[1]);
        }
        return true;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //1. 랜덤값 중복되지 않게 1~9 3개 받기
        int[] com = new int[3];
        //int[] result = new int[2];
        boolean check = true;
        makeRandom(com,r); // Call by reference 때문에 리턴을 할 필요 X
        randomPrint(com);
        //=============================================================

        //3. Com 숫자와 User 숫자를 비교해서 Strike Ball을 알려줍니다.
        // -> out(아무것도 맞는게 없을 때, 홈런은 자리와 숫자 모두 맞추는 경우)
        //while(result[0] < 3)
        while(check){
            //2. 사용자 3개의 숫자 입력 -> 1~9사이에 값과 중복되지 않는 숫자 입력
            int[] user = inputUser(sc);
            // strike ball 체크
            //result = checkSB(user,com);
            int[] result = checkSB(user,com);
            // 출력
            //resultPrint(result);
            check=resultPrint(result);
        }
    }
}
