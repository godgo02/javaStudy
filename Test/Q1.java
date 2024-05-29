package Test;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        char ch = 'A';

for (int i = 0; i <10; i++){
    int ran = r.nextInt(26);
    System.out.print((char)(ch+ran));
}

        }
    }
