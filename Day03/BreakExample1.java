package Day03;

public class BreakExample1 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        //좋은 for문 X
        /*
        for(num = 0; ;num++){
            sum += num;
            if(sum >=100){
                break;
            }
        }
         */
        while(true){
            sum += num;
            if(sum >=100){
                break;
            }
            num++;
        }

        System.out.println("num : "+num);
        System.out.println("sum : "+sum);
    }
}
