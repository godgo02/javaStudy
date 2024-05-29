package Day20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class RCom{
	private int[] com;
	RCom(){
		Random r = new Random();
		com = new int[3];

		for(int i = 0;i<com.length;i++) {
			com[i] = r.nextInt(9)+1;
			for(int j = 0;j<i;j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}

	int[] getCom() {
		return com;
	}
}

class UserCheck{
	int strike;
	int ball;
	boolean out;

	UserCheck(int[] com, int[] user){
		for(int i =0;i<user.length;i++) {
			for(int j = 0;j<com.length;j++) {
				if(user[i] == com[j]) { // ball or strike
					if(i == j) {
						strike++;
					}
					else {
						ball++;
					}
				}
			}
		}
	}

	int getStrike() {
		return strike;
	}
	int getBall() {
		return ball;
	}
	boolean getOut() {
		if(strike == 0 && ball == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}

class NumberBaseBallPanel extends JPanel{
	int strike = 0;
	int ball = 0;
	boolean out = false;

	void setData(int strike, int ball, boolean out) {
		this.strike = strike;
		this.ball = ball;
		this.out = out;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setFont(new Font("맑음 고딕",Font.BOLD,20));

		if(strike == 3)
			//strike의 값이 3이면 아래 명령어 실행
		{
			g.setFont(new Font("맑음고딕",Font.BOLD,60));
			//Font를 생성할때 "맑은 고딕"과 BOLD 사이즈는 60
			g.drawString("Home Run!!!!", 30, 180);
			//"Home Run!!!!"문장을 x : 30 y : 100에 문자열을 그린다.
		}

		else
		{
			//위 조건이 아니면 아래 명령어 실행
			if(strike == 0)
				//변수 strike가 0이면 아래 명령어 실행
			{
				g.setColor(Color.RED);
				//컬러 레드
				g.drawString("S", 30, 222);
				//"S"를 x : 30 y : 222에 문자열을 그린다.
				g.drawOval(50,200,30,30);
				//비워 있는 원을 x : 50 y: 200에 30사이즈에 빈원을 그린다.
				g.drawOval(90,200,30,30);
				//비워 있는 원을 x : 90 y: 200에 30사이즈에 빈원을 그린다.
			}
			else if(strike == 1)
				//변수 strike가 1이면 아래 명령어 실행
			{
				g.setColor(Color.RED);
				//컬러 레드
				g.drawString("S", 30, 222);
				//"S"를 x : 30 y : 222에 문자열을 그린다.
				g.fillOval(50,200,30,30);
				//꽉차 있는 원을 x : 50 y: 200에 30사이즈에 빈원을 그린다.
				g.drawOval(90,200,30,30);
				//비워 있는 원을 x : 90 y: 200에 30사이즈에 빈원을 그린다.
			}
			else
				//위의 두조건이 모두 아니면 아래 명령어 실행
			{
				g.setColor(Color.RED);
				//컬러 레드
				g.drawString("S", 30, 222);
				//"S"를 x : 30 y : 222에 문자열을 그린다.
				g.fillOval(50,200,30,30);
				//꽉차 있는 원을 x : 50 y: 200에 30사이즈에 빈원을 그린다.
				g.fillOval(90,200,30,30);
				//꽉차 있는 원을 x : 90 y: 200에 30사이즈에 빈원을 그린다.
			}

			if(ball == 0)
				//변수 ball이 0이면 아래 명령어 실행
			{
				g.setColor(Color.BLUE);
				//컬러 블루
				g.drawString("B", 30, 262);
				//"B"를 x : 30 y : 262에 문자열을 그린다.
				g.drawOval(50,240,30,30);
				//비워 있는 원을 x : 50 y: 240에 30사이즈에 빈원을 그린다.
				g.drawOval(90,240,30,30);
				//비워 있는 원을 x : 90 y: 240에 30사이즈에 빈원을 그린다.
				g.drawOval(130,240,30,30);
				//비워 있는 원을 x : 130 y: 240에 30사이즈에 빈원을 그린다.
			}
			else if(ball == 1)
			{
				g.setColor(Color.BLUE);
				//컬러 블루
				g.drawString("B", 30, 262);
				//"B"를 x : 30 y : 262에 문자열을 그린다.
				g.fillOval(50,240,30,30);
				//꽉차 있는 원을 x : 50 y: 240에 30사이즈에 빈원을 그린다.
				g.drawOval(90,240,30,30);
				//비워 있는 원을 x : 90 y: 240에 30사이즈에 빈원을 그린다.
				g.drawOval(130,240,30,30);
				//비워 있는 원을 x : 130 y: 240에 30사이즈에 빈원을 그린다.
			}
			else if(ball == 2)
			{
				g.setColor(Color.BLUE);
				//컬러 블루
				g.drawString("B", 30, 262);
				//"B"를 x : 30 y : 262에 문자열을 그린다.
				g.fillOval(50,240,30,30);
				//꽉차 있는 원을 x : 50 y: 240에 30사이즈에 빈원을 그린다.
				g.fillOval(90,240,30,30);
				//꽉차 있는 원을 x : 90 y: 240에 30사이즈에 빈원을 그린다.
				g.drawOval(130,240,30,30);
				//비워 있는 원을 x : 130 y: 240에 30사이즈에 빈원을 그린다.
			}
			else
			{
				g.setColor(Color.BLUE);
				//컬러 블루
				g.drawString("B", 30, 262);
				//"B"를 x : 30 y : 262에 문자열을 그린다.
				g.fillOval(50,240,30,30);
				//꽉차 있는 원을 x : 50 y: 240에 30사이즈에 빈원을 그린다.
				g.fillOval(90,240,30,30);
				//꽉차 있는 원을 x : 90 y: 240에 30사이즈에 빈원을 그린다.
				g.fillOval(130,240,30,30);
				//꽉차 있는 원을 x : 130 y: 240에 30사이즈에 빈원을 그린다.
			}

			if(out == false)
				//bool변수 아웃이 false이면 아래 명령어 실행
			{
				g.setColor(Color.ORANGE);
				//컬러 오렌지
				g.drawString("O", 30, 302);
				//"O"를 x : 30 y : 302에 문자열을 그린다.
				g.drawOval(50,280,30,30);
				//비워 있는 원을 x : 50 y: 280에 30사이즈에 빈원을 그린다.
			}
			else
				//위에 조건이 아니면 아래 명령어 실행
			{
				g.setColor(Color.ORANGE);
				//컬러 오렌지
				g.drawString("O", 30, 302);
				//"O"를 x : 30 y : 302에 문자열을 그린다.
				g.fillOval(50,280,30,30);
				//꽉차 있는 원을 x : 50 y: 280에 30사이즈에 빈원을 그린다.
			}

		}


	}
}

public class NumberBaseBallGUI extends JFrame implements ActionListener{
	NumberBaseBallPanel np;
	JTextField jt;
	JButton jb;
	RCom rc;
	
	NumberBaseBallGUI(RCom rc){
		
		this.rc = rc;
		System.out.println(rc.getCom()[0] + ", "+rc.getCom()[1] + ", "+rc.getCom()[2]);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		np = new NumberBaseBallPanel();
		jt = new JTextField(15);
		jb = new JButton("입력");
		jb.addActionListener(this);
		jb.setFont(new Font("맑은 고딕",Font.BOLD,18));
		
		np.add(jt);
		np.add(jb);
		
		c.add(np);
		
		setSize(400,400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberBaseBallGUI(new RCom());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int[] user = new int[3];
		String[] temp = jt.getText().split("");
		for(int i = 0;i<temp.length;i++) {
			user[i] = Integer.parseInt(temp[i]);
		}
		
		UserCheck u = new UserCheck(rc.getCom(), user);
		
		System.out.println(u.getBall()+", "+u.getStrike());
		
		np.setData(u.getStrike(),u.getBall(),u.getOut());
		np.repaint();
	}

}
