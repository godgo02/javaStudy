package Day17;

class Box<T>{
    T vol;
    void setVolume(T v){
        vol = v;
    }
    T getVolume(){
        return vol;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<Integer>();
        ibox.setVolume(200);
        //ibox.setVolume(3.75); 실수이기때문에 에러
        System.out.println("<Ineger>박스의 부피는 : "+ibox.getVolume());
        Box<String> sbox = new Box<String>();
        sbox.setVolume("Hello");
        System.out.println(sbox.getVolume());
        Box<Double> dbox = new Box<Double>();
        //dbox.setVolume(200); 실수이기 때문에 정수 X
        dbox.setVolume(50.7);
        System.out.println("<Double>박스의 부피는 : "+dbox.getVolume());
    }
}
