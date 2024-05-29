package Day12;

import java.util.Random;
import java.util.Scanner;

class Fish{

}

class Hosu{
	Fish[][] f = new Fish[5][5];
	
	Hosu() {
		Random r = new Random();
		for(int i = 0;i<3;i++) {
			int h = r.nextInt(5);
			int k = r.nextInt(5);

			if(f[h][k] != null) {
				i--;
			}
			else {
				f[h][k] = new Fish();
			}
		}
	}
	
	Fish giveFish(int[] position) {
		return f[position[0]][position[1]];
	}
	
	void nullChange(int[] position) {
		f[position[0]][position[1]] = null;
	}
	
	void printHosu(int[] fishHuman) {
		for (int i = 0; i < f.length; i++)
		{
			for (int j = 0; j < f[i].length; j++)
			{
				if(fishHuman[0] == i && fishHuman[1] == j) {
					System.out.print("X");
				}
				else if (f[i][j] == null)
				{
					System.out.print("○");
				}
				else
				{
					System.out.print("●");
				}
			}
			System.out.println();
		}
	}
	
	void printHosu() {
		for (int i = 0; i < f.length; i++)
		{
			for (int j = 0; j < f[i].length; j++)
			{
				if (f[i][j] == null)
				{
					System.out.print("○");
				}
				else
				{
					System.out.print("●");
				}
			}
			System.out.println();
		}
	}
	
}

class Fisher{
	int[] position = new int[2];
	Scanner sc;
	Fish[] bowl = new Fish[3];
	
	Fisher() {
		sc = new Scanner(System.in);
		while(true) {
			System.out.print("행 입력 : ");
			position[0] = sc.nextInt();
			System.out.print("열 입력 : ");
			position[1] = sc.nextInt();

			if(position[0]>-1&&position[0]<5&&position[1]>-1&&position[1]<5) {
				break;
			}
		}
		
	}
	
	void reciveFish(Fish f) {
		if(f != null) {
			System.out.println("물고기를 잡았습니다.");
		}
		
		for(int i = 0;i<bowl.length;i++) {
			if(bowl[i] == null) {
				bowl[i] = f;
				break;
			}
		}	
	}
	
	boolean checkFish() {
		for(int i = 0;i<bowl.length;i++) {
			if(bowl[i] == null) {
				return true;
			}
		}
		return false;
	}
	
	void fishMove() {
		System.out.print("1.위 2.아래 3. 왼쪽 4. 오른쪽 : ");
		int num = sc.nextInt();
		if(num == 1) {
			position[0]--;
			if(position[0]<0) {
				System.out.println("더이상 위로 움직일 수 없습니다.");
				position[0] = 0;
			}
		}
		else if(num == 2) {
			position[0]++;
			if(position[0]>4) {
				System.out.println("더이상 아래로 움직일 수 없습니다.");
				position[0] = 4;
			}
		}
		else if(num == 3) {
			position[1]--;
			if(position[1]<0) {
				System.out.println("더이상 왼쪽으로 움직일 수 없습니다.");
				position[1] = 0;
			}
		}
		else if(num == 4) {
			position[1]++;
			if(position[1]>4) {
				System.out.println("더이상 오른쪽으로 움직일 수 없습니다.");
				position[1] = 4;
			}
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hosu h = new Hosu();
		h.printHosu();
		Fisher f = new Fisher();
		h.printHosu(f.position);
		f.reciveFish(h.giveFish(f.position));
		h.nullChange(f.position);
		while(f.checkFish()) {
			f.fishMove();
			f.reciveFish(h.giveFish(f.position));
			h.nullChange(f.position);
			h.printHosu(f.position);
		}
		System.out.println("물고기를 모두 잡았습니다.");
	}

}
