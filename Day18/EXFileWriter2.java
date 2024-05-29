package Day18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EXFileWriter2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("파일명을 입력해주세요 : ");
        String s = sc.next();
        File file = new File(s);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true)); //true 이어쓰기 false 덮어쓰기
        bufferedWriter.write("안녕하세요.");
        bufferedWriter.newLine();
        bufferedWriter.write("잘가세요.");

        bufferedWriter.flush();//실제로 파일에 쓰게 됩니다.
        bufferedWriter.close();

    }
}
