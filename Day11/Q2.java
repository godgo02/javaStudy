package Day11;

import java.util.Scanner;

/*
 * 문방구 - 주황색연필, 초록색연팔,노란색연필, 파란색연필 / 회색지우개, 빨간 지우개
 *         주황펜, 초록펜, 노랑펜, 파란펜
 *
 * A 학생 - 필통 - 색연필2, 지우개 1, 펜2
 * B 핵생 - 필통 - 색연필2, 지우개 1, 펜2
 *
 * 원하는 물건이 없으면 다시고르게 한다.
 * 색인 없는것을 말하면 다시고르게 한다.
 */
class ColorPencil{
    String color;
    ColorPencil(String color){
        this.color = color;
    }
}
class Eraser{
    String color;
    Eraser(String color){
        this.color = color;
    }
}
class ColorPen{
    String color;
    ColorPen(String color){
        this.color = color;
    }
}
class Philtong{
    ColorPencil cpc1;
    ColorPencil cpc2;
    Eraser e;
    ColorPen cp1;
    ColorPen cp2;
}
class Student{
    String name;
    Philtong p;
    Student(String name){
        this.name =name;
        p = new Philtong();
    }

    boolean checkPencil(){
        if(p.cpc1 == null || p.cpc2 == null){
            return true;
        }
        return false;
    }

    boolean checkEraser(){
        if(p.e == null){
            return true;
        }
        return  false;
    }
    boolean checkPen(){
        if(p.cp1 == null || p.cp2 == null){
            return true;
        }
        return false;
    }

    void philtongPrint(){
        System.out.println("======"+this.name+"구매 목록 ======");
        System.out.println("색연필 1 : "+p.cpc1.color);
        System.out.println("색연필 2 : "+p.cpc2.color);
        System.out.println("지우개 : "+p.e.color);
        System.out.println("칼라펜 1 : "+p.cp1.color);
        System.out.println("칼라펜 2 : "+p.cp2.color);

    }
}
class MunbangGu{
    ColorPencil[] cpc = new ColorPencil[4];
    Eraser[] e = new Eraser[2];
    ColorPen[] cp = new ColorPen[4];

    MunbangGu(){
        String[] color = {"주황색","초록색","노란색","파란색"};
        String[] color1 = {"회색","빨간색"};

        for(int i = 0;i<cpc.length;i++){ // 4개
            cpc[i] = new ColorPencil(color[i]);
            cp[i] = new ColorPen(color[i]);
        }
        for(int i = 0;i<e.length;i++){
            e[i] = new Eraser(color1[i]);
        }
    }
}
class Controller{
    //연필, 지우개, 펜을 사는 기능을 여기에 만든다.
    void buyPencil(MunbangGu m,Student s,String color){
        int i;
        for(i = 0;i<m.cpc.length;i++){
            if(m.cpc[i] != null) {
                if (m.cpc[i].color.equals(color)) {
                    if (s.p.cpc1 == null) {
                        s.p.cpc1 = m.cpc[i];
                    } else {
                        s.p.cpc2 = m.cpc[i];
                    }
                    m.cpc[i] = null;
                    System.out.println(s.name + "학생이 샀습니다.");
                    break;
                }
            }
        }

        if(i == m.cpc.length){
            System.out.println("벌써 팔렸습니다.");
        }
    }

    void buyEraser(MunbangGu m, Student s, String color){
        int i;
        for(i = 0;i<m.e.length;i++){
            if(m.e[i] != null){
                if(m.e[i].color.equals(color)){
                    s.p.e = m.e[i];
                    m.e[i] = null;
                    System.out.println(s.name+"학생이 샀습니다.");
                    break;
                }
            }
        }
        if(i == m.e.length){
            System.out.println("벌써 팔렸습니다.");
        }
    }

    void buyPen(MunbangGu m,Student s,String color){
        int i;
        for(i = 0;i<m.cp.length;i++){
            if(m.cp[i] != null) {
                if (m.cp[i].color.equals(color)) {
                    if (s.p.cp1 == null) {
                        s.p.cp1 = m.cp[i];
                    } else {
                        s.p.cp2 = m.cp[i];
                    }
                    m.cp[i] = null;
                    System.out.println(s.name + "학생이 샀습니다.");
                    break;
                }
            }
        }

        if(i == m.cp.length){
            System.out.println("벌써 팔렸습니다.");
        }
    }

}


public class Q2 {
    public static void main(String[] args) {
        // 입력 객체, 문방구, 학생 2명, Controller
        Scanner sc = new Scanner(System.in);
        MunbangGu m = new MunbangGu();
        Student a = new Student("A학생");
        Student b = new Student("B학생");
        Controller c = new Controller();

        //1.A학생 색연필 모두 고를때까지
        //반복을 해야하는 조건 : A학생 -> 필통 -> 색연필 변수중에 null 하나라도 있으면
        //반복을 탈출해야 하는 조건 : A학생 -> 필통 -> 색연필 변수에 모두 객체가 있으면
        while(a.checkPencil()){
            System.out.print(a.name+"색연필 색깔을 골라주세요 : ");
            String color = sc.next();
            if(color.equals("주황색") || color.equals("초록색") ||
                color.equals("노란색") || color.equals("파란색")){
                //문방구 색연필객체  -> A학생 필통 색연필 변수로 이동
                c.buyPencil(m,a,color);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        //2.B학생 색연필 모두 고를때까지
        while(b.checkPencil()){
            System.out.print(b.name+"색연필 색깔을 골라주세요 : ");
            String color = sc.next();
            if(color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")){
                //문방구 색연필객체  -> A학생 필통 색연필 변수로 이동
                c.buyPencil(m,b,color);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        //3.A학생 지우개 모두 고를때까지
        while(a.checkEraser()){
            System.out.println(a.name+"지우개 색깔을 골라주세요 : ");
            String color = sc.next();
            if(color.equals("빨간색") || color.equals("회색")){
                c.buyEraser(m,a,color);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        //4.B학생 지우개 모두 고를때까지
        while(b.checkEraser()){
            System.out.println(b.name+"지우개 색깔을 골라주세요 : ");
            String color = sc.next();
            if(color.equals("빨간색") || color.equals("회색")){
                c.buyEraser(m,b,color);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        //5.A학생 칼라펜 모두 고를때까지
        while(a.checkPen()){
            System.out.print(a.name+"칼라펜 색깔을 골라주세요 : ");
            String color = sc.next();
            if(color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")){
                //문방구 칼라펜객체  -> A학생 필통 칼라펜 변수로 이동
                c.buyPen(m,a,color);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        //6.B학생 칼라펜 모두 고를때까지
        while(b.checkPen()){
            System.out.print(b.name+"칼라펜 색깔을 골라주세요 : ");
            String color = sc.next();
            if(color.equals("주황색") || color.equals("초록색") ||
                    color.equals("노란색") || color.equals("파란색")){
                //문방구 칼라펜객체  -> A학생 필통 칼라펜 변수로 이동
                c.buyPen(m,b,color);
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        //--학생마다 구매한 학용품 출력
        a.philtongPrint();
        b.philtongPrint();
    }
}
