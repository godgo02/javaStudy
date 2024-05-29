package Day18;

import java.util.Random;

//추상황 클래스 Animal
abstract class Animal{
    //접근제한자 protected(상속) 자식만 접근 가능
    //Random 객체를 생성해서 r 변수에 대입
    protected Random r = new Random();
    //접근제한자 private 나만 사용 가능 외부에서 접근 불가
    //자료형 String인 name 변수 선언
    private String name;
    //접근제한자 private 나만 사용 가능 외부에서 접근 불가
    //자료형 String인 color 변수 선언
    private String color;
    //Animal 클래스의 생성자 -> 매개변수 X
    Animal(){
        //String 1차원 배열 colors 변수 선언 후 데이터 초기 값 세팅
        String[] colors = {"갈색","검은색","흰색","노란색","점박이"};
        //멤버변수 color에 colors 배열에 있는 데이터 중에 랜덤으로 하나를 골라서 추출 후 대입
        color = colors[r.nextInt(colors.length)];
    }
    //추상화 메소드 안주고 안받고 print이름의 메소드 선언
    abstract void print();
    //멤버변수 name 값을 얻을 수 있는 메소드
    //2번 형태 주고 안받고
    public String getName() {
        return name;
    }
    //멤버변수 name의 값을 Set 할 수 있는 메소드
    //3번 형태 안주고 받고
    public void setName(String name) {
        this.name = name;
    }
    //멤버변수 color 값을 얻을 수 있는 메소드
    //2번 형태 주고 안받고
    public String getColor() {
        return color;
    }
    //멤버변수 color 값을 Set 할 수 있는 메소드
    //3번 형태 안주고 받고
    public void setColor(String color) {
        this.color = color;
    }
}

class Dog extends Animal{
    Dog(){
        String[] names = {"말티즈","요크셔테리어","포메라니안","시바","웰시코기"};
        setName(names[r.nextInt(names.length)]);
    }

    //부모가 선언한 추상화 메소드 print()를 오버라이딩 함
    @Override
    void print() {
        //get메소드를 이용해서 출력함
        System.out.println(getColor()+"의 "+getName()+"은 짖는다.");
    }
}

class Cat extends Animal{
    Cat(){
        String[] names = {"먼치킨","스핑크스","뱅갈","샴","폴드"};
        setName(names[r.nextInt(names.length)]);
    }

    @Override
    void print() {
        System.out.println(getColor()+"의 "+getName()+"은 야옹한다.");
    }
}
class Bird extends Animal{
    Bird(){
        String[] names = {"앵무새","참새","닭","까마귀","비둘기"};
        setName(names[r.nextInt(names.length)]);
    }

    @Override
    void print() {
        System.out.println(getColor()+"의 "+getName()+"은 날아다닌다.");
    }
}
public class Q2 {
    public static void main(String[] args) {
        //Animal배열 크기 6인 배열 객체를 생성하고 woori 변수에 대입
        Animal[] woori = new Animal[6];
        //객체생성
        //woori배열 크기만큼 반복
        for(int i = 0;i< woori.length;i++){
            //변수 i가 3보다 작으면 실행
            if(i<3){
                woori[i] = new Dog();//Dog객체를 생성해서 woori i번째 배열에 대입
                //woori는 Animal 클래스 이지만 Dog가 Animal의 자식이기 때문에 대입이 가능함
            }
            //변수 i가 5보다 작으면 실행
            //위에 3보다 작으면 실행하는 조건이 있기 때문에
            // 3과 4만 실행을 하게 됨
            else if(i<5){
                woori[i] = new Cat(); //Cat 객체를 생성해서 woori i 번째 배열에 대입
            }
            //위 조건이 모두 거짓이면 실행
            else{
                woori[i] = new Bird();//Bird 객체를 생성해서 woori i 번째 배열에 대입
            }
        }
        // 출력
        for(int i = 0;i< woori.length;i++){
            woori[i].print(); //woori i번째 객체의 print메소드 호출
        }
    }
}
