package Day17;

import java.util.Random;
import java.util.Scanner;

class Water{
    private int amount;
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class Human{
    private Water[] w;
    public Water[] getW() {
        return w;
    }
    public void setW(Water[] w) {
        this.w = w;
    }
    int totalWaterAmount(){
       int result = 0;
       for(int i = 0;i<w.length;i++){
           result += w[i].getAmount();
       }
       return result;
    }
}
public class Q1 {
    public static void main(String[] args) {
        //1. 물객체
        Water[][] w = new Water[3][10];
        //2. 사람객체
        Human[] h = new Human[3];
        //3.랜덤객체, 입력객체
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int maxWater = 0; // 물이 제일 많은 사람의 값

        for(int i = 0;i< w.length;i++){
            for(int j = 0;j<w[i].length;j++) {
                w[i][j] = new Water();
                w[i][j].setAmount(r.nextInt(8)+1);
            }
        }

        for(int i = 0;i< h.length;i++){
            h[i] = new Human();
            h[i].setW(w[i]);
            System.out.println((i+1)+"번째 사람" + h[i].totalWaterAmount());
        }

        maxWater = h[0].totalWaterAmount();
        for(int i = 0;i< h.length;i++){
            if(maxWater < h[i].totalWaterAmount()){
                maxWater = h[i].totalWaterAmount();
            }
        }
/////////////////게임 실행///////////////////////////////////////////
        while (true){
            System.out.print("물을 제일 많이 먹은 사람은 ?(1,2,3) :  ");
            int num = sc.nextInt();
            if(num == 1 || num == 2 || num ==3){
                if(maxWater == h[num-1].totalWaterAmount()){
                    System.out.println(num+"번사람이 물을 제일 많이 먹었습니다.");
                    break;
                }
                else{
                    System.out.println("틀렸습니다.");
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
