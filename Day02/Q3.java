package Day02;

/*
String id = “korea”
String passwd = “1234”


Id 입력 : XXXX
패스워드 입력 : XXXXX

Id와 패스워드가 맞으면  -> “환영합니다. Korea님”

Id와 또는 패스워드가 틀리면
  id가 틀린경우 패스워드 맞고 -> id가 올바르지 않습니다.
  id가 맞고 패스워드가 틀린경우 -> 패스워드가 올바르지 않습니다.
  id 패스워드 모두 틀린경우 -> id와 패스워드가 올바르지 않습니다.


 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 변수 선언과 동시에 초기화
        String id = "korea"; //아이디 코리아 선언
        String passwd = "1234"; //비번 1234 선언
        //2. 입력
        System.out.print("id 입력 : ");
        String inputId = sc.next(); // id 입력

        System.out.print("패스워드 입력 : ");
        String inputPW = sc.next(); // pw 입력
        //3. 입력과 변수를 비교해서 출력
        //3-1 모두 맞는경우
        if(id.equals(inputId) && passwd.equals(inputPW)){ // .equals를 이용해 선언한 id와 입력한 id 비교 / 그리고 / 패스워드 도 비교
            System.out.println("환영합니다. korea님");
        }
        //3-2 id X 패스워드 맞는 경우
        else if(!id.equals(inputId) && passwd.equals(inputPW)){ //아이디가 다를 때
            System.out.println("id가 올바르지 않습니다.");
        }
        //3-3 id O 패스워드 X
        else if(id.equals(inputId) && !passwd.equals(inputPW)){ // 비밀번호가 다를 때
            System.out.println("패스워드가 올바르지 않습니다.");
        }
        //3-4 id X 패스워드 X
        else{
            System.out.println("id와 패스워드가 올바르지 않습니다."); //둘다 틀린 경우
        }
    }
}
