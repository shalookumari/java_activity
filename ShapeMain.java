import java.util.*;
public class ShapeMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Circle\r\n"+"\r\n"+"Square\r\n"+"\r\n"+"enter the shape");
		String s1=sc.nextLine();
		
		if(s1.equalsIgnoreCase("Circle"))
		{
			
			System.out.println("Enter the radius:");
			int n=sc.nextInt();
			Circle c=new Circle();
			c.calculateArea(n);
		}
		else if(s1.equalsIgnoreCase("Square")) {
			System.out.println("Enter the radius:");
			int n=sc.nextInt();
			Square c1=new Square();
			c1.calculateArea(n);
			
		}
	}
}