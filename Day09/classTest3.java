package Day09;

class Student1{
    int studentID;
    String studentName;
    int grade;
    String address;

    String getStudentName(){
        return studentName;
    }
}

public class classTest3 {
    public static void main(String[] args) {
        Student1 studentAhn = new Student1();
        studentAhn.studentName = "안연수";
        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
