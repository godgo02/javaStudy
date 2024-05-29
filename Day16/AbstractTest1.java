package Day16;

abstract class Computer{
    abstract void display();
    abstract void typing();
}
class DeskTop extends Computer{
    @Override
    void display() {
        System.out.println("DeskTop display()");
    }

    @Override
    void typing() {
        System.out.println("DeskTop typing()");
    }
}

abstract class NoteBook extends Computer{
    @Override
    void display() {
        System.out.println("NoteBook display()");
    }
}

class MyNoteBook extends NoteBook{
    @Override
    void typing() {
        System.out.println("MyNoteBook typing()");
    }
}


public class AbstractTest1 {
    public static void main(String[] args) {
        //Computer c1 = new Computer(); 에러 추상화 클래스는 객체 생성 X
        Computer c2 = new DeskTop();
        //Computer c3 = new NoteBook(); 에러 추상화 클래스는 객체 생성 X
        Computer c4 = new MyNoteBook();
    }
}
