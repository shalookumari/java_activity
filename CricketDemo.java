
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class CricketDemo{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 ArrayList a =new ArrayList(); 
		 BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the Player's details: ");
		 System.out.println("Enter Player's name: ");
		 String name = (b.readLine());
		 a.add(name);
		 System.out.println("Enter Age: ");
		 int age = Integer.parseInt(b.readLine());
		 a.add(age);
		 System.out.println("Enter Country: ");
		 String country = (b.readLine());
		 a.add(country);
		 System.out.println("Player's details: ");
		 for (Object player: a){
		      System.out.println(player);
		    }
		 
		 System.out.println("Enter skill: ");
		 String skill = (b.readLine());
		 a.add(skill);
		 System.out.println("Enter the position to add the skill: ");
		 int post = Integer.parseInt(b.readLine());
		 a.remove(post);
		 System.out.println("Player's details: ");
		 for (Object player: a){
		      System.out.println(player);
		 }
				 
	}
	
	}


