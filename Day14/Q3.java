package Day14;

import java.util.Random;

//먹이 필요 X
//상어
//먹이 배열, 이름 - 속성
//기능 - 먹이 먹는 기능 얼마나 먹었는지 확인하는 메소드 출력메소드
class FishFeed{}

class FireShark{
    String name;
    FishFeed[] ff;

    FireShark(String name, int max){ //max : 8 ~ 14
        this.name = name;
        ff = new FishFeed[max];
    }

    void eat(FishFeed f){ // 먹이 한마리씩 먹기
        //정수 찾는 변수 선언
        int count = 0;
        //1. null인 인덱스 정수 찾기
        while(ff[count] != null){
            count++;
        }
        //2. null인 배열에 FishFeed 대입
        ff[count] = f;
    }
    //상어 배에 진짜 먹이가 찾는지 카운트 해주는 메소드
    int eat(){
        //카운트변수 선언
        int count = 0;
        //count가 ff배열 길이보다 작고 ff배열 인덱스 count의 값이 null아니면 반복
        while(count<ff.length && ff[count] != null){
            count++;
        }
        return count;
    }


    void print(){
        int temp = eat();
        System.out.println(this.name+"상어는 "+temp+"마리 만큼 먹었습니다.");
    }
}

public class Q3 {
    public static void main(String[] args) {
        //1. 먹이 100배열
        FishFeed[] ff = new FishFeed[100];
        //2. 랜덤 객체 생성
        Random r = new Random();
        //3. 물고기 카운팅 변수
        int fishCount = 0;
        //먹이 실제 객체 생성
        for(int i = 0;i<ff.length;i++){
            ff[i] = new FishFeed();
        }
        //상어 5마리 배열
        FireShark[] fs = new FireShark[5];
        //상어 5머리 객체 생성
        for(int i = 0;i<fs.length;i++){
            fs[i] = new FireShark((i+1)+"",r.nextInt(7)+8);
        }
        //상어 먹이배열 만큼 먹이 먹기
        for(int i = 0;i<fs.length;i++){
            for(int j = 0; j< fs[i].ff.length;j++){
                fs[i].eat(ff[fishCount]);
                ff[fishCount] = null;
                fishCount++;
            }
        }
        //출력
        for(int i =0;i<fs.length;i++){
            fs[i].print();
        }
    }
}
