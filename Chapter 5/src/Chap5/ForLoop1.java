package Chap5;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int c=0,sum=0;
			for(int x=1,y=1;x<=10 && y<=21;x++,y+=2){
				System.out.println(x+"\t\t"+y);
				sum+=x;
				c++;
					
	}
			System.out.println("average="+(double)sum/c);
	}

}
