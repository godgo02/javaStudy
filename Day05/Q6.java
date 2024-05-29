package Day05;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] com = new int[6];
        for(int i = 0; i< 6; i++){
            com[i] = r.nextInt(45)+1;
            for(int j = 0;j<i;j++){
                if(com[i] == com[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i = 0;i<6;i++){
            System.out.print(com[i]+" ");
        }
    }
}
