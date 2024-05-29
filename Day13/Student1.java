package Day13;

public class Student1 {
    public static int serialNum = 1000; // 클래스 변수
    public int studentID; //멤버 변수
    public String studentName;
    public int grade;
    public String address;

    public Student1(){
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName(){ //인스턴스 메소드
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum(){ //클래스 메소드
        return serialNum;
    }
    public static void setSerialNum(int serialNum){
        Student1.serialNum = serialNum;
    }
}
