package Day18;

import java.util.ArrayList;
import java.util.Scanner;

class PhoneData{
    String name;
    String telNumber;
    String address;
    int age;

    PhoneData(String name, String telNumber, String address, int age){
        this.name = name;
        this.telNumber = telNumber;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : "+name+"\n전화번호 : "+telNumber+"\n주소 : "+address+"\n나이 : "+age+"세";
    }
}

public class Q1 {
    public static void main(String[] args) {
        //1. List 필요 -> Data(PhoneData)
        ArrayList<PhoneData> phoneDataArrayList = new ArrayList<>();
        //2. 입력 Scanner 객체
        Scanner sc = new Scanner(System.in);
        ///////////////////////////////////////////////
        //종료까지 전화번호 저장, 삭제, 전체출력 이름 검색
        // 1, 2, 3, 4, 5, 이 이외의 숫자 입력시 잘못된 입력입니다.
        // 5입력시 프로그램 종료
        while(true){
            System.out.print("1.추가 2.삭제 3.전체출력 4.이름검색 5.종료 : ");
            int num = sc.nextInt();
            if(num == 1){
                System.out.print("이름 : ");
                String name = sc.next();
                System.out.print("전화번호 : ");
                String telNumber = sc.next();
                sc.nextLine();
                System.out.print("주소 : ");
                String address = sc.nextLine();
                System.out.print("나이 : ");
                int age = sc.nextInt();
                phoneDataArrayList.add(new PhoneData(name,telNumber,address,age));
            }
            else if(num == 2){
                System.out.println("이름 : ");
                String name = sc.next();
                boolean check = true;
                for(int i =  phoneDataArrayList.size()-1;i>=0 ;i--){
                    if(phoneDataArrayList.get(i).name.equals(name)){
                        phoneDataArrayList.remove(i);
                        System.out.println(name+"을 삭제 했습니다.");
                        check =false;
                    }
                }
                if(check){
                    System.out.println("전화번호부에 없습니다.");
                }
            }
            else if(num == 3){
                for(int i = 0;i< phoneDataArrayList.size();i++){
                    System.out.println(phoneDataArrayList.get(i));
                }
            }
            else if(num == 4){
                System.out.println("이름 : ");
                String name = sc.next();
                boolean check = true;
                for(int i = 0;i< phoneDataArrayList.size();i++){
                    if(phoneDataArrayList.get(i).name.equals(name)){
                        //System.out.println(phoneDataArrayList.get(i).name+","+phoneDataArrayList.get(i).telNumber+
                        //        ","+phoneDataArrayList.get(i).address+","+phoneDataArrayList.get(i).age);
                        System.out.println(phoneDataArrayList.get(i));
                        check =false;
                    }
                }
                if(check){
                    System.out.println("전화번호부에 없습니다.");
                }
            }
            else if(num == 5){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
