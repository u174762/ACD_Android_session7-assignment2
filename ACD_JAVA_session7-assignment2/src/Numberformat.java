import java.util.Scanner;

public class Numberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		
		Scanner num=new Scanner(System.in);
		
		System.out.println("this is the first element");
		x=num.nextInt();
		try {
			
			System.out.println("this is the second value");
			
			y= Integer.parseInt(num.next());
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("please enter a different value");
			y=num.nextInt();
			e.printStackTrace();
		}
		z=x+y;
		System.out.println("this is the value");
		System.out.println(z);
		

	}

}
