package Day04;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random r = new Random();
        char ch = 'A';
        for(int i = 0;i<10;i++){
            int num = r.nextInt(26);
            System.out.print((char)(ch + num));
        }
        System.out.println();
        for(int i = 0;i<10;i++){
            System.out.print((char)('A' + r.nextInt(26)));
        }
    }
}
