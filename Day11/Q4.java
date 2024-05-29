package Day11;

import java.util.Scanner;

public class Q4 {
    static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        return sc.next();
    }

    static String makeResult(String str){
        //1122335*#66
        //1.카운팅
        char ch = str.charAt(0); // '1'
        int count = 0;
        String result = "";
        for(int i = 0;i<str.length();i++){
            if(ch == str.charAt(i)){
                count++;
            }
            else{
                //System.out.println(count);
                //카운팅, ch문자 연산 -> 111 C  1 (A,B,C)
                result+=makeChar(ch,count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        //System.out.println(count);
        result += makeChar(ch,count);
        return result;
    }
    static char makeChar(char ch, int count){
        char result;
        char[][] key ={
                {'A','B','C'}, // 1
                {'D','E','F'}, // 2
                {'G','H','I'}, // 3
                {'J','K','L'}, // 4
                {'M','N','O'}, // 5
                {'P','Q','R'}, // 6
                {'S','T','U'}, // 7
                {'V','W','X'}, // 8
                {'Y'}, // 9
                {'*'},
                {'Z'}, // 0
                {'#'}
        };

        if(ch == '9'){
            result = key[8][0];
        }
        else if(ch == '*'){
            result = key[9][0];
        }
        else if(ch == '0'){
            result = key[10][0];
        }
        else if(ch == '#'){
            result = key[11][0];
        }
        else{
            // count = 2
            count = (count - 1) % 3;
            // ch = '1'; // 1?
            //'1' - '0'
            result = key[(ch-'0')-1][count];
        }
        return result;
    }

    static void ouput(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        //String str = input();
        //String result =makeResult(str);
        //ouput(result);
        ouput(makeResult(input()));
        //1. 입력
        //2. 연산
        //3.출력
    }
}
