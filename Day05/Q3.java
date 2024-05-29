package Day05;

/*
랜덤값 입력을 받고
중복이면 랜덤값을 다시 받습니다.
 */

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        //int ran1, ran2, ran3;
        int ran1 = r.nextInt(9)+1;
        int ran2 = r.nextInt(9)+1;
        int ran3 = r.nextInt(9)+1;
        /*
        while(true){
            ran1 = r.nextInt(9)+1;
            ran2 = r.nextInt(9)+1;
            ran3 = r.nextInt(9)+1;
            if(ran1 != ran2 && ran2 != ran3 && ran1 != ran3){
                break;
            }
        }
         */
        while(ran1 == ran2 || ran2 == ran3 || ran1 == ran3) {
            ran1 = r.nextInt(9) + 1;
            ran2 = r.nextInt(9) + 1;
            ran3 = r.nextInt(9) + 1;
        }
        System.out.println(ran1+","+ran2+","+ran3);
    }
}
