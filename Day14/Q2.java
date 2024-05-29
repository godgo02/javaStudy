package Day14;

class Dino{
    int height;
    int weight;

    void talk(){
        System.out.println("나는 공룡이다.");
    }

}
class Tyranno extends Dino{
    Tyranno(){
        height = 2;
        weight = 1;
    }
    void talk(){
        System.out.println("나는 키 "+height+"m 몸무게 "+
                weight+"인 티라노사우르스다.");
    }
}
class Tricera extends Dino{
    Tricera(){
        height = 3;
        weight = 2;
    }
    void talk(){
        System.out.println("나는 키 "+height+"m 몸무게 "+
                weight+"인 티리케라톱스다.");
    }
}
class Bugyung extends Dino{
    Bugyung(){
        height = 5;
        weight = 3;
    }
    void talk(){
        System.out.println("나는 키 "+height+"m 몸무게 "+
                weight+"인 부경사우르스다.");
    }
}


public class Q2 {
    public static void main(String[] args) {
        int a; // 부모
        a = 10; // 자식
        Tyranno tyranno = new Tyranno();
        Tricera tricera = new Tricera();
        Bugyung bugyung = new Bugyung();

        tyranno.talk();
        tricera.talk();
        bugyung.talk();

        Dino d1 = new Tyranno();
        d1.talk();
        Dino d2 = new Tricera();
        d2.talk();
        Dino d3 = new Bugyung();
        d3.talk();
    }
}
