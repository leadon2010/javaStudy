package lambda;

import java.util.Random;
import java.util.Scanner;

public class ball {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int problem[] = new int[3];
		int answer[] = new int[3];
		int cnt=0,i;
		
		while(cnt != 3)
		{
			int temp = ran.nextInt(10);
			
			for(i=0; i<cnt; i++)
				if(problem[i] == temp) break;
			if(i < cnt) continue;
			
			problem[cnt++] = temp;
	  	 }
		
		
		while(true)
		{
			cnt = 0;
			int strike=0, ball =0;
			System.out.print("first ");
			answer[0] = sc.nextInt();
			System.out.print("second ");
			answer[1] = sc.nextInt();
			System.out.print("third ");
			answer[2] = sc.nextInt();
			
			
			for(i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				if(answer[i] == problem[j])
				{
					if(i == j) strike++;
					else ball++;
				}
			}
			
			System.out.println(strike + "strike " + ball +"ball");
			if(strike == 3) break;
		}
		System.out.println("game over");
	}

}
