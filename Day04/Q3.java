package Day04;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // "*" " "
        // *****
        // *****
        // *****
        // *****
        // *****
        //1
        for(int j = 0;j<5;j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*
        //**
        //***
        //****
        //*****
        /*
        for(int i = 0;i<=0;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=1;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=2;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=3;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0;i<=4;i++){
            System.out.print("*");
        }
         */
        // i = 1
        // j = 0 1
        //2.
        for(int i = 0;i<5;i++){// 행 0 1 2 3 4
            for(int j = 0;j<5;j++){
                if(j<=i){ // j  0 / j 0 1
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i = 0;i<5;i++){// 행 0 1 2 3 4
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //3.
        for(int i = 0;i<5;i++){ // 0 1 2 3 4
            for(int j = 4;j>=0;j--){ // 4 3 2 1 0
                if(i < j){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        //4.
        for(int i = 0;i<5;i++){ // 0 1 2 3 4
            for(int j = 4;j>=0;j--){ // 4 3 2 1 0
                if(i < j){
                    System.out.print(" ");
                }
                else{
                    //        0           0 0
                    //      0 1 2         1 2
                    //    0 1 2 3 4       2 4
                    //  0 1 2 3 4 5 6     3 6
                    // 0 1 2 3 4 5 6 7 8  4 8
                    for(int k = 0;k<=i*2;k++){
                        System.out.print("*");
                    }
                    break;
                }
            }
            System.out.println();
        }
        //4-1
        for(int i = 0;i<5;i++) { // 0 1 2 3 4
            //스페이스 반복문
            for(int j = 0;j<4-i;j++){
                System.out.print(" ");
            }
            //별반복문
            for(int k = 0;k<=i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //5.
        //  *
        // ***
        //*****
        //X***
        //xx*
        for(int i = 0;i<3;i++) { // 0 1 2 3 4
            //스페이스 반복문
            for(int j = 0;j<2-i;j++){
                System.out.print(" ");
            }
            //별반복문
            for(int k = 0;k<=i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 3;k-(i*2) > 0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0;i<6;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 7;k-(i*2) > 0;k--){  //홀수
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
