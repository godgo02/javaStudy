package Day03;

public class ForExample1 {
    public static void main(String[] args) {
        int i ;
        int sum;
        // 초기화문에 보시면 하나가 아니라 2개를 초기화
        for(i = 1, sum = 0;i<=10;i++){
            sum += i;
        }
        System.out.println(i);
        // for문 초기화문에서 선언된 변수는 for문 안에서만 사용이 가능합니다.
        for(int j = 0;j<=10;j++){

        }
        //System.out.println(j);
        System.out.println("1부터 10까지 합은 "+sum+"입니다.");
    }
}
