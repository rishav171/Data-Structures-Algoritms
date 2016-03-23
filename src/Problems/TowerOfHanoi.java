package Problems;

public class TowerOfHanoi {
	
	public void move(int numberofdisc,char from,char to,char inter){
		if (numberofdisc==1){
			System.out.println("moving disc 1 from "+from+" to "+to);
		}
		else
		{
			
		move(numberofdisc-1,from,inter,to);
		
		System.out.println("moving "+numberofdisc+" from"+" "+from+" to "+to);
		move(numberofdisc-1,inter,to,from);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHanoi toh=new TowerOfHanoi();
		toh.move(3, 'A','C' , 'B');
	}

}
