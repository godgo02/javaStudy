package Day02;

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1); // A
        System.out.println((int)ch1); // 형변환 char -> int 65

        char ch2 = 66;
        System.out.println(ch2); // B

        int ch3 = 67;
        System.out.println(ch3); // 67
        System.out.println((char)ch3); // 형변환 int -> char C

        char kor = '각';
        System.out.println((int) kor);

        char t1 = 65; //A
        //char t2 = -65; // 코드표 음수 X

    }
}
