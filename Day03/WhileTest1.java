package Day03;

public class WhileTest1 {
    public static void main(String[] args) {
        // 1~10까지 더한 결과값 출력
        int num = 1; // 1~10까지 값을 증가 시켜서 반복을 하게 하는 조건
        int result = 0; // 1~10까지 더한 결과 값
        //반복문 while문
        while(num<=10){
            //명령문
            result += num; // result = result + num;
            num++;
        }

        System.out.println("1부터 10까지 합은 "+result+"입니다.");
    }
}
