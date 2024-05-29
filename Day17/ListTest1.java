package Day17;

import java.util.ArrayList;

class A{
    int a;
    int b;
    A(int a, int b){
        this.a = a;
        this.b = b;
    }
    void print(){
        System.out.println("a: "+a+", b: "+b);
    }
}

public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<A> list = new ArrayList<A>();
        for(int i = 0;i<10;i++){
            A a = new A(i,i+1);
            list.add(a);
        }
        for(int i = 0;i<list.size();i++){
            list.get(i).print();
        }
    }
}
