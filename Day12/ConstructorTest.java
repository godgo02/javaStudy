package Day12;

class Person{
    String name;
    float height;
    float weight;
    //생성자 오버로드(오버로딩)
    public Person(){}
    public Person(String pname){
        name = pname;
    }
    public Person(String pname, float pheight, float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
public class ConstructorTest {
}
