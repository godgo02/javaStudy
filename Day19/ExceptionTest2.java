package Day19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) throws IOException {
        FileReader fr;
        fr = new FileReader("a.txt");
        int i;
        while((i= fr.read())!= -1){
            System.out.print((char) i);
        }
        fr.close();
    }
}
