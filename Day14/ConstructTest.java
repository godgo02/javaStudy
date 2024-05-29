package Day14;


//this 본인 super 부모
class X{
    X(int a, int b){

    }
}
class Z extends X{
    Z(int a, int b){
        super(a,b);
    }
    Z(){
        super(5,6);
    }
}


public class ConstructTest {
}
