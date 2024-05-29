package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListTest {
    public static void main(String[] args) {
        String[] name = {"kim","lee","park","jung","oh"};
        ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
        System.out.println("초기 값 : "+lname);
        lname.add("ha");
        System.out.println("ha 추가된 후의 값 : "+lname);
        lname.set(0,"김");
        lname.set(3,"곽");
        System.out.println("김,곽으로 변경된 값 : "+lname);
        Collections.shuffle(lname);
        System.out.println("셔플 값 : "+lname);
        Collections.sort(lname);
        System.out.println("정렬 값 : "+lname);
        System.out.println("5번째 요소의 값 : "+lname.get(4));
        Collections.fill(lname,"김");
        System.out.println("모두 김으로 변경 : "+lname);
        System.out.println("리스트 크기 : "+lname.size());
    }
}
