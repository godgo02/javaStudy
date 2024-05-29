package Day06;

import java.util.Random;

public class Q3_1 {
    public static void main(String[] args) {
        //1. 랜덤 객체 생성
        Random r = new Random();
        //2. 배열 생성
        int[] array = new int[10];
        int max = 0;
        //3. 배열에 랜덤과 넣기
        for(int i = 0;i<array.length;i++){
            array[i] = r.nextInt(11); //0~10까지 랜덤으로 대입
            System.out.print(array[i]+" ");
            //4. 최대값 구하기
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println();

        System.out.println("max : "+max);
        //5. 최대값이 있는 배열 인덱스 출력
        System.out.print("index : ");
        for(int i = 0;i<array.length;i++){
            if(array[i] == max){
                System.out.print(i+" ");
            }
        }
    }
}
