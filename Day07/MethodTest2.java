package Day07;

public class MethodTest2 {
    static int a;
    //1.주고받고
    static String printHello(String name){
        a = 10;
        return "안녕하세요"+name+"님";
    }

    //2.주고 안받고
    static int sum(){
        int a = 10;
        int b = 20;
        return  a+b;
    }

    //3. 안주고 받고
    static void outputName(String name){
        System.out.println("안녕하세요"+name+"님");
    }

    //4. 안주고 안받고
    static  void printBye(){
        System.out.println("바이!!!!!!");
    }


    public static void main(String[] args) {
        String result =printHello("홍길동");
        System.out.println(result);

        int hap =sum();
        System.out.println(hap);

        System.out.println(printHello("호랑이"));

        outputName("강아지");

        printBye();
    }
}
