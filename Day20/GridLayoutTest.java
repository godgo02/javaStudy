package Day20;

import javax.swing.*;
import java.awt.*;

class GridLayout1 extends JFrame{
    GridLayout1(){
        Container ct = getContentPane();
        GridLayout gl = new GridLayout(4,5,10,10);
        ct.setLayout(gl);
        for(int i = 1;i<=20;i++){
            ct.add(new JButton("버튼"+i));
        }
        setTitle("GridLayoutTest1");
        setSize(800,800);
        setVisible(true);
    }
}

public class GridLayoutTest {
    public static void main(String[] args) {
        new GridLayout1();
    }
}
